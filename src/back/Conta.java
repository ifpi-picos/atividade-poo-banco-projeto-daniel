package back;


import javax.swing.JOptionPane;

import utilidades.Utils;




public class Conta {

    private static int counterContas = 1;
    private static int counterAgencia = 1001;

    private int agencia;
    private int numeroConta;
    protected Cliente cliente;
    protected double saldo = 0.00;
    private int tipoConta;

    public Conta(Cliente cliente, int tipoConta) {
        this.agencia = counterAgencia;
        this.cliente = cliente;
        this.numeroConta = counterContas;
        counterContas += 1;
        counterAgencia += 1;
        this.tipoConta = tipoConta;
    }


    public static int getCounterContas() {
        return counterContas;
    }
    
    public static int getCounterAgencia() {
        return counterAgencia;
    }
    public int getTipoConta() {
        return tipoConta;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumeroConta() {
        return numeroConta;
    }
    
    public Cliente getCliente() {
        return cliente;
    }
    
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getContaTipo(){
        if(getTipoConta() == 1){
            return "Conta Corrente";
        }else if(getTipoConta() == 2){
            return "Conta Poupança";
        }
    return null;}

    public String getClienteEnderecocidade() {
        return this.cliente.getCidade();
    }

    public String getClienteEnderecoUf() {
        return this.cliente.getUf();
    }

    public String getClienteLogradouroEndereco() {
        return this.cliente.getLogradouro();
    }
    public int getClienteNumeroEndereco(){
        return this.cliente.getNumeroCasa();
    }
    public String getClienteBairroEndereco(){
        return this.cliente.getBairro();
    }



    public void deposito(Double valor) {
        if (valor > 0) {
            setSaldo(getSaldo() + valor);
            JOptionPane.showMessageDialog(null,"Seu depósito foi realizado com sucesso");
        } else {
            JOptionPane.showMessageDialog(null,"Não foi possível realizar o seu depósito");
        }
    }
    
    
    
    public void sacar(Double valor) {
        if (valor > 0 && this.getSaldo() >= valor) {
            setSaldo(getSaldo() - valor);
            JOptionPane.showMessageDialog(null,"Saque realizado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Não foi possivel realizar o saque!");
        }
    }

    public void transferir(Conta contaDeposito, Double valor) {
        if (valor > 0 && this.getSaldo() >= valor) {
            setSaldo(getSaldo() - valor);

            contaDeposito.saldo = contaDeposito.getSaldo() + valor;
            JOptionPane.showMessageDialog(null,"Tranferencia realizada com sucesso");
        } else {
        }
    }


    public String toString() {
        return "\nNúmero da conta: " + this.getNumeroConta() +
                "\nAgência: " +this.getAgencia() +
                "\nNome: " + this.cliente.getNome() +
                "\nTipo de conta: " + getContaTipo() +
                "\nEmail: " + this.cliente.getSenha() +
                "\nSenha: " + this.cliente.getEmail() +
                "\nCPF: " + this.cliente.getCpf() +
                "\nData de Nascimento: " + this.cliente.getDataDeNascimento() +
                "\nSaldo: " + Utils.doubletoString(this.getSaldo()) +
                "\nLogradouro: " + this.cliente.getLogradouro() +
                "\nNúmero da casa: " + this.cliente.getNumeroCasa() +
                "\nBairro: " + this.cliente.getBairro() +
                "\nCidade: " + this.cliente.getCidade() +
                "\nUF : " + this.cliente.getUf() +
                "\n";
    }








}