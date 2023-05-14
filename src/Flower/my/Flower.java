package Flower.my;

public class Flower {
    private String proiz;
    private int srokHran;
    private double price;

    public Flower() {
    }

    public Flower(String proiz, int srokHran, double price) {
        this.proiz = proiz;
        this.srokHran = srokHran;
        this.price = price;
    }

    public String getProiz() {
        return proiz;
    }

    public void setProiz(String proiz) {
        this.proiz = proiz;
    }

    public int getSrokHran() {
        return srokHran;
    }

    public void setSrokHran(int srokHran) {
        this.srokHran = srokHran;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
