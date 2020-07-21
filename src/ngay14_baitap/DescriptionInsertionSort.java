package ngay14_baitap;

public class DescriptionInsertionSort {
    public static void main(String[] args) {
        int[] arr = {2,6,5,4,8,9,1,0,2,-2,-6,-9,-11,65};
        System.out.println("Elements of array : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%5d",arr[i]);
        }
        System.out.println();
        for (int i = 1; i < arr.length; i++) {
            int currentElement = arr[i];
            System.out.printf("Chon phan tu thu %d la %d de them vao danh sach con ",i,currentElement);
            int k;
            for (k = i-1; k >=0 && arr[k] > currentElement ; k--) {
                arr[k+1] = arr[k];
            }
            arr[k+1] = currentElement;
            for (int j = 0; j <= i ; j++) {
                System.out.printf("%5d",arr[j]);
            }
            System.out.println();
        }
    }
}
