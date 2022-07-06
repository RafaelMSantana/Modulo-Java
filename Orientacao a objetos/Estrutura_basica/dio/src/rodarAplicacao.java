public class rodarAplicacao {
    public static void main(String[] args) {
        //Criando um objeto chamado carro1 do tipo da classe Carro com construtor default:
        Carro carro1 = new Carro();

        //chamando método set para setar a cor, modelo e tanque:
        carro1.setCor("azul");
        carro1.setModelo("March");
        carro1.setCapacidadeTanque(41.0);

        //usando system.out.println para mostrar os valores setados, usando get
        System.out.println("Cor do carro: "+ carro1.getCor());
        System.out.println("Modelo: "+ carro1.getModelo());
        System.out.println("Capacidade do tanque (litros): " + carro1.getCapacidadeTanque());
        //chamar método encherTanque
        System.out.println("Custo para encher o tanque: R$ "+ carro1.encherTanque(6.5));

        // criando um objeto já passando valores no construtor, ou seja, usando a sobrecarga:
        Carro carro2 = new Carro("Gol", "Cinza", 49.0);
        System.out.println(carro2.getCor());
        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCapacidadeTanque());
        System.out.println(carro2.encherTanque(6.9));
    }
}
