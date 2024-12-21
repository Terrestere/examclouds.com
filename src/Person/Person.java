package Person;

public class Person {
    private String fullName;
    private int age;
    private boolean retired;

    void move(String fullName) {
        System.out.println("Этот " + fullName + " идет");
    }

    void talk(String fullName) {
        System.out.println("Этот " + fullName + " говорит");
    }

    protected Person() {

    }

    protected Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    protected Person(String fullName, int age, boolean retired) {
        this.fullName = fullName;
        this.age = age;
        this.retired = retired;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isRetired() {
        return retired;
    }

    public void setRetired(boolean retired) {
        this.retired = retired;
    }

    @Override
    public String toString() {
        return "Person {FullName =' " + fullName +'\'' +
                ", age= " + age + ", retired= " + retired + '}';
    }
}
