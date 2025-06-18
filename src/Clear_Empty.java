import java.util.ArrayList;
import java.util.List;

public class Clear_Empty {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<String>();

        fruits.add("Mango");
        fruits.add("Potato");
        fruits.add("DragonFruit");
        fruits.add("Apple");
        fruits.add("Cherry");
        fruits.add("Banana");
        fruits.add("Tomato");

        int index = fruits.indexOf("Banana");
        System.out.println(index);
        int index1 = fruits.indexOf("Pineapple");
        System.out.println(index1); //List에 없으면 -1 출력
        fruits.set(1, "Orange");
        System.out.println(fruits.get(1));
        List<String> sliced = fruits.subList(0, 2);
        //0 ~ 1번 추출, hexString처럼 2번 미포함
        System.out.println(sliced);

        //isEmpty()는 true/false 값을 출력함
        System.out.println(fruits.size());
        System.out.println(fruits.isEmpty());
        fruits.clear();
        System.out.println(fruits.size());
        System.out.println(fruits.isEmpty());
    }
}