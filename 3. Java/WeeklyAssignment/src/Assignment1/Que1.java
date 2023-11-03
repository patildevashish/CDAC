package Assignment1;

class Sound{
    void plesent(){
        System.out.println("Has pleasent sound");
    }
    
    void noise(){
        System.out.println("Produces noise");
    }
}
class Classic extends Sound{
    void display(){
        System.out.println("Classic music");
    }   
}

class Dj extends Sound{
    void show(){
        System.out.println("DJ");
    }
}

public class Que1 {
    public static void main(String[] args) {
        Classic c = new Classic();
        c.display();
        c.plesent();
        System.out.println("\n*******************************\n");
        Dj d = new Dj();
        d.show();
        d.noise();
    }
}