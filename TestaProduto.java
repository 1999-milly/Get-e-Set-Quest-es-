package eb;
import java.util.Scanner;
public class TestaProduto{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Produto prod=new Produto("Arroz",6.75,new Data(15,7,2025));

        System.out.println("Digite a data atual: ");
        Data atual=new Data(sc.nextInt(),sc.nextInt(),sc.nextInt());
        prod.venceProduto(atual);
    }
}
