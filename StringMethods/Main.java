import java.util.Scanner;

public class Main {

    public static void main(String [] args){

        //Implementing the substring and indexOf String methods

        String username;
        String email;
        String domain;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your email: ");
        email = scanner.next();
        username = email.substring(0, email.indexOf("@"));
        domain = email.substring(email.indexOf("@") + 1);
        System.out.println("Email: " + email);
        System.out.println("Username: " + username);
        System.out.println("Domain: " + domain);


    }

}
