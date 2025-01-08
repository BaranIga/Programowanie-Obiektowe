package zad_05;

public class AdminAuthentication implements Authentication {
    private String storedUsername = "admin";
    private String storedPassword = "admin123";

    @Override
    public boolean login(String username, String password) {
        if (username.equals(storedUsername) && password.equals(storedPassword)) {
            System.out.println("Admin logged in successfully.");
            return true;
        }
        System.out.println("Admin login failed.");
        return false;
    }

    @Override
    public void logout() {
        System.out.println("Admin logged out.");
    }

    @Override
    public boolean resetPassword(String username, String oldPassword, String newPassword) {
        if (username.equals(storedUsername) && oldPassword.equals(storedPassword)) {
            storedPassword = newPassword;
            System.out.println("Admin password reset successfully.");
            return true;
        }
        System.out.println("Admin password reset failed.");
        return false;
    }
}
