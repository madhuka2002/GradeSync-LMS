# GradeSync-LMS
Learning Management System created by using Apache NetBeans and MongoDB.

LMS (Learning Management System)

This is a Java-based Learning Management System application developed using Apache NetBeans. It provides features to manage students, teachers, courses, and academic activities efficiently.

Features

•	Student and teacher management.
•	Course creation and enrollment.
•	Profile editing and password management.
•	User-friendly interface for easy navigation.
Prerequisites

Before running the application, ensure that the following tools and software are installed:

1.	1. **Java Development Kit (JDK)**
   - Download and install the latest version of [JDK](https://www.oracle.com/java/technologies/javase-downloads.html).
   - Add the JDK bin directory to your system's PATH environment variable.

2.	2. **Apache NetBeans**
   - Download and install [Apache NetBeans](https://netbeans.apache.org/).
   - Ensure that NetBeans is configured to use the installed JDK.

3. **Database**
   - Ensure a supported database is installed and running (e.g., MySQL, PostgreSQL).
   - Set up the database schema and populate it using the provided SQL scripts (if any).
Installation

3.	1. **Clone or Extract the Project**
   - If you received this project as a RAR file, extract it to your desired location.
   - If hosted on a repository, clone it using:
     ```bash
     git clone <repository-url>
     ```

4.	2. **Import into Apache NetBeans**
   - Open Apache NetBeans.
   - Click on `File > Open Project`.
   - Browse to the extracted/cloned project folder and open it.

3. **Configure the Database**
   - Update the database connection settings in the project's configuration file (e.g., `config.properties` or similar).
   - Ensure the database credentials (username, password, URL) are correctly set.

4. **Build the Project**
   - In NetBeans, right-click on the project in the "Projects" window.
   - Select `Clean and Build`.
Running the Application

5.	1. **Start the Database Server**
   - Ensure your database server is running and accessible.

6.	2. **Run the Application**
   - In NetBeans, right-click the project in the "Projects" window.
   - Select `Run` or press `F6`.

3. **Access the Application**
   - If the application has a web-based interface, open your browser and navigate to the specified URL (e.g., `http://localhost:8080`).
   - If it is a desktop application, the interface will load directly.
Troubleshooting

•	**NetBeans Cannot Find the Main Class**
  - Verify the main class is correctly specified in the project's properties:
    - Right-click on the project in NetBeans, go to `Properties > Run`, and check the `Main Class` field.

•	**Database Connection Issues**
  - Ensure the database is running and accessible.
  - Double-check the connection settings in the configuration file.

•	**Dependency Errors**
  - Ensure all required libraries (e.g., `.jar` files) are added to the project.
  - Add missing dependencies via `Libraries` in NetBeans.
Contributing

7.	1. Fork the repository (if applicable).
8.	2. Create your feature branch:
   ```bash
   git checkout -b feature/YourFeature
   ```
3. Commit your changes:
   ```bash
   git commit -m "Add your feature"
   ```
4. Push to the branch:
   ```bash
   git push origin feature/YourFeature
   ```
5. Open a pull request.
License

This project is licensed under the [MIT License](LICENSE). 

For questions or feedback, feel free to contact the developer.
