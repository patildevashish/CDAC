/*
  Write a Java program to take a string as an input and reverse it using Stack.
 */
package lab_1;

import java.util.Stack;
import java.util.Scanner;

public class Que1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = sc.nextLine();
        Stack<Character> stack = new Stack<>();
        for (char ch : input.toCharArray()) {
            stack.push(ch);
        }
        String reversed = "";
        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }
        System.out.println("The reversed string is: " + reversed);
    }
}
