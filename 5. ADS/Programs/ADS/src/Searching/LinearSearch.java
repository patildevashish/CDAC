
package Searching;

public class LinearSearch {
    public int Search(int arr[],int size,int key){
        int i;
        for (i = 0; i < size; i++) {
            if (arr[i]==key) {
                return 1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int page_no[] = {86,91,34,50,0};
        int key = 0;
        
        LinearSearch obj = new LinearSearch();
        if (obj.Search(page_no, page_no.length, key)==1) {
            System.out.println("Search Found");
        }
        else
            System.out.println("Search not found");
    }
}
