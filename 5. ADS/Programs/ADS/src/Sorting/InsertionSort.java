package Sorting;

public class InsertionSort {
    public int[] sort(int arr[]){
        int size = arr.length;
        int value;
        int index;
        for (int i = 1; i < size; i++) {
           value = arr[i];
           index = i;
            while (index>0 && arr[index-1]>value) {                
                arr[index] = arr[index-1];
                index--;
            }
            arr[index] = value;
        }
        return arr;
    }
    public static void main(String[] args) {
        InsertionSort is = new InsertionSort();
        int arr[]={40,30,10,50,20};
        int a[] = is.sort(arr);
        for (int i : a) {
            System.out.println(i);
        }
    }
}
