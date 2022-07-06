package dio;

public class RodarAplicacao {
    public static void main(String[] args) {
        // criar um vetor do tipo ClasseMae com 3 objetos dentro:
        ClasseMae[] classes = new ClasseMae[] {new ClasseFilha1(), new ClasseFilha2(), new ClasseMae()};

        // forEach para percorrer os 3 objetos e chamar o método1 de cada um deles para fazer
        // sobrescrita por meio de polimorfismo na classe filha 1 e na classe filha 2:
        for (ClasseMae classe: classes) {classe.metodo1();}
        System.out.println("");

        // forEach para percorrer os 3 objetos e chamar o método2 de cada um deles:
        for (ClasseMae classe: classes) {classe.metodo2();}

        System.out.println("");

        // sobrescrita pura usando a implementação da classe mãe:
        ClasseFilha2 classeFilha2 = new ClasseFilha2();
        classeFilha2.metodo2();
    }
}
