package by.bntu.fitr.povt.coffeebaby.model;

public abstract class Stone {
    private double weigth;
    private double price;


    public Stone()
    {};

    public Stone(double weigth, double price) {
        this.weigth = weigth;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getWeigth() {
        return weigth;
    }

    public void setWeigth(double weigth) {
        this.weigth = weigth;
    }

    @Override
    public String toString() {
        return "Stone{" +
                " | Weigth = " + String.format("%.2f", weigth) +
                " | Price = " + String.format("%.1f", price) +
                "}\n";
    }
}
