import java.util.Scanner;

import javax.swing.plaf.TreeUI;

public class Pizza {

    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);
        String Choice;

        System.out.println("Welcome to Frank's Pizzeria");
    
        System.out.println("Add Pizzas [Y/N]");

        Choice = Input.next();

        System.out.println("Choice")

        if (Choice == "Y") {

            System.out.println("Pizza added");

        } 

    }

}