package LinkedList;

import java.util.LinkedList;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        long startTime;
        long endTime;
        long elapsedTime;

        for(int i = 0; i < 10000000; i++) {
            linkedList.add(i);
            arrayList.add(i);
        }

//        Linkedlist
        startTime = System.nanoTime();

//        linkedList.get(0);
//        linkedList.get(9999999);
        linkedList.remove(9999999);
//        linkedList.remove(5000000);
        endTime = System.nanoTime();

        elapsedTime = endTime - startTime;

        System.out.println("LinkedList:\t" +elapsedTime + " ns");

//        Arraylist

        startTime = System.nanoTime();

//        arrayList.get(0);
//        arrayList.get(9999999);
        arrayList.remove(9999999);
//        arrayList.remove(5000000);

        endTime = System.nanoTime();

        elapsedTime = endTime - startTime;

        System.out.println("arrayList:\t" +elapsedTime + " ns");





    }
}
