public class Passwort {

    private String password;

    public Passwort(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public boolean passwortCheck() {

        if (password.length() >=8) {
            return true;
        }
            else return false;

    }

}
