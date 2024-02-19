package selfStudy01;

public class Email {

    public static void main(String[] args) {

        String email = "craig_federighi@apple.com";

        String firstName = email.substring(0, email.indexOf('_'));
        String lastName = email.substring(email.indexOf('_')+1,email.indexOf('@'));
        String domain = email.substring(email.indexOf('@')+1,email.lastIndexOf('.'));


        System.out.println("First name: " + firstName.substring(0,1).toUpperCase() + firstName.substring(1));
        System.out.println("Last name: " + lastName.substring(0,1).toUpperCase() + lastName.substring(1));
        System.out.println("Domain: " + domain);




    }
}

/*
9. Create a class called EmailTask2.
   Assume that the email address is constructed by the person's first name and followed by an underscore and last name.

   Write a program that will print out information about the user based on email. Print first name, last name, and domain.

   First and Last names should be printed in the proper format - uppercase first letter and remaining lowercase.

           Ex:
               input:
                   craig_federighi@apple.com

            Output:
                First name: Craig
                Last name: Federighi
                Domain: apple
 */
