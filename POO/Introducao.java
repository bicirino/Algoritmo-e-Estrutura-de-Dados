/* 
    -- PROGRAMAÇÃO ORIENTADA A OBJETOS --

    É um paradigma de programação baseado no conceito de "objetos", que combinam dados (atributos) e comportamentos (métodos).
    O objetivo principal é aproximar a estrutura do código do mundo real, tornando-o mais modular, reutilizável e fácil de manter.

    
*/ 

// Classe  
public class Carro {
    // Atributos (características do carro)
    String marca; 
    String modelo;
    int ano; 

    // Método (comportamento do carro)
    void acelerar() { 
        System.out.println("O carro está acelerando."); 
    }
}

public class Introducao {
    public static void main(String[] args) {
        // Criando um objeto da classe Carro
        Carro meuCarro = new Carro();
        
        // Atribuindo valores aos atributos do objeto
        meuCarro.marca = "Toyota";
        meuCarro.modelo = "Corolla";
        meuCarro.ano = 2020;
        
        // Chamando o método do objeto
        meuCarro.acelerar();
        
        // Exibindo informações do carro
        System.out.println("Marca: " + meuCarro.marca);
        System.out.println("Modelo: " + meuCarro.modelo);
        System.out.println("Ano: " + meuCarro.ano);
    }
}   