
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        
        while(true){
            int input = scanner.nextInt();
            if(input == -1){
                break;
            }
            list.add(input);
        }
        double sum = 0;
        int count = 0;
        double median;
        
        for(int i = 0; i < list.size(); i++){
            sum += list.get(i);
            count ++;
        }
        median = sum / count;
        
        System.out.println("Average:" + median);
        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.
        
    }
}
