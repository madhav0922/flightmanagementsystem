package flightmanagementsystem.Model.User;

public class User {
    String userId;
    String name;
    float funds;

    User() {
        // default constructor
    }

    public User(String name, String userId, float funds) {
        this.name = name;
        this.userId = userId;
        this.funds = funds;
    }

    public void addUser(String userId, String name, float funds) {
        User user = new User(name, userId, funds);
        System.out.println("New user created " + " \n name : " + user.name + " \n userId : " + user.userId
                + "\n funds : " + user.funds); // could have also generated getters and setters.
    }

    // whenever we login a token should be generate and a session should be stored in the repo
    // 
}