package controllers;

import utils.FileHandler;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class AuthenticationController {
    private static final String USERS_FILE = "data/users.txt";

    public boolean authenticate(String email, String password) {
        String hashedPassword = hashPassword(password);
        for (String line : FileHandler.readFromFile(USERS_FILE)) {
            String[] parts = line.split(",");
            if (parts[0].equals(email) && parts[1].equals(hashedPassword)) {
                return true;
            }
        }
        return false;
    }

    public void registerUser(String email, String password, String role) {
        String hashedPassword = hashPassword(password);
        FileHandler.writeToFile(USERS_FILE, email + "," + hashedPassword + "," + role);
    }

    private String hashPassword(String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hash = md.digest(password.getBytes());
            StringBuilder hexString = new StringBuilder();
            for (byte b : hash) {
                hexString.append(String.format("%02x", b));
            }
            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
}
