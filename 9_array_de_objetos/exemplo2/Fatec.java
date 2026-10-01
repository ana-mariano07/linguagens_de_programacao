

public class Fatec {
    
        public static void main(String[] args) {
            Aluno estudante_1 = new Aluno("Daniel", "123dani@fatec");
            Aluno estudante_2 = new Aluno("Laura", "123laura@fatec");
           Aluno estudante_3 = new Aluno("Helena", "123hele@fatec");
           Aluno estudante_4 = new Aluno("Pablo", "123pablo@fatec");
    
            Aluno[] classe = {estudante_1, estudante_2, estudante_3, estudante_4};
    
            for(Aluno item : classe) {
                System.out.println("Nome: " + item.nome);
                System.out.println("Email: " + item.email);
            }
    }
}
