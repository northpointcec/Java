package string;

import java.util.Scanner;

public class Trim {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine().toLowerCase().trim();
        if(name.equals("hyderabad")) {
            System.out.println("Hello hyderabadi, Aadaab...");
        }else if(name.equals("bangalore")) {
            System.out.println("Hello kannadiga, namaskara...");
        }else if(name.equals("chennai")) {
            System.out.println("Hellow madrasi, vanakkam...");
        }else {
            System.out.println("please enter valid city name");
            
        }
        sc.close();
    }
}
