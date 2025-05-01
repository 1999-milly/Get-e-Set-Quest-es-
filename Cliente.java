package Encapsulamento;
public class Cliente{
    private String nome;
    private String cpf;
    private String email;
    private String telefone;
    private String endereco;

    public Cliente(String nome,String cpf,String email,String telefone,String endereco){
        this.nome=nome;
        this.cpf=cpf;
        this.email=email;
        this.telefone=telefone;
        this.endereco=endereco;
        System.out.println("Nome: "+nome+" | CPF: "+cpf+" | E-mail: "+email+" | Contato: "+telefone+" | Endereco: "+endereco);
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public String getNome(){
        return nome;
    }
    public void setCpf(String cpf){
        this.cpf=cpf;
    }
    public String getCpf(){
        return cpf;
    }
}
