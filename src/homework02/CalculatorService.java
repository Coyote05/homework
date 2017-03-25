package homework02;


public class CalculatorService {

    int x;

    public CalculatorService(){
    }

    public void isItEven(int number){
        this.x = number;
    }

    public int getnumber(){
        return this.x;
    }

    public boolean paros(){
        return this.x % 2 == 0;
    }

}
