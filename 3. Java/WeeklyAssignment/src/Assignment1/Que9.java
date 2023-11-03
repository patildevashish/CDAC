package Assignment1;

public class Que9
{
    public static void main(String[] args) {
       
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j <= 6; j++) {
                // print D
                if (j == 1 || ((i == 0 || i == 6-1) && (j > 1 && j < 6-2)) || (j == 6-2 && i != 0 && i != 6-1))
                    System.out.print("D");
                else
                    System.out.print(" ");
            }
            System.out.print(" ");
            for (int j = 0; j <= 6; j++) {
                // print P
                if (j == 1 || ((i == 0 || i == 6/2) && (j > 1 && j < 6-2)) || (j == 6-2 && i != 0 && i != 6/2 && i < 6-2))
                    System.out.print("P");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
