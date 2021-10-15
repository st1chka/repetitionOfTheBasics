package Repetition.Lesson2;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.addFirst("страна");
        linkedList.addLast("город");


        System.out.println(    linkedList.getFirst());
        System.out.println(    linkedList.getLast());

        linkedList.removeFirst() ;
        linkedList.removeLast() ;





        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Tom");
        arrayList.add("Alice");
        arrayList.add("Kate");
        arrayList.add("Sam");
        arrayList.add(0,"улица");
        arrayList.remove("Tom");


        if (arrayList.contains("Tom")){
            System.out.println("Tom найден");
        }else {
            System.out.println("Tom потерян");
        }
        System.out.println(arrayList);
    }
}
