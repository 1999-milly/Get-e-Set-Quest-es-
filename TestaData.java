package en;
public class TestaData{
    public static void main(String[] args){
        Data data=new Data(-1,5,1);
        Data data1=new Data(1,6,1999);
        Data data2=new Data(15,6,2003);
        data2.setDia(2);
        System.out.println("Novo dia da data 2: "+data2.getDia());
    }}
