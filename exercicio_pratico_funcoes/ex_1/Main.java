

public class Main {
    static void maior (int num)  {
        if (num == 0) {
            System.out.println("Igual a zero");
        } if (num < 0) {
            System.out.println("Menor que zero");
        } else {
            System.out.println("Maior que zero");
        }
    }

    public static void main(String[] args) {
        maior(3);
    }
}
