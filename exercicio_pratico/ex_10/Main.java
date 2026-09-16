

public class Main {
    public static void main(String[] args) {
        int soma = 0;
        for (int i = 2; i <= 100; i = i + 2) {
            soma = soma + i;
            System.out.print(i);
            if (i < 100) {
                System.out.print(" + ");
            }
        }
        System.out.println(" = " + soma);

    }
}

