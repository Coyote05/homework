package homework02;


public class CalculatorService {

    int a;

    public CalculatorService(){
    }

    public void isItEven(int number){
        this.a = number;
    }

    public int getnumber(){
        return this.a;
    }

    public boolean paros(){
        return this.a % 2 == 0;
    }
}
