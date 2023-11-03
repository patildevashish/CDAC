
package lab11;


public class CountVowCon {
    public static void main(String[] args) {
        String s="Devashish";
        
      char a[]=s.toCharArray();
      int count=0;
       int c1=0;
      for(int i=0;i<a.length;i++){
         
          if(a[i]=='a' || a[i]=='e' || a[i]=='i'|| a[i]=='o'|| a[i]=='u' ){
              System.out.println("vowels="+a[i]);
              count++;
          }else {
              System.out.println("consonant="+a[i]);
              c1++;
              
          }
          
      }
        System.out.println("Vowels count="+count);
         System.out.println("Consonant count="+c1);

    }
}