// print pattern in java of equilateral triangle
public class Pattern 
{
    void equilateral()
    {
        for (int i = 0; i < 5; i++)     //Blank space
        {
            for (int j = 4; j > i ; j--) // for star
            {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) 
            {
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
    }

    static public void main(String ar[])
    {
        Pattern p= new Pattern();
        p.equilateral(); 
    }
}
