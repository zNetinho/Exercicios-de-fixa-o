import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tabuada;

        System.out.println("Qual a tabuada que voce quer?");
        tabuada = sc.nextInt();

        for (int i = 1; i <= 10; i++)
            System.out.println(tabuada + "x" + i + "=" + (tabuada * i));

        sc.close();

    }

}
