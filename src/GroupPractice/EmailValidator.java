package GroupPractice;

public class EmailValidator {


    public static void main(String[] args) {
        String [] emails = {"test@cydeo.com",
                "test@cydeo.co.uk",
                "mike.smith@cydeo.com",
                "mike.smith@com",
                "@cydeo.com",
                "test@.com",
                "test@cydeo.",
                "test@@cydeo.com"

        };
        for (String eachemail : emails) {
            System.out.println(isValid(eachemail));
        }
    }

    public static boolean isValid(String email){


        int index1 = email.indexOf('@');
        if (index1 == -1 || email.indexOf('@', index1 + 1) != -1)
            return false;


        int index2 = email.lastIndexOf('.');
        if (index2 == -1)
            return false;


        if (index1 == 0 || index1 == email.length() - 1 || index2 == email.length() - 1)
            return false;

        if(index2 - index1 <= 1)
            return false;

        return true;


    }

}

   /* Your team has created a new bank website that requires email addresses to be validated. •
        The email string must contain only one '@' character. • The email string must contain an '.' character. •
        The '@' must contain at least one character in front of it. e.g. "a@cydeo.com" is valid while "@cydeo.com" is invalid. •
        The '.' and '@' must be in the appropriate places. e.g. "mike.smith@com" is invalid while "mike.smith@cydeo.com" is valid.
        For a given string, find a solution that writes true on the console if an email is valid and false if it is invalid.
        Examples: email = "test@cydeo.com" --> true email = "test@cydeo.co.uk --> true email = "mike.smith@cydeo.com --> true email = "mike.smith@com --> false email = "@cydeo.com" --> false email = "test@.com" --> false email = "test@cydeo." --> false email = "test@@cydeo.com" --> false */