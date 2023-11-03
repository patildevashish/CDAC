
package lab11;


public class ReverseString {
    public static void main(String[] args) {
        String s="Beautiful";
        char a[]=s.toCharArray();
        System.out.println("Reverse order=");
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                
                    char temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                   
            }
            System.out.print(a[i]+" ");
        }

    }
}
