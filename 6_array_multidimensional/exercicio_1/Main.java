

public class Main {
    public static void main(String[] args) {
        int [][] numeros = {{1,4,2,8}, {3,6,8,9}, {7,5,9,10}, {12,14,16,18}};
        for(int i = 0; i < 4; i++) {
                for(int j = 0; j < 4; j++) {
                    numeros[i][j] = 0;
            }
        }    
       
        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j++) {
                System.out.println(numeros[i][j]);
            }
            
        }
    }

    
}
