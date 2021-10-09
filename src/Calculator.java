public class Calculator {

    public static void main(String[] args) {
//        short kleinsterDatentyp = 1;
//        int mittelDatentyp = 123;
//        long großerDatentyp = 13456987;
//        char a = 'a';
//        String Zeichenkette = "TEST";
//        System.out.println(kleinsterDatentyp + " " + mittelDatentyp + "  " + großerDatentyp + "  " + a + "  " + Zeichenkette);

        double c = add(3,4);
        System.out.println("Ergebnis add: " + c);
        double c1 = sub(3,4);
        System.out.println("Ergebnis sub: " + c1);
        double c2 = mul(3,4);
        System.out.println("Ergebnis mul: " + c2);
        double c3 = div(3,4);
        System.out.println("Ergebnis div: " + c3);
        double c4 = mod(3,4);
        System.out.println("Ergebnis mod: " + c4);


    }
        public static int add(int a, int b)
        {
            return a + b;
        }
        public static int sub(int a, int b)
        {
            return a - b;
        }
        public static int mul(int a, int b)
        {
            return a * b;
        }
        public static int div(int a, int b)
        {
            return a / b;
        }
        public static int mod(int a, int b)
        {
            return a % b;
        }

}
