package Herança.Exercicio1;

public class Veiculo {
    String cor;
    String modelo;
    int capacidadeTanque;

    //  Construtor aqui
    Veiculo(){
        
    }

    Veiculo(String cor, String modelo, int capacidadeTanque){
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }

    // Metodos get e set
    void setCor(String cor){
        this.cor = cor;
    }
    
    String getCor(){
        return cor;
    }

    void setModelo(String modelo){
        this.modelo = modelo;
    }


    String getModelo(){
        return modelo;
    }

    void setCapacidadeTanque(int capacidadeTanque){
        this.capacidadeTanque = capacidadeTanque;
    }

    int getCapacidadeTanque() {
        return capacidadeTanque;
    }

    double totalValorTanque(double valorCombustivel){
        return capacidadeTanque * valorCombustivel;
    }
}
