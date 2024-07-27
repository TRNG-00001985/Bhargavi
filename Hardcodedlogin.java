package revature;
import java.util.Scanner;
public class Hardcodedlogin 
{
	private static final String username = "Bhagi";
	private static final String password = "password";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String inputUsername = scanner.nextLine();

        System.out.print("Enter password: ");
        String inputPassword = scanner.nextLine();

        if (authenticate(inputUsername, inputPassword)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Login failed!");
        }

        scanner.close();
    }

    
    private static boolean authenticate(String username, String password) {
        return username.equals(username) && password.equals(password);
    }
}

