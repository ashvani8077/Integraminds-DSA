package Day1;

import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Age: ");
        int age=sc.nextInt();
        sc.close();

        if(age>=18){
            System.out.println("Eligible to vote");
        }
        else{
            System.out.println("Not eligible to vote");
        }

        System.out.println("Thank You...!");
    }
}
