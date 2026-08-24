/* 
    -- HERANÇA --

    Permite que uma classe herde atributos e métodos de outra classe. 
    Isso evita duplicação de código. Em Java, utiliza-se a palavra-chave "extends" 

*/

public class Animal { 
    String nome; 


    public void comer(){ 
        
        System.out.println(nome + " está comendo."); 
    }
}

// A classe Cachorro é uma subclasse de Animal, herdando seus atributos e métodos 
public class Cachorro extends Animal { 

    public void latir() { 
        System.out.println( "Cachoro está latindo."); 
    }

}