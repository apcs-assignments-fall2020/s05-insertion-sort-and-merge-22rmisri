import java.util.ArrayList;

public class MyMain {

    // Sorts the ArrayList using insertion sort
    public static ArrayList<Integer> insertionSort(ArrayList<Integer> list) {
        ArrayList<Integer> new_list = new ArrayList<Integer>();
        new_list.add(list.get(1));
        for (int i = 0; i < list.size(); i++) {
                if (list.get(i) > new_list.get(i-1)) {
                    list.get()
                }
        }
        return null;
    }

     // Merges two sorted arrays into one large combined
     // sorted array
     // You may assume arr1 and arr2 are the same length
    public static int[] merge(int[] arr1, int[] arr2) { 
        int arr1idx = 0;
        int arr2idx = 0;
        int newarridx = 0;
        int [] newarr = new int[arr1.length + arr2.length];
        while (arr1idx < arr1.length && arr2idx < arr2.length) {
            if (arr2[arr2idx] < arr1[arr1idx]) {
                newarr[newarridx] = arr2[arr2idx];
                arr2idx++;
            }
            else {
                newarr[newarridx] = arr1[arr1idx];
                arr1idx++;
            }
            newarridx++;
        }
        while (arr1idx < arr1.length) {
            newarr[newarridx] = arr1[arr1idx];
            arr1idx++;
            newarridx++;
        }
        while (arr2idx < arr2.length) {
            newarr[newarridx] = arr2[arr2idx];
            arr2idx++;
            newarridx++;
        }
        return newarr;
    }

    public static void main(String[] args) {
        // You can test your code here
    }
}
