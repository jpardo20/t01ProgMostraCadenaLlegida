import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class T01ProgMostraCadenaLlegida {
    public static void main(String[] args) throws IOException {
        final String FI = "fi";
        BufferedReader teclat =
            new BufferedReader(new InputStreamReader(System.in));
        String cadena;
        do{
            System.out.format("Entra una cadena (entra" +
                    " \"%s\" per acabar): ", FI);
            cadena = teclat.readLine();
            if (!(cadena.equals(FI))){
                System.out.format("Has entrat la cadena |%s|\n", cadena );
                System.out.format("\tque té un mida de" +
                        " %s caràcters.\n", cadena.length());
            } else
                System.out.print("\tFins la propera!\n");
        }while (!cadena.equals(FI));
    }
}
