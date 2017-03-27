package homework02;

    /*Harmadik feladat*/

import java.util.Scanner;

public class CalculationHelper {

    public int c;
    public int d;
    public char o;

    public void third() {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Adja meg x-et: ");
            c = scanner.nextInt();

            System.out.println("Adja meg y-t: ");
            d = scanner.nextInt();

            System.out.println("Adja meg a műveletet: ");
            o = scanner.next().charAt(0);
        }
    }




