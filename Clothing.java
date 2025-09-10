package duke;

public class Clothing implements Comparable<Clothing> {

    public static final int minPrice = 10;
    public static final double tax = 0.2;

    private String description;
    private double price;
    private String size = "M";

    public Clothing(String description, double price, String Size) {
        this.description = description;
        this.price = price;
        this.size = size;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price * (1 + tax);
    }

    public void setPrice(double price) {
        if (price >= minPrice) {      //or this.price = (price > minPrice) ? price : minPrice;
            this.price = price;
        } else {
            this.price = minPrice;
        }

    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return getDescription() + ", " + getSize() + ", " + getPrice();
    }

    @Override
    public int compareTo(Clothing c) {
        return this.description.compareTo(c.description);
    }

}
