package Challenge_6;

public class main {
    public static void main(String[] args) {
        // Updated with new constructor that includes email
        Admin admin = new Admin(1, "HAPPY", "happy@example.com");
        User user = new User(2, "Jesse", "jesse@example.com");

        // DataSource implementations
        DataSource view = new View();
        DataSource update = new Update();
        DataSource delete = new Delete();

        // Performing operations
        admin.performOperation(view);     // View operation executed
        user.performOperation(update);    // Update operation executed
        admin.performOperation(delete);   // Delete operation executed
    }
}


