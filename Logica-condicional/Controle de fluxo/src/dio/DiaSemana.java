package dio;

public class DiaSemana {
    public static void obterDiaSemana(int dia) {
        switch (dia) {
            case 1:
            case 2:
            case 3:
                mensagemCerto();
                break;
            case 4:
                mensagemErrado();
                break;
            case 5:
                mensagemTalvez();
                break;
            default:
                mensagemIndef();
        }
    }

    public static void mensagemCerto() {
        System.out.println("Certo");
    }

    public static void mensagemErrado() {
        System.out.println("Errado");
    }

    public static void mensagemTalvez() {
        System.out.println("Talvez");
    }

    public static void mensagemIndef() {
        System.out.println("Valor indefinido");
    }
}