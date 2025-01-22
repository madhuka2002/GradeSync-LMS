package com.gradesync;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class MongoDBSetup {
  public static void setup() {
    MongoDatabase database = MongoDBConnection.getDatabase();

    // Create Messages Collection
    MongoCollection<Document> messagesCollection =
        database.getCollection("messages");
    messagesCollection.createIndex(new Document("Timestamp", 1));
  }
}
