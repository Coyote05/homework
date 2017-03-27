package homework02;

    /*Harmadik feladat*/

import java.util.Scanner;

public class CalculationHelper {

    public int scanning() {

            Scanner scanner = new Scanner(System.in);
            CalculatorService calculatorService = new CalculatorService();

            System.out.println("Adja meg x-et: ");
            int c = scanner.nextInt();

            System.out.println("Adja meg y-t: ");
            int d = scanner.nextInt();

            System.out.println("Adja meg a műveletet: ");
            char o = scanner.next().charAt(0);

            return calculatorService.calculate(c, d, o);

        }

    }






