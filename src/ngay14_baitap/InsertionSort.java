package ngay14_baitap;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {2,6,5,4,8,9,1,0,2,-2,-6,-9,-11,65};
        insertionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int currentElement = arr[i];
            int k;
            for (k = i-1; k >=0 && arr[k] > currentElement ; k--) {
                arr[k+1] = arr[k];
            }
            arr[k+1] = currentElement;
        }
    }
}
