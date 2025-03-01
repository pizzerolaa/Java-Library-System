# Library Management System

This is a **Library Management System** built using **Spring Boot** for the backend and a simple **HTML/JavaScript** frontend. The application allows librarians to manage books and patrons, including adding, removing, and searching for books, as well as registering and viewing patrons.

---

## Features

### Book Management
- **Add Books**: Librarians can add new books to the library's inventory by entering details such as title, author, ISBN, and the number of copies available.
- **Remove Books**: Allows the removal of books from the inventory if they are no longer available or needed.
- **Display Books**: Users can view a list of all books in the library, including their details.

### Patron Management
- **Register Patrons**: The system allows librarians to register new patrons, capturing essential information like name and ID.
- **View Patrons**: Librarians can view a list of registered patrons.

### Search Functionality
- Users can search for books by title, author, or ISBN.

---

## Technologies Used

- **Backend**: Spring Boot (Java)
- **Frontend**: HTML, JavaScript, Bootstrap
- **Database**: H2 (in-memory or file-based)
- **Build Tool**: Maven

---

## How to Run the Application

### Prerequisites
1. **Java Development Kit (JDK)**: Ensure you have JDK 17 or higher installed.
2. **Maven**: Ensure you have Maven installed.
3. **Web Browser**: To access the frontend.

### Steps to Run

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/pizzerolaa/Java-Library-System.git
   cd library-management-system
   ```
2. **Build the Project**:
   ```bash
   mvn clean install
   ```
3. **Run the Application**:
   ```bash
   mvn spring-boot:run
   ```
4. **Access the Application**:
   - Open your browser and go to:
   ```
   http://localhost:8080
   ```
   - Use the frontend to add books, register patrons, and view the library's inventory.

5. **Access the H2 Database Console**:
   - Open your browser and go to:
   ```
   http://localhost:8080/h2-console
   ```
   - Use the following settings:
     - **JDBC URL**: `jdbc:h2:mem:librarydb`
     - **Username**: `sa`
     - **Password**: (leave blank)

---

## Project Structure

```
src/
├── main/
│   ├── java/
│   │   └── com/
│   │       └── example/
│   │           └── demo/
│   │               ├── controller/        # REST controllers
│   │               ├── model/             # Entity classes (Book, Patron)
│   │               ├── repository/        # JPA repositories
│   │               ├── service/           # Business logic
│   │               └── DemoApplication.java # Main application class
│   ├── resources/
│   │   ├── static/                        # Frontend files (HTML, CSS, JS)
│   │   └── application.properties         # Configuration file
└── test/                                  # Unit tests
```

---

## Database Configuration

By default, the application uses an in-memory H2 database, which means data is lost when the application stops. To persist data, update the `application.properties` file to use a file-based H2 database:

```properties
spring.datasource.url=jdbc:h2:file:./data/librarydb
```

This will create a `librarydb.mv.db` file in the `data` folder, allowing data to persist across application restarts.

---

## API Endpoints

### Books
- `GET /api/library/books` - Get all books.
- `POST /api/library/books` - Add a new book.
- `DELETE /api/library/books/{id}` - Remove a book by ID.

### Patrons
- `GET /api/library/patrons` - Get all patrons.
- `POST /api/library/patrons` - Register a new patron.

