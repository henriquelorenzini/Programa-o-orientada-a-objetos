import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cont = 1;
        int total = 0;
        while(cont <= 10) {
            System.out.println("Digite a proxima nota");
            int nota = (int) in.nextDouble();
            total += nota;
            cont++;
        }
        System.out.println("Média:"+total/10);
    }
}
