/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment1;

class Parent{
    int x;
    void Show() {
        System.out.println("Parent method is called");
    }
}
class Child extends Parent{
    @Override
    void Show() {
	System.out.println("Child method is called");
    }
}
public class Que5 {

    public static void main(String[] args) {
	Parent p= new Child();
	p.x=100;
	p.Show();

	Child c= (Child)p;
	c.Show();
	System.out.println("from parent class :"+ c.x );
    }
}
