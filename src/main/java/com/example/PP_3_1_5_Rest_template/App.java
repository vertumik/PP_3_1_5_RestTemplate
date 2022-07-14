package com.example.PP_3_1_5_Rest_template;

import com.example.PP_3_1_5_Rest_template.Dto.User;

import java.util.List;

public class App {
    public static void main(String[] args) {
        Communication communication = new Communication();
        List<User> allUsers = communication.getAllUsers();

        User user = new User(3L, "James", "Brown", (byte) 25);
        communication.saveUsers(user);

        user.setName("Thomas");
        user.setLastName("Shelby");
        communication.updateUsers(user);

        communication.deleteUsers(3L);
    }
}
