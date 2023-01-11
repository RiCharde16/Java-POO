package Herança.Exercicio2.Interface;

public class Calculadora implements OperacaoMatematica_Interface {
    
    @Override
    public void soma(double numero1, double numero2){
        System.out.println("Soma: "+ numero1 + numero2);
    }

    @Override
    public void subtracao(double numero1, double numero2) {
        System.out.println("subtração: "+ (numero1 - numero2));      
    }

    @Override
    public void multiplicacao(double numero1, double numero2) {
        System.out.println("multiplicação: "+ numero1 * numero2);
        
    }

    @Override
    public void divisao(double numero1, double numero2) {
        // TODO Auto-generated method stub
        System.out.println("Divisão: "+ numero1 / numero2);
    }
}
