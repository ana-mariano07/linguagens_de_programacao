    public class Main {
    public static void main(String[] args) {
        float nota = 4;

        if (nota >=6) {
            System.out.println("Aprovado");
        } else if (nota >= 4 && nota <5.9) {
            System.out.println("Recuperacao");
        } else if (nota < 4) {
            System.out.println("Reprovado");
        }
    }
}
