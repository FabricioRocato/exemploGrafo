import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> listaContatosVoce
                = new ArrayList<String>();

        listaContatosVoce.add("Bob");
        listaContatosVoce.add("Claire");
        listaContatosVoce.add("Alice");

        ArrayList<String> listaContatosBob
                = new ArrayList<String>();

        listaContatosBob.add("Anuj");
        listaContatosBob.add("Peggy");

        ArrayList<String> listaContatosClaire
                = new ArrayList<String>();

        listaContatosClaire.add("Jonny");
        listaContatosClaire.add("Thom");

        ArrayList<String> listaContatosAlice
                = new ArrayList<String>();

        listaContatosAlice.add("Peggy");

        System.out.println("CHAVE | NOME");

        System.out.println("EU | " + listaContatosVoce);
        System.out.println("Bob | " + listaContatosBob);
        System.out.println("Claire | " + listaContatosClaire);
        System.out.println("Alice | " + listaContatosAlice);


    }
}