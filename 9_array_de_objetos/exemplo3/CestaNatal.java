public class CestaNatal {
    public static void main(String[] args) {
        Itens coisa_1 = new Itens(75, "Chocolate", 8, 68.90);
        Itens coisa_2 = new Itens(126, "Champanhe", 4, 100);
        Itens coisa_3 = new Itens(44, "Frango Assado", 2, 89.90);
        Itens coisa_4 = new Itens(3, "Maionese", 1, 25.70 );

        Itens[] cesta = {coisa_1, coisa_2, coisa_3, coisa_4};

        System.out.println("Cesta de Natal - 2026");
        for(Itens item : cesta) {
            System.out.println("Itens da cesta");
            System.out.println("Codigo: " + item.codigo);
            System.out.println("Nome: " + item.nome);
            System.out.println("Quantidade: " + item.quantidade);
            System.out.println("Preco: " + item.preco);
            System.out.println("\n");
        }
    }
}
