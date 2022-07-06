package dio;

public class Ex_Ordem_Inversa {
    public static void main(String[] args) {

        /*Scanner scan = new Scanner(System.in);

        int i;

        int [] a = new int[5];


        for (i = 4; i >= 0; i--) {
            System.out.println("Digite um número: ");
            a[i] = scan.nextInt();
        }
        System.out.println(Arrays.toString(a));*/

        int [] vetor = {2, 4, 5, 7, 8};

        for (int count = 4; count >= 0; count--) {
            System.out.println(vetor[count] + " ");
            ;
        }
    }
}
