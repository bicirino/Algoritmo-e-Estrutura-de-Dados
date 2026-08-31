import java.util.*; 

public class pilha { 

    private No cabeca = null; 

    public void push (int numero){ 
        cabeca = new No (numero, cabeca); 

    }

    public void pop(){ 
        if (cabeca == null){ 

            System.out.print("pilha vazia"); 
            
        }else{ 
            System.out.print(cabeca.getNumero()); 
            cabeca = cabeca.getProximo(); 
        }
    }



}