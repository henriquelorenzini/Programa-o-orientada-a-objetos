package calculadoracredito;

public class Cliente {
    private int numeroConta;
    private int saldoInicial;
    private int despesas;
    private int creditos;
    private int limite;

    public Cliente(int numeroConta, int saldoInicial, int despesas, int creditos, int limite) {
        this.numeroConta = numeroConta;
        this.saldoInicial = saldoInicial;
        this.despesas = despesas;
        this.creditos = creditos;
        this.limite = limite;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }
