public class Funcoes {

    public static void main(String[] args) {

        saudacao("Lucas");
        System.out.println(soma(2,3));

    }

    public static void saudacao(String nome) {
        System.out.println("Hello, " + nome);
    }

    public static int soma(int a, int b) {
        return a + b;
    }
}
