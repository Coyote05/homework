package homework02;


public class CalculatorService {

    public CalculatorService(){
    }

    public boolean isItEven(int number){

        return number % 2 == 0;
    }


    /*Masodik feladat*/

    int result;

    public int calculate(int x, int y, char operator) {

            switch (operator) {
                case '+':
                    result =  x + y;
                break;
                case '-':
                    result = x - y;
                break;
                case '*':
                    result = x * y;
                break;
                case '/':
                    result = x / y;
                break;

                default:
                    System.out.println("\tNem a következő karakterek egyike: +,-,*,/!");
            }

            return result;

        }

}