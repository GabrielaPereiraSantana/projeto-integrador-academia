package sptech.school.projeto.academia;


public class Matricula {
    private String nome;
    private String email;
    private String telefone;
    private String plano_escolhido;
    private Double peso;
    private Double altura;


    public Matricula(String nome, String email, String telefone, String plano_escolhido, Double peso, Double altura) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.plano_escolhido = plano_escolhido;
        this.peso = peso;
        this.altura = altura;
    }

    public Matricula() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getPlano_escolhido() {
        return plano_escolhido;
    }

    public void setPlano_escolhido(String plano_escolhido) {
        this.plano_escolhido = plano_escolhido;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }


}



