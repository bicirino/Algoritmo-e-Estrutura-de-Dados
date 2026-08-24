/* 
    -- ENCAPSULAMENTO -- 

    Consiste em esconder os detalhes internos de uma classe e proteger seus dados contra modificações 
    indevidas vindas do exterior. Em Java, fazemos isso utilizando modificadores de acesso, 
    como: "private", "public" e "protected". 

*/

public class ContaBancaria { 

    private double saldo; // Atributo privado, não acessível diretamente de fora da classe

    // Construtor da classe 
    public ContaBancaria(double saldoInicial) { 
        this.saldo = saldoInicial; 
    }

    // Getter para ler o valor 
    public double getSaldo() { 
        return saldo; 
    }
}


public class Encapsulamento { 
    public static void main(String[] args) { 
        // Criando um objeto da classe ContaBancaria
        ContaBancaria minhaConta = new ContaBancaria(1000.0); 
        
        // Tentativa de acessar o saldo diretamente (isso causaria um erro)
        // System.out.println(minhaConta.saldo); // Erro: saldo tem acesso privado
        
        // Acessando o saldo através do método getter
        System.out.println("Saldo atual: " + minhaConta.getSaldo()); 
    } 
}