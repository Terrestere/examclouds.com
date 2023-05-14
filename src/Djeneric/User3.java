package Djeneric;

public class User3 {
    private static String login, password;

    public static class Querry {
        public  void printToLog() {
            System.out.printf("User with login %s and passwodr %s sent query\n",
                    login, password);
        }
    }

    public static void initialize(String login, String password) {
        User3.login = login;
        User3.password = password;
    }

    public static void main(String[] args) {
        initialize("Login3", "Password3");
        User3.Querry querry1 =new User3.Querry();
        querry1.printToLog();

    }
}
