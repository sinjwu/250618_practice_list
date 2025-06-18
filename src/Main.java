import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<String>();

        fruits.add("Mango");
        fruits.add("Bbanana");
        fruits.add("DragonFruit");
        fruits.add("Apple");
        fruits.add("Cherry");
        fruits.add("Banana");

        if(fruits.contains("Apple")) {
            System.out.println("Apple은 포함되어 있습니다.");
        }
        Collections.sort(fruits);
        //for(int i = 0; i < fruits.size(); i++) {
        //    System.out.println(fruits.get(i));
        for(String fruit: fruits) {
            System.out.println(fruit);
        }
    }
}