package day35;

public class ObjectMethodsDemo {

    public static void main(String[] args) throws CloneNotSupportedException {

        Product p1 = new Product(1, "Laptop", 75000);
        Product p2 = new Product(2, "Phone", 45000);

        // toString()
        System.out.println("toString(): " + p1);

        // compareTo()
        System.out.println("compareTo(): " + p1.compareTo(p2));

        // clone()
        Product cloned = (Product) p1.clone();
        System.out.println("Cloned Object: " + cloned);

        // getClass()
        System.out.println("Class Name: " + p1.getClass().getName());

        // == vs equals()
        System.out.println("p1 == cloned: " + (p1 == cloned));
        System.out.println("p1.equals(cloned): " + p1.equals(cloned));
    }
}
