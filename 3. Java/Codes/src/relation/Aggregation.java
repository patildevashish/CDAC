
package relation;
class College{
    private String name;
    private Department departs[];
    
    public College(String name, Department[] departs){
        this.name = name;
        this.departs = departs;
    }
    void collegeDetails(){
        System.out.println("College Details");
        System.out.println("Name: "+name);
        for (Department d : departs) 
            System.out.println(d);
        
    }
}
class Department{
    private String name;
    private int capacity;
    
    public Department(String name, int capacity){
        this.name  = name;
        this.capacity = capacity;
    }
    @Override
    public String toString() {
        return "Department("+"name="+ name +",capacity="+capacity+')';
    }
}
public class Aggregation {
    public static void main(String[] args) {
        //Department dept[] = (new Department["IT", 500])
    }

    
}

