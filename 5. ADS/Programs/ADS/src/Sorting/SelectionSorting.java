
package Sorting;

public class SelectionSorting {
    public int[] sort(int arr[]){
        int size = arr.length;
        for (int i = 0; i < size-1; i++) {
            for (int j = i+1; j < size; j++) {
                if (arr[i]>arr[j]) {
                    swap(arr,i,j);
                }
            }
//            System.out.println(arr[i]);
        }
        return arr;
    }
    private void swap(int[] arr, int i, int j) {
        int d = arr[i];
        arr[i]=arr[j];
        arr[j]=d;
    }
    
    public static void main(String[] args) {
        SelectionSorting ss = new SelectionSorting();
        int arr[]={8,5,4,9,7,2,3};
        int a[] = ss.sort(arr);
        for (int i : a) {
            System.out.println(i);
        }
        
    }
}
