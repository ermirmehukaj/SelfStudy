package selfStudy01;

import java.util.Scanner;

public class WebsiteAddress {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a website: ");
       String web = input.nextLine();

        if(web.startsWith("www.") && web.endsWith(".com")||web.endsWith(".edu")||web.endsWith(".gov")){
            System.out.println("Valid website");
        }else {
            System.out.println("Invalid website");
        }




    }
}

/*1. Create a class named WebsiteAddress, and write a program that can check if the given website is a valid website or not
        starts with: www.
        ends with: .com, .edu, .gov*/