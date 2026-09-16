

public class Main {
    public static void main(String[] args) {
        int[] numeros = { 5, -2, 10, -8, 3, 0, 7 };
        int positivos = 0;
        int negativos = 0;
        int zeros = 0;
        for (int num : numeros) {
            if (num > 0) {
                positivos++;
            } else if (num < 0) {
                negativos++;
            } else {
                zeros++;
            }
            } 
        
        System.out.println("Total de números positivos: " + positivos);
        System.out.println("Total de números negativos: " + negativos);
        System.out.println("Total de zeros: " + zeros);
    }
}
