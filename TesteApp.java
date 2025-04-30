package Encapsulamento;
public class TesteApp{
    public static void main(String[] args){
         Cliente cliente=new Cliente("Gabriel","043.186.772.06","grb99@gmail.com","21999988877","Niteroi");

         System.out.println("Nome do cliente: "+cliente.getNome());
         cliente.setNome("Wemilly");
         System.out.println("Novo nome do cliente: "+cliente.getNome());
         System.out.println("CPF do cliente: "+cliente.getCpf());
         cliente.setCpf("21999988877");
         System.out.println("Novo CPF do cliente: "+cliente.getCpf());

         Conta conta=new Conta(938338,9383,"Wemilly","908-0");
         System.out.println("Numero da conta: "+conta.getNumero());
         conta.setNumero(12345);
         System.out.println("Novo numero da conta: "+conta.getNumero());
         conta.saca(10000);
    }
}
