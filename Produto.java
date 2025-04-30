package eb;
public class Produto{
    private String nome;
    private double preco;
    private Data validade;

    public Produto(String nome,double preco,Data validade){
        this.nome=nome;
        this.preco=preco;
        this.validade=validade;
        System.out.println("Produto: "+nome+" | Preco: "+preco);
    }
    public void venceProduto(Data atual){
        if(validade==null || !validade.verificaData()){
            System.out.println("Data de validade invalida");
        }else if(validade.isBefore(atual)){
            System.out.println("Produto vencido");
        }else{
            System.out.println("Produto dentro do prazo de validade");
        }
    }
}
