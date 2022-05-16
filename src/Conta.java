public abstract class Conta implements ContaInterface {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENTIAL = 1;

    protected int agencia;
    protected int numeroConta;
    protected double saldo;
    protected Cliente cliente;


    public Conta (Cliente cliente ) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numeroConta = Conta.SEQUENTIAL++;
        this.cliente = cliente;


    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
     }


    @Override
    public void depositar(double valor) {
        this.saldo +=valor;

    }


    @Override
    public void transferir(double valor, Conta contaDestino) {
       this.sacar(valor);
       contaDestino.depositar(valor);
    }

    public int getAgencia() {

        return agencia;
    }
    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumeroConta() {

        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {

       return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    protected void impressaoInformacoesComuns() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agência: %d", this.agencia));
        System.out.println(String.format("Conta: %d", this.numeroConta));
        System.out.println(String.format("Saldo: %.2f", this.saldo));

    }




}