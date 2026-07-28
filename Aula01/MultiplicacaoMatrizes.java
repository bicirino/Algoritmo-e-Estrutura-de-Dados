import java.util.*; 

public class MultiplicacaoMatrizes{ 

    public static void main(String[] args){ 

        Scanner scan = new Scanner(System.in); 

        int Matriz01[][] = new int[2][3]; 
        int Matriz02[][] = new int[3][2]; 
        
        int Resultado[][] = new int[2][2];

        // Entrada de dados da Matriz 01 
        System.out.println("\n --- MATRIZ 01 ---");
        for (int i = 0; i < Matriz01.length; i ++ ){ 
            for (int j = 0; j < Matriz01[i].length; j ++){ 
                System.out.print("Matriz 01[" + i + "][" + j + "]:"); 

                Matriz01[i][j] = scan.nextInt(); 
            }
        }

        // Entrada de dados da Matriz 02 
        System.out.println("\n --- MATRIZ 02 ---");
        for (int i = 0; i < Matriz02.length; i ++ ){ 
            for (int j = 0; j < Matriz02[i].length; j ++){ 
                System.out.print("Matriz 02[" + i + "][" + j + "]:"); 

                Matriz02[i][j] = scan.nextInt(); 
            }
        }

        scan.close();  

        // Processamento 

        // Linhas 
        for (int i = 0; i < Resultado.length; i ++ ){ 
            
            // Colunas 
            for (int j = 0; j < Resultado.length; j ++){ 
                
                // Quantidade de somas 
                for (int k = 0; k < Matriz02.length; k ++){ 
                    Resultado[i][j] += (Matriz01[i][k] * Matriz02[k][j]); 
                }
                
            }
        }

        // Imprimindo Resultado 
        System.out.println("\n --- RESULTADO ---");
        for (int i = 0; i < Resultado.length; i ++){ 
            for (int j = 0; j < Resultado.length; j ++){ 
                System.out.print(Resultado[i][j] + "\t"); 
            }
        }
    }
}