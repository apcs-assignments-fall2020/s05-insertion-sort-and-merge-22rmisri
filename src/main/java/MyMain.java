import java.util.ArrayList;

public class MyMain {

    // Sorts the ArrayList using insertion sort
    public static ArrayList<Integer> insertionSort(final ArrayList<Integer> list) {
        final ArrayList<Integer> new_list = new ArrayList<Integer>();
        new_list.add(list.get(0));
        for (int i = 0; i < list.size()-1; i++) {
            for (int j = 0; j < new_list.size(); j++) {
                if (list.get(i + 1) < new_list.get(j)) {
                    new_list.add(j, list.get(i+1));
                    break;
                }
                else if (j == new_list.size()-1) {
                    new_list.add(list.get(i+1));
                    break;
                }
            }
        }
        return new_list;
    }
    // Merges two sorted arrays into one large combined
    // sorted array
    // You may assume arr1 and arr2 are the same length
    public static int[] merge(final int[] arr1, final int[] arr2) {
        int arr1idx = 0;
        int arr2idx = 0;
        int newarridx = 0;
        final int[] newarr = new int[arr1.length + arr2.length];
        while (arr1idx < arr1.length && arr2idx < arr2.length) {
            if (arr2[arr2idx] < arr1[arr1idx]) {
                newarr[newarridx] = arr2[arr2idx];
                arr2idx++;
            } else {
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

    public static void main(final String[] args) {
        // You can test your code here
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(7);
        list.add(3);
        list.add(9);
        list.add(4);
        System.out.println(insertionSort(list));
        

    }
}
