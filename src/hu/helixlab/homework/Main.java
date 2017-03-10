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

    }
}