package Herança.Exercicio2;

public class RodarApp {

    public static void main(String[] args){

        Funcionario funcionario = new Funcionario(); // Instancia do Objeto
        
        Funcionario gerente = new Gerente(); //Upcast do Funcionario
        Funcionario vendedor = new Vendedor(); // Upcast do Funcionario
        Funcionario faxineiro = new Faxineiro(); // Upcast do Funcionario

        // Gerente gerente_ = new Funcionario();
        Vendedor vendedor_ = (Vendedor) new Funcionario(); // Dowscast do Vededor

        // O dowcast é a transformação da classe mãe/pai para transformar na classe filha ou Subclasse
        // Dowcast pode ate ser um conceito valido porem e recomendavel não utilizar
        
        // E o upcast é a transformação da classe filha ou subclass na classe mãe ou superClass
    }
}
