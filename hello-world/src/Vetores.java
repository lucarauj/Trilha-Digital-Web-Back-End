public class Vetores {

    public static void main(String[] args) {

        int[] numeros = new int[5];
        numeros[0] = 5;
        numeros[1] = 4;
        numeros[2] = 3;
        numeros[3] = 2;
        numeros[4] = 1;

//        System.out.println(numeros.length);

        for (int i = 0; i < numeros.length ; i++) {
            System.out.println(numeros[i]);
        }

        double[] outrosNumeros = {1.1,2.2,3.3,4.4,5.5};

        for (int i = 0; i < outrosNumeros.length ; i++) {
            System.out.println(outrosNumeros[i]);
        }

        // Verificando o maior e menor número em um Array:

        int[] array = {9,10,12,25,2};
        int maior = array[0];
        int menor = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > maior) {
                maior = array[i];
            }
            if (array[i] < menor) {
                menor = array[i];
            }
        }
        System.out.println("Menor: " + menor);
        System.out.println("Maior: " + maior);
    }
}
