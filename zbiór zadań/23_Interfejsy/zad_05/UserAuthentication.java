package zad_05;

public class UserAuthentication implements Authentication {

    private String storedUsername = "user";
    private String storedPassword = "user1234";

    @Override
    public boolean login(String username, String password) {
        if (username.equals(storedUsername) && password.equals(storedPassword)) {
            System.out.println("User logged in successfully.");
            return true;
        }
        System.out.println("User login failed.");
        return false;
    }

    @Override
    public void logout() {
        System.out.println("User logged out.");
    }

    @Override
    public boolean resetPassword(String username, String oldPassword, String newPassword) {
        if (username.equals(storedUsername) && oldPassword.equals(storedPassword)) {
            storedPassword = newPassword;
            System.out.println("User password reset successfully.");
            return true;
        }
        System.out.println("User password reset failed.");
        return false;
    }
}
