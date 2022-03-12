import java.util.Scanner;

//faça um algoritimo que peça quantos numeros a pessoa desejar, escolha o maior e ache a media daqueles valores.
public class Calculo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        int nb;
        int maior_ = 0;
        int soma = 0;
        int count = 0;

        System.out.println("diga quantos numeros voce deseja comparar:");
        nb = sc.nextInt();
        do {
            System.out.println("Digite um número:");
            numero = sc.nextInt();
            soma = soma + numero;
            if (numero > maior_)
                maior_ = numero;
            count = count + 1;

        } while (count < nb);
        System.out.println("maior" + maior_);
        System.out.println("media" + (soma / 5));

        ;
        sc.close();
    }
}
