import java.util.Scanner;

public class Consoantes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] consoantes = new String[6];
        int quantidadeConsoantes = 0;

        int count = 0;
        do {
            System.out.println("letra: ");
            String letra = sc.next();

            if (!(letra.equalsIgnoreCase("a") |
                    letra.equalsIgnoreCase("e") |
                    letra.equalsIgnoreCase("i") |
                    letra.equalsIgnoreCase("o") |
                    letra.equalsIgnoreCase("u"))) {
                consoantes[count] = letra;
                quantidadeConsoantes++;
            }
            count++;

        } while (count < consoantes.length);

        System.out.println("consoantes: ");
        for (String consoante : consoantes) {
            if (consoante != null)
                System.out.println(consoante + " ");

        }
        System.out.println("quantidade de consoantes: " + quantidadeConsoantes);
        System.out.println(consoantes.length);
        sc.close();
    }
}
