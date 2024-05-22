package DataStructure.Sorting_Algorithms;

public class QuickSort {
    public static void main(String[] args) {
        int []arr={20,100,30,70,10,40,80,60,35};
        quickSort(arr, 0, arr.length-1);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    private static void quickSort(int[] arr, int p, int r) {
        if(p<r){
            int q = partition(arr, p, r);
            quickSort(arr, p, q-1);
            quickSort(arr, q+1, r);
        }
    }

    public static int partition(int arr[], int p, int r) {
        int pivot = arr[r];
        int i = p - 1;
        for (int j = p; j < r; j++) {
            if(arr[j] <= pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[r];
        arr[r] = temp;
        return i + 1;
    }
}
