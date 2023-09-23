public class Teacher {

    private int id;
    private String nome;
    private String formacao;
    private int idade;

    public Teacher(int id, String nome, String formacao, int idade) {
        this.id = id;
        this.nome = nome;
        this.formacao = formacao;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getFormacao() {
        return formacao;
    }
    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Teacher [id=" + id + ", nome=" + nome + ", formacao=" + formacao + ", idade=" + idade + "]";
    }    

}