package StdAspr;

public class Aspirant extends Student {
    String work;

    public Aspirant() {
    }

    public Aspirant(String firstName, String lastName, String group, double averageMark, String work) {
        super(firstName, lastName, group, averageMark);
        this.work = work;
    }

    @Override
    public int getScholarship() {
        if (getAverageMark() == 5) {
            return 200;
        } else {
            return 180;
        }
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }
}
