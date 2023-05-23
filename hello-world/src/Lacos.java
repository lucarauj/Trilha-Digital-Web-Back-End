public class Lacos {

    public static void main(String[] args) {

        int tabuada = 9;
        for (int i = 1; i <= 10; i++) {
            System.out.println(tabuada + " x " +  i + " = " + (i*tabuada));
        }

        System.out.println("****************************************************************");

        //Todas as tabuadas:
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <=10; j++) {
                System.out.println(i + " x " +  j + " = " + (i*j));
            }
        }
    }
}
