
package Sorting;

public class BubbleSort {
    public int[] sort(int arr[]){
        int size = arr.length;
        
        for (int i = 0; i < size-1; i++) {
            for (int j = 0; j < size-1-i; j++) {
                if (arr[j]>arr[j+1]) {
                    swap(arr,j,j+1);
                }
            }
        }
        return arr;
    }
    
    private void swap(int[] arr, int i, int j) {
        int d = arr[i];
        arr[i]=arr[j];
        arr[j]=d;
    }
    public static void main(String[] args) {
        BubbleSort bs = new BubbleSort();
        int arr[]={8,5,4,9,7,2,3};

        int a[] = bs.sort(arr);
        for (int i : a) {
            System.out.println(i);
        }
    }
}
