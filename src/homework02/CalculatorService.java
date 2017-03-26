package homework02;

import java.util.Random;

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

        /*Negyedik feladat*/

        float min = 25.0f;
        float max = 50.0f;

        Random generator = new Random();

        public float num = generator.nextFloat() * (max - min) + min;

        public boolean even(float num){

            return num == (int)num;
        }

        /*Ötödik feladat*/


        Random generated = new Random();

        public int num1 = generated.nextInt(100+150);
        public int num2 = generated.nextInt(100+150);

        public int result2;

        public int bigger(){
            if((num1 > num2 && num1 % 2 == 0) || (num1 < num2 && num1 % 2 == 0)){
                result2 = num1;
            }
            else if(num2 > num1 && num2 % 2 != 0){
                result2 = num2;
            }
            else{
                result2 = num1 + num2;
            }
            return result2;
        }

}