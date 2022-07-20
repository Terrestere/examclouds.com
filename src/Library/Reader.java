package Library;


public class Reader {
    private String FIO;
    private int number;
    private String nomerFaka;
    private String bornDate;
    private String telephone;


    Reader(String FIO, int number, String nomerFaka, String bornDate, String telephone) {
        this.FIO = FIO;
        this.number = number;
        this.nomerFaka = nomerFaka;
        this.bornDate = bornDate;
        this.telephone = telephone;
    }


    Reader() {

    }

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getNomerFaka() {
        return nomerFaka;
    }

    public void setNomerFaka(String nomerFaka) {
        this.nomerFaka = nomerFaka;
    }

    public String getBornDate() {
        return bornDate;
    }

    public void setBornDate(String bornDate) {
        this.bornDate = bornDate;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void takeBook(int number) {
        System.out.println(this.FIO + " взял " + number + " книг.");
    }

    public void takeBook(String... books) {
        System.out.println(this.FIO + " взял следующие книги: ");
        for (String book : books) {
            System.out.println(book);
        }
        System.out.println();
    }

    public void takeBook(Book... books) {
        System.out.println(this.FIO + " взял следующие книги:");
        for (Book book : books) {
            System.out.println(book.getName() + ", автор - " + book.getAuthor());
        }
        System.out.println();
    }

    public void returnBook(int number) {
        System.out.println(this.FIO + " вернул " + number + " книги.");
    }

    public void returnBook(String... books) {
        System.out.println(this.FIO + " вернул следующие книги: ");
        for (String book: books) {
            System.out.println(book);
        }
        System.out.println();
    }

    public void returnBook(Book... books) {
        System.out.println(this.FIO + " вернул следющие книги: ");
        for (Book book: books) {
            System.out.println(book.getName() + ", автор - " + book.getAuthor());
        }
        System.out.println();
    }

    public String getInfo() {
        return "{" + "FIO = ' " + FIO + '\'' + ", number = " + number + ", faculty='" +
                nomerFaka + '\'' +
                ", dob='" + bornDate + '\'' +
                ", phone='" + telephone + '\'' +
                '}';
    }
}
