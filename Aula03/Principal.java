import java.util.*; 



class Lista { 
    private ArrayList<Integer> elementos = new ArrayList<>(); 

    public void inserir (int valor){ 
        elementos.add(valor); 
    }

    public void excluir(int valor){ 
        elementos.remove(Integer.valueOf(valor)); 
    }

    public void imprimir(){ 
        System.out.println(elementos); 
    }
}



public class Principal{ 

    public static void main(String[] args){ 

        Scanner scan = new Scanner(System.in); 

        Lista objLista = new Lista(); 

        int opcao = 0; 


        while(opcao != 5){ 

            System.out.println("\n========================"); 
            System.out.println("MENU DE OPÇÕES"); 
            System.out.println("========================"); 
            System.out.println("1 - Inserir"); 
            System.out.println("2 - Excluir"); 
            System.out.println("3 - Imprimir"); 
            System.out.println("4 - Um milhão"); 
            System.out.println("5 - Sair"); 

            System.out.print("\nDigite sua opção: "); 
            opcao = scan.nextInt(); 


            if (opcao == 1){ 
                System.out.print("Digite um número para inserir: "); 
                objLista.inserir (scan.nextInt()); 
            } else if (opcao == 2){ 
                System.out.print("Digite um número para excluir: "); 
                objLista.excluir(scan.nextInt()); 
            } else if (opcao == 3){ 
                objLista.imprimir(); 
            } else if (opcao == 4 ){ 
                for (int i = 0; i < 1000001; i++){ 
                    objLista.inserir(i); 
                }
            }

        }

        scan.close(); 
    }
}