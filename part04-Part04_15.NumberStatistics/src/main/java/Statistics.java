
public class Statistics {
    private int count;
    private int numberCount;
    public Statistics(){
        //Initialize the variable numberCount here
        this.numberCount = 0;
        this.count = 0;
    }
    
    public void addNumber(int number){
        //write code here
        this.numberCount += number;
        this.count ++;
        
    }
    
    public int getCount(){
        //write code here
        return count;
    }
    public int sum(){
        if(this.count != 0){
            return numberCount;
        }else{
            return 0;
        }
    }
    public double average(){
        if(this.count != 0){
            double numberCount = this.numberCount;
            double count = this.count;
            return numberCount / count;
        }else{
            return 0;
        }
    }
}
