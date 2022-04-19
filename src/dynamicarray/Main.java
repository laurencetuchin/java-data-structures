package dynamicarray;

public class Main {
    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray();

        dynamicArray.add("A");
        dynamicArray.add("B");
        dynamicArray.add("C");

        dynamicArray.insert(0,"X");
//        dynamicArray.delete("A");
//        dynamicArray.delete("B");
        System.out.println("found at position: " + dynamicArray.search("C"));

        System.out.println(dynamicArray);
        System.out.println("size: " + dynamicArray.size);
        System.out.println("capacity: " + dynamicArray.capacity);
        System.out.println("empty: " + dynamicArray.isEmpty());
    }
}
