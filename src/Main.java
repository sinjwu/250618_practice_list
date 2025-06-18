import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<String>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("DragonFruit");
        fruits.add("Mango");

        for(int i = 0; i < fruits.size(); i++) {
            System.out.println(fruits.get(i));
        }
        for(String fruit: fruits) {
            System.out.println(fruit);
        }
    }
}