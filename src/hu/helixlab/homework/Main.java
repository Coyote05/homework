package hu.helixlab.homework;

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



    }
}