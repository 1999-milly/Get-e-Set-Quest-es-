package eb;
import java.util.Scanner;
public class TestaProduto{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Produto prod=new Produto("Arroz",6.75,new DataProduto(15,7,2025));

        System.out.println("Digite a data atual: ");
        DataProduto atual=new DataProduto(sc.nextInt(),sc.nextInt(),sc.nextInt());
        prod.venceProduto(atual);
    }
}
