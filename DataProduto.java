package eb;
public class DataProduto{
    private int dia;
    private int mes;
    private int ano;

    public DataProduto(int dia,int mes,int ano){
        this.dia=dia;
        this.mes=mes;
        this.ano=ano;
        if(!verificaData()){
            System.out.println("Digite uma data valida");
        }
    }
    public boolean verificaData(){
        if(dia<=0 || dia>31) return false;
        if(mes<=0 || mes>12) return false;
        if(ano<=0 || ano>2025) return false;
        return true;
    }
    public boolean isBefore(DataProduto atual){
        if(this.ano<atual.ano) return true;
        if(this.ano==atual.ano && this.mes<atual.mes) return true;
        if(this.ano==atual.ano && this.mes==atual.mes && this.dia<atual.dia) return true;
        return false;
    }
}
