package InsertionSort;

public class InsertionSort {
    public static void main(String[] args) {
        int array[] = {9,1,8,7,2,4,6,5};

        insertionSort(array);

        for(int i : array) {
            System.out.println(i + " ");
        }
        
        
    }

    private static void insertionSort(int[] array) {
        for(int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i - 1;

            while(j >= 0 && array[j] > temp) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp;
        }
    }
}
