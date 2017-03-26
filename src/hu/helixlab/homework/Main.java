package hu.helixlab.homework;

import homework02.CalculationHelper;
import homework02.CalculatorService;

public class Main {

    public static void main(String[] args) {

        /*
        Első feladat:
        -------------

        Deklaráltam két int típusú változót a téglalap oldalainak meghatározásához.
        A négyzet olyan speciális téglalap, amelyiknek minden oldala egyenlő.
        Csak négyzet esetén lehet a kerület és a terület egyenlő.
        */
        int a = 4;
        int b = 4;

        int area = a * b;
        int circumference = (a + b)*2;

        //Kiírattam a kerületet és területet, ezek kiszámítása után.

        System.out.println("Első feladat.");
        System.out.println("\t A téglalap területe: " + area + " cm^2");
        System.out.println("\t A téglalap kerülete: " + circumference + " cm");
        System.out.println();


        /*
        Második feladat
        ---------------

        Meghatároztam deciliterben egy térfogatértéket.
        */

        int volume = 3000;
        int ml = volume * 100;
        int cl = volume * 10;
        int l = volume / 10;
        int hl = volume / 1000;

        //Kiíratom a térfogatértéket különböző mértékegységekben.

        System.out.println("Második feladat.");
        System.out.println("\t" + volume + " dl = " + ml + " ml");
        System.out.println("\t" + volume + " dl = " + cl + " cl");
        System.out.println("\t" + volume + " dl = " + l + " l");
        System.out.println("\t" + volume + " dl = " + hl + " hl");
        System.out.println();


        /*
        Harmadik feladat
        ----------------

        A gömb sugarát int típusúnak deklarálom, értéke adott.
        A PI értékét konstansként rögzítem
        */

        int r = 3;
        final double PI = 3.14;

        //Kiszámítom a térfogatot a képlet alapján és kiíratom az eredményt: V = (4*r^3*PI)/3

        double volume2 = (4 * r * r * r * PI)/3;

        System.out.println("Harmadik feladat.");
        System.out.println("\t A " + r + " sugarú gömb térfogata: " + volume2);
        System.out.println();


        /*
        Negyedik feladat
        ----------------

        Deklaráltam int típusúként a Celsiust és a Fahrenheitet, majd értéket adtam nekik.
        */

        int fahrenheitValue = 70;
        int celsiusValue = 10;

        //A képlet alapján kiszámítom az adott fahrenheit hány Celsius foknak felel meg.
        //Az osztás elvégzéséhez erőltetnem kellett az 5 és a 9 double-ként kezelését.

        double celsius = (fahrenheitValue - 32) * (5d / 9d);
        double fahrenheit = 9d / 5d * celsiusValue + 32;

        System.out.println("Negyedik feladat.");
        System.out.println("\t" + celsiusValue + " Celsius = " + fahrenheit + " Fahrenheit");
        System.out.println("\t" + fahrenheitValue + " Fahrenheit = " + celsius + " Celsius");
        System.out.println();


        /*
        Ötödik feladat
        ----------------
        */

        System.out.println("Ötödik feladat.\n" );
        System.out.println("**************\n* Hello \t * \n* World \t * \n* in \t \t * \n* a \t \t * \n* frame \t * \n***************");
        System.out.println();


        /*
        Hatodik feladat
        ----------------
        */

        char character = 'd';
        int ascii = (int) character;

        System.out.println("Hatodik feladat.");
        System.out.println("\tA \'" + character + "\' karakter Ascii kódja: " + ascii);

        /*
        * Második feladatsor
        * Első feladat
        * ------------------
        * */

        System.out.println();
        System.out.println("Második feladatsor. Első feladat.\n" );

        CalculatorService calculatorService = new CalculatorService();

        System.out.println("\t" + calculatorService.isItEven(6));

        /*
        * Második feladat
        * ------------------
        * */

        System.out.println();
        System.out.println("Második feladat.\n" );

        System.out.println("\t" + calculatorService.calculate(6,2,'*'));

        /*
        * Harmadik feladat
        * ------------------
        * */

        System.out.println();
        System.out.println("Harmadik feladat.\n" );

        System.out.println("Adja meg x-et: ");

        System.out.println("Adja meg y-t: ");

        System.out.println("Adja meg a műveletet: ");

        CalculationHelper calculationHelper = new CalculationHelper();

        System.out.println("\t" + calculatorService.calculate(calculationHelper.c,calculationHelper.d,calculationHelper.o));






    }
    }
