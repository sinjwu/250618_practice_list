import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<String>();

        fruits.add("Mango");
        fruits.add("Potato");
        fruits.add("DragonFruit");
        fruits.add("Apple");
        fruits.add("Cherry");
        fruits.add("Banana");
        fruits.add("Tomato");

        fruits.remove("Potato");
        fruits.remove(5);
        //Potato 삭제가 선행되어 Tomato의 배열 순서는 (6) → 5

        if(fruits.contains("Apple")) { //대소문자 구분
            System.out.println("Apple은 포함되어 있습니다.");
        }//List에 없는 거 입력 시 출력x
        Collections.sort(fruits);
        //for(int i = 0; i < fruits.size(); i++) {
        //    System.out.println(fruits.get(i));
        for(String fruit: fruits) {
            System.out.println(fruit);
        }
    }
}