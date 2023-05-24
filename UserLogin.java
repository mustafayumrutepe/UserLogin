import java.util.Scanner;

public class UserLogin {
    public static void main(String[] args) {
        String UserName, Password, Choice, NewPassword;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your username : ");
        UserName = input.nextLine();
        System.out.println("Please enter your password : ");
        Password = input.nextLine();
        if (UserName.equals("mustafa") && Password.equals("123")) {
            System.out.println("You are login");
        } else {
            System.out.println("Your login information is wrong\nDo you want to reset your password?\nWrite \"yes\" or \"no\"");
            Choice = input.nextLine();

            if (Choice.equals("yes")) {
                System.out.println("Please enter your new password : ");
                NewPassword = input.nextLine();
                if (NewPassword.equals("123")) {
                    System.out.println("Could not create password, please enter another password.");
                } else {
                    System.out.println("Password created");
                }

            }
            else if (Choice.equals("no")){
                System.out.println("Your password has not been changed ");
            }
            else{
                System.out.println("You entered an undefined expression. Please write \"yes\" or \"no\"");
            }
        }

    }
}
