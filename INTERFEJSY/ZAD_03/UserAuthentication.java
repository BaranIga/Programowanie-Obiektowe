public class UserAuthentication implements Authentication {

    String username;
    String password;

    public UserAuthentication(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public boolean login(String username, String password) {
        if (this.username.equals(username) && this.password.equals(password)) {
            System.out.println("yess");
            return true;
        }
        else {
            System.out.println("nooo");
            return false;
        }
    }

    @Override
    public void logout() {
        System.out.println("wylogowano :)");
    }

    @Override
    public boolean resetPassword(String username, String oldPassword, String newPassword) {
        if (!this.username.equals(username) || !this.password.equals(password)) {
            System.out.println("nooo");
            return false;
        }
        else {
            System.out.println("ustaw nowe hasło");
            this.password = newPassword;
            return true;
        }
    }
}
