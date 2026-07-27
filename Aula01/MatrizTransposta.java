import java.util.*; 

public class MatrizTransposta { 
    public static void main(String[] args){ 

        Scanner scan = new Scanner(System.in); 

        int MatrizOriginal[][] = new int[2][3]; 
        int MatrizTransposta[][] = new int[3][2]; 

        // Leitura da matriz
        for (int i = 0; i < MatrizOriginal.length; i++){ 
            for (int j = 0; j < MatrizOriginal[i].length; j++){ 
                System.out.print("Matriz original[" + i + "][" + j + "]: "); 
                MatrizOriginal[i][j] = scan.nextInt(); 
            }
        }

        // Transposição 
        for (int i = 0; i < MatrizOriginal.length; i++){ 
            for (int j = 0; j < MatrizOriginal[i].length; j++){ 
                MatrizTransposta[j][i] = MatrizOriginal[i][j]; 
            }
        }

        // Exibição da Matriz Original
        System.out.println("\n--- MATRIZ ORIGINAL ---"); 
        for (int i = 0; i < MatrizOriginal.length; i++){ 
            for (int j = 0; j < MatrizOriginal[i].length; j++){ 
                System.out.print(MatrizOriginal[i][j] + "\t");
            }
            System.out.println(); // Quebra a linha ao final de cada linha da matriz
        }

        // Exibição da Matriz Transposta
        System.out.println("\n--- MATRIZ TRANSPOSTA ---"); 
        for (int i = 0; i < MatrizTransposta.length; i++){ 
            for (int j = 0; j < MatrizTransposta[i].length; j++){ 
                System.out.print(MatrizTransposta[i][j] + "\t"); // print (sem ln)
            }
            System.out.println(); // Quebra a linha ao final de cada linha da matriz
        }

        scan.close();
    }
}