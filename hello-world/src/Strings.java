import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class Strings {

    public static void main(String[] args) {

        String nome = "Lucas";
        System.out.println(nome.toUpperCase());
        System.out.println(nome.toLowerCase());
        System.out.println(nome.length());

        String outroNome = "lucas";

        System.out.println(nome.equalsIgnoreCase(outroNome));

        LocalDate hoje = LocalDate.now();
        Locale brasil = new Locale("pt", "BR");
        System.out.println(hoje);
        System.out.println(hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil));
    }
}
