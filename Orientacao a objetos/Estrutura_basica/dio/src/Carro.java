class Carro extends Veiculo {

    private String modelo;
    private String cor;
    private Double capacidadeTanque = Double.valueOf(45);

    //construtor:
    public Carro(String modelo, String cor, Double capacidadeTanque) {
        this.modelo = modelo;
        this.cor = cor;
        this.capacidadeTanque = capacidadeTanque;
    }

    Carro() {
    }

    // getter:
    public Double getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    // setter:
    public void setCapacidadeTanque(Double capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    // método:
    double encherTanque(double valorCombustivel) {
        return capacidadeTanque * valorCombustivel;
    }
    // Sobrecarga 1:
    int encherTanque(int i){
        return (int) (capacidadeTanque * 7);
    }
    // Sobrecarga 2:
    float encherTanque(float f) {
        return (float) (capacidadeTanque * 6.4);
    }

}
