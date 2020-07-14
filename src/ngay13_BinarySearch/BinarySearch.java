package ngay13_BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int value = 4;
        System.out.print("Vi tri cua gia tri " + value + "trong array la : ");
        System.out.println(binarySearch(arr,0,arr.length-1,value));

    }

    public static int binarySearch(int[] arr, int low, int high, int value) {
        if (high >= low) {
            int mid = low + (high-low)/2;
            if (arr[mid] == value) return mid;
            else if (arr[mid] > value) return binarySearch(arr, low, mid-1, value);
            return binarySearch(arr,mid+1, high, value );
        }
        return -1;
    }
}
