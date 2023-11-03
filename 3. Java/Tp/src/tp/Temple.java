
package tp;

public class Temple {
    public static void main(String[] args) {
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 5; j++) {
                if ((j<5&&i==6)||(j<5&&i==7)||(i>7&&j>2)||(i>7&&j<2)||(i<6&&j==2)||(i==1&&j==3)||(i==5&&j==3)||(i==5&&j==1)) {
                    System.out.print("  *");
                } 
                else {
                    System.out.print("   ");
                }
                
            }
            System.out.println("  ");
        }
    }
}
