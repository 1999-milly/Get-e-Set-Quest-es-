package Encapsulamento;
public class Conta{
    private int numero;
    private double saldo;
    private String titular;
    private String agencia;

    public Conta(int numero,double saldo,String titular,String agencia){
        this.numero=numero;
        this.saldo=saldo;
        this.titular=titular;
        this.agencia=agencia;
        System.out.println("Titular: "+titular+" | Numero: "+numero+" | Saldo: "+saldo+" | Agencia: "+agencia);
    }
    public boolean saca(double valor){
        if(this.saldo>=valor){
            this.saldo-=valor;
            System.out.println("Saque realizado com sucesso no valor de "+valor+" reais, ficando a conta com um saldo de "+this.saldo+" reais.");
            return true;
        }else{
            System.out.println("Saldo insuficiente para saque");
            return false;
        }
    }
    public void setNumero(int numero){
        this.numero=numero;
    }
    public int getNumero(){
        return numero;
    }
}
