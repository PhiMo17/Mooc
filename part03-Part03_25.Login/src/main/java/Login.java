
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[][] login = {
            {"alex", "sunshine"},
            {"emma", "haskell"}
        };

        System.out.println("Enter username: ");
        String inputUsename = scanner.nextLine();
        System.out.println("Enter password: ");
        String inputPassword = scanner.nextLine();
        
        int check=0;
        
        for(int i=0;i<login.length;i++){
            if(inputUsename.equals(login[i][0]) && inputPassword.equals(login[i][1])){
                System.out.println("You have successfully logged in!");
                check = 1;
            }            
        }
        if(check != 1){
            System.out.println("Incorrect username or password!");
        }
    }
}
