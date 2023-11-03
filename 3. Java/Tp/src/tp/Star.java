
package tp;

public class Star {
    public static void main(String[] args) {
        for(int i=0;i<20;i++) {
            for(int j=0;j<20;j++) {
                if((i==4 || i==10)&&(j>1 && j<19) ||((i<12 &&(j<11 && j>1)&&(i+j==12)))||((i<13 && i>2) &&((j>8 && j<19) &&(i+j==22))||((i>2&&i<13)) && ((j>8 && j<19) &&(j-i==8)))||((i>2 && i<13) && ((j>1 && j<12)&&(i-j==2)))) {
                    System.out.print(" *");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println(" ");

	}
    }
}
