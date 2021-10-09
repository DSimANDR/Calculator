public class ArithmetischeOperationen
{
    //psvm+TAB
    //main+TAB
    //public static => bitte immer so verwenden
    //sout+TAB
    //soutv

    public static void main(String[] args)
    {
        //Ganzzahlen: byte, short, int, long
        //Dezimalzahlen: (float), double
        //Wahrheitstyp: boolean -> true, false
        //Character: char
        //Zeichenkette: String

        double pi; //Deklaration
        pi = 3.14; //Initialisierung


        int a = 5;
        int b = 10;

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(b/a);
        System.out.println(a*b);
        System.out.println(a % b);

        int c = 4;
        int r = c++;
        System.out.println(c);
        System.out.println(r);

        int z = 4;
        int p = ++z;
        System.out.println(z);
        System.out.println(p);
        printResult(200);
        printResult(add(2, 5));

    }
        //Methode -> Unterprogramm, Prozedur, Function, "Sub"
        // public status -> ist fix, wenn wir direkt in der main-Anwendung programmiert
        // Rückgabewert -> nochts -> void, spezieller Datentyp (int, double,...)
        // namen -> naming convention -> camelCase
        //Parameterliste -> Die Variablen, welche die Methode (ich) benötigt, um einen Auftrag zu erfüllen


        public static void printResult(int result)
        {
            System.out.println(result);
        }
        public static int add(int a, int b)
        {
            return a + b;
        }

}

