package zad_05;

public class AuthenticationTest {
    public static void main(String[] args) {
        Authentication admin = new AdminAuthentication();
        Authentication user = new UserAuthentication();

        System.out.println("Testing Admin Authentication");
        admin.login("admin", "admin123");
        admin.resetPassword("admin", "admin123", "newAdmin123");
        admin.login("admin", "newAdmin123");
        admin.logout();

        System.out.println("----------------");

        System.out.println("Testing User Authentication");
        user.login("user", "user1234");
        user.resetPassword("user", "user1234", "newUser123");
        user.login("user", "newUser123");
        user.logout();

    }
}
