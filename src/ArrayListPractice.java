import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args){

    ArrayList<String> products = new ArrayList<>();

        products.add("macbook pro");
        products.add("wireless mouse");
        products.add("hp monitor");
        products.add("lenovo monitor");

        System.out.println("products using now");
        System.out.println(products);

        System.out.println(products.size());
        System.out.println("----");
        System.out.println(products.contains("macbook pro"));
        System.out.println(products.contains("magic mouse"));
        System.out.println("----");
        System.out.println(products.lastIndexOf("hp monitor"));
        System.out.println("----");
        System.out.println(products.isEmpty());
        System.out.println("----");
        System.out.println(products.remove("macbook pro"));
        System.out.println(products);
        products.add(0, "Macbook Pro");
        System.out.println(products);
        products.remove(3);
        System.out.println(products);
        products.add(3, "Lenovo Monitor");
        System.out.println(products);
        System.out.println("----");
        products.set(2, "HP Monitor");
        products.set(1, "Wireless Mouse");
        System.out.println(products);

    }

}
