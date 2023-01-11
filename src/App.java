public class App {
    public static void main(String[] args) throws Exception {

        Carro carro1 = new Carro();

        carro1.setCor("Preto");
        carro1.setModelo("Toyota");
        carro1.setCapacidadeTanque(56);

        int capacidadetanque = carro1.getCapacidadeTanque();
        String cor = carro1.getCor();
        String modelo = carro1.getModelo();

        double totalValorTanque = carro1.totalValorTanque(6.39);

        System.out.println("Carro 1");
        System.out.println("Cor do carro: "+cor);
        System.out.println("Modelo do carro: "+modelo);
        System.out.println("Capacidade do tanque do carro: "+capacidadetanque);

        System.out.println();
        System.out.println("Total a pagar do valor do tanque: R$ "+totalValorTanque);

        System.out.println();
        System.out.println("Carro 2");

        Carro carro2 = new Carro("Vermelho","Ferrari",66);

        System.out.println(carro2.getCor());
        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCapacidadeTanque());
        System.out.println(carro2.totalValorTanque(6.66));
    }

}
