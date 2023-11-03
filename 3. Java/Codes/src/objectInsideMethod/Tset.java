package objectInsideMethod;

public class Tset {
    String objName;
    private static void display(){
        Tset t2 = new Tset("t2");
    }
    public Tset(String objName){
        this.objName = objName;
    }
    static void show(){
        Tset t1 = new Tset("t2");
        display();
    }
    
    @Override
    protected void finalize(){
        System.out.println(this.objName+" is free from memory");
    }
    public static void main(String[] args) {
        show();
        Runtime.getRuntime().gc();
    }
}
