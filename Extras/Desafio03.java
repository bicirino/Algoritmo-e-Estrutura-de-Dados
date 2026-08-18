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

// --- CRIAÇÃO DE CLASSES E FUNÇÕES --- 
class Cliente {

    String nome;  
    int idade;

    public Cliente (String nome, int idade ){ 
        this.nome = nome; 
        this.idade = idade; 
    }

}

class Fila { 

    // Declaração do Array das duas filas: Normal e preferencial 
    private ArrayList<Cliente> preferencial = new ArrayList<>(); 
    private ArrayList<Cliente> normal = new ArrayList<>(); 

    // Uma outra lista para guardar o histórico de registros 
    private ArrayList<Cliente> historico = new ArrayList<>(); 

    // Métodos (funções)
    public void cadastrar(Cliente cliente){ 
        // Cadastra o cliente na fila correta com base na idade 
        if (cliente.idade >= 60 ){ 
            preferencial.add(cliente); 
        } else { 
            normal.add(cliente); 
        }

        // Não importa a idade, todo cliente passa pelo histórico 
        historico.add(cliente); 

        System.out.println("Cliente: " + cliente.nome + "cadastrado!"); 
    }

    public void remover(String nomeCompleto){ 

        for (int i = 0; i < preferencial.size; i++){ 
            
            if (preferencial.get(i).nome.equalsIgnoreCase(nomeCompleto)){ 
                preferencial.remove(i); 

                System.out.println("Cliente: " + nomeCompleto + "removido com sucesso!"); 

                return; 
            }

        }

        for (int i = 0; i < normal.size; i++){ 
            
            if (normal.get(i).nome.equalsIgnoreCase(nomeCompleto)){ 
                normal.remove(i); 

                System.out.println("Cliente: " + nomeCompleto + "removido com sucesso!"); 

                return; 
            }
        }

        System.out.println("Cliente não encontrado! "); 
        
    }

}


public class Desafio03{ 

    Scanner scan = new Scanner(System.in); 



}