
package calculadoracredito;

import java.util.Scanner;


public class CalculadoraCredito {
    
    
    public static void main(String[] args) {
        int numeroConta, saldoInicial, despesas, creditos, limite, novoSaldo;
        Cliente cliente;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Informe o número da conta: ");
        numeroConta = entrada.nextInt();
        
       System.out.println("Informe o saldo inicial: ");
       saldoInicial = entrada.nextInt();
        
        System.out.println("Informe o valor das despesas: ");
        despesas = entrada.nextInt();
        
        System.out.println("Informe o credito: ");
        creditos = entrada.nextInt();
        
        System.out.println("Informe o limite de credito: ");
        limite = entrada.nextInt();
        
        cliente = new Cliente (numeroConta,saldoInicial, despesas, creditos, limite);
        
        novoSaldo = cliente.getNovoSaldo();
        System.out.printf("O novo saldo é: %d", novoSaldo);
        
        if(cliente.isCreditoExcedido()){
            System.out.println("%nLimite de saldo excedido");
        }
    }
    
}
