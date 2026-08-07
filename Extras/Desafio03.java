/*
    O Desafio: O Sistema de Atendimento Bancário
    Um banco precisa processar dois tipos de operações em tempo real: 
        -> Atender clientes com base na ordem de prioridade.
        -> Desfazer ações recentes do gerente do sistema.

    Regras do Negócio

        -> Prioridade de Atendimento: Pessoas Idosas (idade <= 60): Têm prioridade sobre os demais. 
        -> Entre duas pessoas idosas, quem chegou primeiro é atendida primeiro
        
        -> Pessoas Não Idosas (idade < 60): São atendidas por ordem de chegada, mas somente se não houver nenhuma pessoa idosa aguardando.
        
        -> Histórico de Alterações (Desfazer/Undo):O gerente pode cadastrar novas pessoas na fila ou cancelar o último cadastro feito.
        -> O sistema deve ser capaz de desfazer a adição da última pessoa cadastrada que ainda esteja na fila.
*/


// --- IMPORTAÇÃO DE BIBLIOTECAS --- 
import java.util.*; 
import java.time.LocalDateTime; 

public class Desafio03{ 
    
    
    static class Cliente{ 
        String nome; 
        int idade;  
    }
    
    public static void main(String[] args){ 

        Scanner scan = new Scanner(System.in); 

        
        // Tamanho do vetor 
        int n; 

        System.out.print("Digite a quantidade de clientes a serem armazenados: "); 
        n = scan.nextInt(); 

        // Crio o vetor para armazenar os clientes 
        Cliente clientes[] = new Cliente[n];   

        for (int i = 0; i < n; i++){ 

            clientes[i] = new Cliente(); 
            
            System.out.print("\n\t Digite o nome do " + (i + 1 )+ " cliente: "); 
            clientes[i].nome = scan.next(); 

            System.out.print("\n\t Digite a idade do " + (i + 1) + " cliente: "); 
            clientes[i].idade = scan.nextInt(); 
            
        }


    }
}