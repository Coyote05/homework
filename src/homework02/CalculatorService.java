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

        /*Harmadik feladat*/

        float min = 25.0f;
        float max = 50.0f;

        Random generator = new Random();

        public float num = generator.nextFloat() * (max - min) + min;

        public boolean even(float num){

            return num % 2 == 0;
        }




}