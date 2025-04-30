package en;
public class Data{
    private int dia,mes,ano;

    public Data(int dia,int mes,int ano){
        this.dia=dia;
        this.mes=mes;
        this.ano=ano;
        int i=verificaData();
        if(i==1){
        System.out.println("Dia: "+dia+" | Mes: "+mes+" | Ano: "+ano);
    }else{
        System.out.println("Digite uma data valida");
        }}
    public int verificaData(){
        if(dia<=0 || dia>31) return 0;
        if(mes<=0 || mes>12) return 0;
        if(ano<=0 || ano>2025) return 0;
        return 1;
    }
    public void setDia(int dia){
        this.dia=dia;
    }
    public int getDia(){
        return dia;
    }
    }

