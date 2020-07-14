package ngay11_baitap1;

import java.util.*;

public class TreeMapRun {
    public static void main(String[] args) {
        Map<String,Integer> map = new TreeMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String st = sc.nextLine();
        String[] arr = st.split(" ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i].toLowerCase();
            if (!map.containsKey(arr[i])) {
               map.put(arr[i],1);
            } else {
                int newValue = map.get(arr[i])+1;
                map.replace(arr[i],newValue);
            }
        }
        map.forEach((String,Integer)-> System.out.println("Word = " + String + ", Number = " + Integer));
    }

}
