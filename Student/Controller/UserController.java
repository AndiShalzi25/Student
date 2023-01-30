package Controller;

import Database.Database;
import Models.User;

public class UserController {

    public Database database = new Database();

    public void Login(String username, String password) {
        for (User user : database.getUsers()) {
            if (user.getUsername() == username && user.getPassword() == password) {
                if (user.getRole().equals("Admin")) {

                }

            }
        }
    }
}
