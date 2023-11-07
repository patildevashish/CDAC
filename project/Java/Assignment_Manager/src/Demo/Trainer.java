
package Demo;

import java.util.Scanner;

public class Trainer {
    private String name;
    Scanner sc = new Scanner(System.in);

    public Trainer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        System.out.println("Enter the name of trainer");
        name = sc.nextLine();
        return "Trainer name=" + name;
    }
    
    
}
