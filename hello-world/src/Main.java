public class Main {
    public static void main(String[] args) {

        String nome = "Lucas";
        System.out.println("Hello, " +nome);

        int a;
        int b = 2;
        a = 3;
        int soma = a + b;
        int subtracao = a - b;
        int multiplicacao = a * b;
        float divisao = (float) a / b;

        System.out.println(soma);
        System.out.println(subtracao);
        System.out.println(multiplicacao);
        System.out.println(divisao);

        boolean resultado = false;
        System.out.println(resultado);

        int nota = 100;
        String graduacao;

        if(nota >= 80) {
            graduacao = "A";
        } else if (nota < 80 && nota >= 70) {
            graduacao = "B";
        } else if (nota < 70 && nota >= 60) {
            graduacao = "C";
        } else if (nota < 60 && nota >= 0) {
            graduacao = "D";
        } else {
            graduacao = "";
        }

        switch (graduacao) {
            case "A":
            case "B":
                System.out.println("Aluno aprovado!");
                break;
            case "C":
            case "D":
                System.out.println("Aluno reprovado!");
                break;
            default:
                System.out.println("Graduação inválida!");
        }
    }
}