

public class Main {
    static void nota (int num, String nome) {
        if (num>=7) 
            System.out.println("O " + nome + " esta aprovado!");
        if (num<7)
            System.out.println("O " + nome + " esta reprovado!");
    }

    public static void main(String[] args) {
        nota(4, "Antonio");
    }
}
