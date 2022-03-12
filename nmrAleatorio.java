import java.util.Random;

public class nmrAleatorio {
    public static void main(String[] args) {
        Random random = new Random();

        int[] nmrAleatorio = new int[20];

        for (int i = 0; i < nmrAleatorio.length; i++) {
            int nmr = random.nextInt(100);
            nmrAleatorio[i] = nmr;
        }

        System.out.print("\nsucessores dos numeros aleatorios: ");
        for (int nmr : nmrAleatorio) {
            System.out.println((nmr + 1) + " ");
        }
        System.out.println("antecessores de numeros aleatorios: ");
        for (int nmr : nmrAleatorio) {
            System.out.println((nmr - 1) + " ");
        }
    }
}