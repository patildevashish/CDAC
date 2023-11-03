
package Searching;


public class BinarySearch {
    int search(int arr[],int start,int end, int key){
        int mid;
        while (start<=end) {            
            mid = (start+end)/2;
            
            if (arr[mid]==key) {
                return 1;
            }
            else if (key>arr.length) {
                return 0;
            }
            else if (arr[mid]<key) {
                start = mid+1;
            }
            else{
                end = mid -1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int nu[]={10,23,45,70,90,100,111,123};
           int key = 240;
        int start =0;
        int end = nu.length;
        
        BinarySearch bs = new BinarySearch();
        if (bs.search(nu, start, end, key)==1) {
            System.out.println("Search found");
        } else {
            System.out.println("Search not found");
        }
    }
}
