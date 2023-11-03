package Interface;

public interface StudentInter {
    int a = 10; // public static final int a = 10;
    
    void showName(String name);   //public abstract void showName();
    void showAge(int age);
    
    default void course(){
        System.out.println("Default Method of interface");
        System.out.println("Private non static method"+exam());
    }
    static void institute(){
        System.out.println("This is static method of interface"+city());
    }
    private String exam(){
        return "CET";
    }
    private static String city(){
        return "Nagpur";
    }
}
