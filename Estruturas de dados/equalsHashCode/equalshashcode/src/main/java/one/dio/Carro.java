package one.dio;

import java.util.Objects;

public class Carro {
    String marca;

    public Carro(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // confere se o objeto instanciado é igual ao objeto passado por parâmetro
        if (o == null || getClass() != o.getClass()) return false; // confere se o objeto é nulo ou se são de classes diferentes
        Carro carro = (Carro) o; // Cria um objeto temporário e faz um cast do Object passado como parâmetro
        return Objects.equals(marca, carro.marca); // retorna se um objeto é igual ao outro
    }

    @Override
    public int hashCode() {
        return Objects.hash(marca); // retorna um número para ajudar a organizar
    }
}
