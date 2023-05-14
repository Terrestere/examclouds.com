package Djeneric;

public class User1 {
    private String login, password;

    public class Querry {
        public  void printToLog() {
            System.out.printf("User with login %s and passwodr %s sent query\n",
                    login, password);
        }
    }

    public User1(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void createQuery() {
        Querry querry = new Querry();
        querry.printToLog();
    }

    @Override
    public String toString() {
        return "User1{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public static void main(String[] args) {
        User1 user1 = new User1("Login1", "password1");
        User1.Querry querry1 = user1.new Querry();
        querry1.printToLog();

        User1.Querry querry2 = new User1("Login2", "Password2").new Querry();
        querry2.printToLog();

        user1.createQuery();
    }
}
