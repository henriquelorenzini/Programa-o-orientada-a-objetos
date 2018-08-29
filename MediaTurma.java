
package mediaturma;

import java.util.Scanner;

public class MediaTurma {

    public static void main(String[] args) {
        int total = 0;
        int cont = 0;
        
        Scanner entrada = new Scanner (System.in);
        System.out.println("Entre a nota do aluno ou -1 para terminar: ");
        int nota = entrada.nextInt();
        
        while(nota>=0){
            total += nota;
            cont++;
           
            System.out.println("Entre a nota do aluno ou -1 para terminar: ");
            nota = entrada.nextInt();
        
        }
        
        if (cont > 0){
            int media = total/cont;
            System.out.printf("A média das notas é: %d ", media);
        }else{
            System.out.println("Nenhuma nota inserida.");
        }
        
                
    }
      
}
