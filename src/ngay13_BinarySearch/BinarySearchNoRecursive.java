package ngay13_BinarySearch;

public class BinarySearchNoRecursive {
    public static void main(String[] args) {
        int[] arr = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
        System.out.println(binarySearch(arr, 2));
        System.out.println(binarySearch(arr, 11));
        System.out.println(binarySearch(arr, 79));
        System.out.println(binarySearch(arr, 1));
        System.out.println(binarySearch(arr, 5));
        System.out.println(binarySearch(arr, 80));
    }

    private static int binarySearch(int[] arr, int value) {
        int low = 0;
        int high = arr.length-1;
        while (high >= low) {
            int mid = (high + low)/2;
            if (value == arr[mid])
                return mid;
            else if (value < arr[mid])
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }
}
