import java.util.Scanner;

public class fatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fat;
        int mult = 1;

        System.out.println("digite um numero para descobrir seu fatorial");
        fat = sc.nextInt();

        System.out.print(fat + "!=");
        for (int i = fat; i >= 1; i--) {
            mult = mult * i;

        }
        System.out.print(mult);
        sc.close();
    }
}
