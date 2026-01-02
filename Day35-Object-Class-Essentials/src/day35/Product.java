package day35;

public class Product implements Comparable<Product>, Cloneable {

    private int id;
    private String name;
    private double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // 1️ toString()
    @Override
    public String toString() {
        return "Product{id=" + id +
               ", name='" + name +
               "', price=" + price + "}";
    }

    // 2️ compareTo() – natural ordering by price
    @Override
    public int compareTo(Product other) {
        return Double.compare(this.price, other.price);
    }

    // 3️ clone()
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // shallow copy
    }
}
