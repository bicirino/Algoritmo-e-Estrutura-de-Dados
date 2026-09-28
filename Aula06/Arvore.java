// Classe que representa cada elemento (Nó) da árvore 
class No { 
    int valor; 
    No esquerda; // Guarda a referência (ponteiro) para o Nó filho da esquerda  
    No direita; // Guarda a referência (ponteiro) para o Nó da direita 

    // Construtor: executa sempre que criamos um novo nó com "new No(valor)"
    public No (int valor){  
        this.valor = valor;
        this.esquerda = null; 
        this.direita = null;  
    }

}

public class Arvore { 

    public static void main(String[] args) {
        
        // Instancia o nó principal/topo da árvore (Raiz) com valor 10 
        No raiz = new No (10); 

        // Adiciona os filhos diretos da Raiz (Nível 1 da árvore)
        raiz.esquerda = new No(2); 
        raiz.direita = new No (3); 

        raiz.esquerda.esquerda = new No (4);
        raiz.esquerda.direita = new No ( 5);  
        
        
        raiz.direita.direita = new No (6); 

        /* 
        
                   10         
                 /    \
                2       3
               / \       \
              4   5       6

        
        */


        System.out.println("=== LEITURA DIRETA DOS NÓS ===");
        System.out.println("Valor da Raiz: " + raiz.valor);
        System.out.println("Filho da Esquerda da Raiz: " + raiz.esquerda.valor);
        System.out.println("Filho da Direita da Raiz: " + raiz.direita.valor);
        System.out.println("Nó folha (extrema esquerda): " + raiz.esquerda.esquerda.valor);
        System.out.println("Nó folha (extrema direita): " + raiz.direita.direita.valor);


        System.out.println("\n=== PERCURSO EM ORDEM (Esquerda -> Raiz -> Direita) ===");
        
        exibirEmOrdem(raiz);
        System.out.println(); 

        
    }


    public static void exibirEmOrdem (No noAtual){ 

        if (noAtual != null){ 
            
            exibirEmOrdem(noAtual.esquerda);
        
            System.out.println(noAtual.valor + " ");

            exibirEmOrdem(noAtual.direita);



        }

    }

}