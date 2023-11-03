
package relation;


class Person{
    private String name;
    private Address address;
    
    public Person(String name, Address address){
        this.name = name;
        this.address = address;
    }
    void personDetails(){
        System.out.println("PErson name: "+name);
        System.out.println("PErson Address: "+address);
    }
}
class Address{
    private int houseNo;
    private String landMark;
    private String city;
    private String state;
    private String pincode;
    
    public Address(int houseNo, String landMark, String city, String state, String pincode){
        this.houseNo = houseNo;
        this.landMark= landMark;
        this.city = city;
        this.state = state;
        this.pincode = pincode;
    }

    @Override
    public String toString() {
        return "Address("+"houseNo="+houseNo+",landMark="+landMark+",city="+city+",state="+state+",pincode="+pincode+')';
    }
    
}
public class Association{
    public static void main(String[] args) {
        Address ad = new Address(101, "Hi-Tech", "Nagpur", "Maharashtra", "440030");
        Address ad1 = new Address(102, "Low-TEch", "Chandrapur", "Maharashrta", "550030");
        Person p = new Person("Ramesh", ad1);
        p.personDetails();
    }
}