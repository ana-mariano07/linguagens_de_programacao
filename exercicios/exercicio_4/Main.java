

public class Main {
    public static void main(String[] args) {
        // String[] alunos = {"Miranata", "Savalo", "Aeronauta"};

        // alunos[0] = "Maria";
        // System.out.println("Qtde de Alunos: " + alunos.length);

        // for(String estudante : alunos){
        //     System.out.println(estudante);
        // }

        // String[] frutas = {"Morango", "Goiaba", "Mamao", "Abacate", "Manga"};
        // System.out.println("Qtde de Frutas: " + frutas.length);
        //     for(String produtos : frutas){
        //         System.out.println(produtos);
        //     }
        
        // for(int i = 0; i < frutas.length; i++){
        //     System.out.println(frutas[i]);
        // }    

        int[] numero = {5, 8, -4, 0, 23};
        for(int item : numero ){
            if (item < 0)
                System.out.println("O valor de " + item + "eh negativo");
            if (item == 0)
                System.out.println("O valor de " + item + "eh zero");
            if (item > 0)
                System.out.println("O valor de " + item + "eh positivo");
        }
    }
    
} 
