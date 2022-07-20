package StdAspr;

public class Main {
    public static void main(String[] args) {
        /*Student student = new Student("Ivan", "Ivanov",
                "Group", 4.5);
        Aspirant aspirant = new Aspirant("Petr", "Petrov",
                "Group2", 5, "Work1");
        Student aspirant1 = new Aspirant("Petrov", "Sidorov",
                "Group3", 5, "Work2");*/

        Student[] students = new Student[3];
        students[0] = new Student("Ivan", "Ivanov",
                "Group", 4.5);
        students[1] = new Aspirant("Petr", "Petrov",
                "Group2", 5, "Work1");
        students[2] = new Aspirant("Petrov", "Sidorov",
                "Group3", 5, "Work2");
        for (Student stud : students) {
            System.out.println(stud.getScholarship());
        }
    }
}
