import java.util.Scanner;

public class PareImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nb;
        int nmr;
        int par = 0, impar = 0;

        System.out.println("digite quantos numeros voce quer comparar");
        nb = sc.nextInt();

        int count = 0;
        do {
            System.out.println("Digite o numero:");
            nmr = sc.nextInt();
            if (nmr % 2 == 0)
                par++;
            else
                impar++;
            count = count + 1;
        } while (count < nb);

        System.out.println("quantidade de:" + par);
        System.out.println("quantidade de:" + impar);
        sc.close();
    }

}
