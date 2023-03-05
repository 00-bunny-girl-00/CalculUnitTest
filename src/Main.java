public class Main {
    public static void main(String[] args) {
        Calcul calcul1 = new Calcul(10, 5);
        Calcul calcul2 = new Calcul(6, 4);
        Calcul calcul3 = new Calcul(3, 3);
        Calcul calcul4 = new Calcul(10, 2);
        Calcul calcul5 = new Calcul(10, 0);
        try {
            System.out.println(calcul1.sum());
            System.out.println(calcul2.subtraction());
            System.out.println(calcul3.multiplication());
            System.out.println(calcul4.division());
            System.out.println(calcul5.division());
        }
        catch (ArithmeticException e){
            System.out.println(e);
        }

    }
}