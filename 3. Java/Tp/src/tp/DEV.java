
package tp;

public class DEV {

    public static void main(String[] args) {
        int j;
        for (int i = 0; i < 5; i++) {
            for ( j = 0; j < 5; j++) {
                if ((i==0&&j<5)||(i==0||j==1)||(i>0&&j>3)||(i==4&&j>=0)) {
                    System.out.print(" *");
                } 
                else {
                    System.out.print("  ");
                }
            }
            for ( j = 5; j < 12; j++) {
                if ((i==0&&j>=7)||(i>0&&j==7)||(i==2&&(j>7&&j<11))||(i==4&&j>7)) {
                    System.out.print(" *");
                } 
                else {
                    System.out.print("  ");
                }
            }
            for (j = 13; j < 19; j++) {
                if (i==0&&(j==14||j==18)||(i==2&&(j==15||j==17))||(i==4&&j==16)) {
                    System.out.print(" *");
                } 
                else {
                    System.out.print("  ");
                }
                
            }
            System.out.println("  ");
        }
    }
}
