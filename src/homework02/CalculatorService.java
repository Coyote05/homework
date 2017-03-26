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

    /*Masodik feladat*/

    int x;
    int y;
    char operator;
    int result;

    public void setX(int paraX) {
        this.x = paraX;
    }

    public int getX() {
        return this.x;
    }

    public void setY(int paraY) {
        this.y = paraY;
    }

    public int getY() {
        return this.y;
    }

    public void setOperator(char idOperator) {
        this.operator = idOperator;
    }

    public char getOperator() {
        return this.operator;
    }

    public int calculate() {


            switch (operator) {
                case '+':
                    result =  this.x + this.y;
                break;
                case '-':
                    result = this.x - this.y;
                break;
                case '*':
                    result = this.x * this.y;
                break;
                case '/':
                    result = this.x / this.y;
                break;

                default:
                    System.out.println("\tNem a következő karakterek egyike: +,-,*,/!");
            }

            return result;

        }

}