import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        double yearSum=0;
        double yearAverage=0;
        int longestNameCount=0;
        String longestName="";        
        
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nameDOB = new ArrayList<>();
        while(true){
            String nameDaOB = scanner.nextLine();
            if(nameDaOB.equals("")){
                break;
            }
            nameDOB.add(nameDaOB);
        }
        for(int i=0;i<nameDOB.size();i++){
            String[] splits = nameDOB.get(i).split(",");
            
            yearSum += Integer.valueOf(splits[1]);
            if(longestNameCount < splits[0].length()){
                longestNameCount = splits[0].length();
                longestName = String.valueOf(splits[0]);
            }
        }
        yearAverage=yearSum/nameDOB.size();
        System.out.println("Longest name: "+longestName);
        System.out.println("Average of the birth years:"+yearAverage);
        
    }
}