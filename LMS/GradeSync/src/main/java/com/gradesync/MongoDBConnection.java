package com.gradesync;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import java.util.ArrayList;
import java.util.List;
import org.bson.Document;
import org.bson.conversions.Bson;

// Connections created by T
public class MongoDBConnection {
  private static final String CONNECTION_STRING =
      "mongodb+srv://sa:sa@gs-db.oze9d.mongodb.net/?retryWrites=true&w=majority&appName=gs-db";

  private static MongoClient mongoClient;
  private static MongoDatabase database;

  // Initialize the connection
  static {
    try {
      // Create MongoDB client
      mongoClient = MongoClients.create(CONNECTION_STRING);
      // Get the database instance
      database = mongoClient.getDatabase(
          "gradesync"); // Database name
      System.out.println("Connected to the database: " + database.getName());
    } catch (Exception e) {
      System.err.println("Failed to connect to MongoDB: " + e.getMessage());
    }
  }

  // Get the MongoDatabase instance
  public static MongoDatabase getDatabase() {
    return database;
  }
  
  public static void insertMessage(
      String studentID, String sender, String message) {
    MongoCollection<Document> messagesCollection =
        getDatabase().getCollection("messages");
    Document doc = new Document("studentID", studentID)
                       .append("sender", sender)
                       .append("message", message)
                       .append("timestamp", System.currentTimeMillis());
    messagesCollection.insertOne(doc);
  }

  public static List<Document> getMessagesByStudentID(String studentID) {
    MongoCollection<Document> messagesCollection =
        getDatabase().getCollection("messages");
    MongoCursor<Document> cursor =
        messagesCollection.find(new Document("studentID", studentID))
            .iterator();
    List<Document> messages = new ArrayList<>();
    while (cursor.hasNext()) {
      messages.add(cursor.next());
    }
    cursor.close();
    return messages;
  }

  public static List<String> getAllStudentIDsWithMessages() {
    MongoCollection<Document> messagesCollection =
        getDatabase().getCollection("messages");
    MongoCursor<String> cursor =
        messagesCollection.distinct("studentID", String.class).iterator();
    List<String> studentIDs = new ArrayList<>();
    while (cursor.hasNext()) {
      studentIDs.add(cursor.next());
    }
    cursor.close();
    return studentIDs;
  }
  // Change password for student
  public static boolean validateCurrentPassword(
      String studentID, String currentPassword) {
    MongoCollection<Document> studentsCollection =
        database.getCollection("students");
    Document studentDoc =
        studentsCollection.find(Filters.eq("StudentID", studentID)).first();

    if (studentDoc != null) {
      String storedPassword = studentDoc.getString("Password");
      return storedPassword.equals(
          currentPassword); // Check if stored password matches current password
    }
    return false;
  }

  public static void updatePassword(String studentID, String newPassword) {
    MongoCollection<Document> studentsCollection =
        database.getCollection("students");
    studentsCollection.updateOne(Filters.eq("StudentID", studentID),
        new Document("$set", new Document("Password", newPassword)));
  }
  // Close the MongoClient connection
  public static void closeConnection() {
    if (mongoClient != null) {
      mongoClient.close();
    }
  }
}