class User {
    int id;
    String name;

    // Parameterized constructor
    User(int userId, String userName) {
        // Assign the parameter values the class attributes 
        id = userId;
        name = userName;
}
}

public class ParameterizedConstructor {
    public static void main(String[] args) {
        // Create an instance of User using the parameterized constructor
        User user1 = new User(101, "Alice");

        System.out.println("User ID: " + user1.id); // Output: User ID: 101
        System.out.println("User Name: " + user1.name); // Output: User Name: Alice
    }
}
