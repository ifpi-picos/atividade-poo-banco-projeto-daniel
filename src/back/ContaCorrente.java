/*package back;

public class ContaCorrente extends Conta {
    
    private double chequeEspecial;

    public ContaCorrente() {
        
        super(numeroAgencia, numeroConta, saldo, cliente);
        //this.chequeEspecial = chequeEspecial;
        
    }

    public double getChequeEspecial() {
        return this.chequeEspecial;
    }


    @Override
    public String toString() {
        return "[" + this.getAgencia() + ", " 
                   + this.getNumeroConta() + ", "
                   + this.getSaldo() + ", "
                   + this.getCliente() + ", "
                   + this.getChequeEspecial() + "]";
    }

} /* */