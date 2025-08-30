public class Animal {
    private String nome;
    private String especie;
    private int idade;
    private String historico;

    public Animal(String nome, String especie, int idade, String historico) {
        setNome(nome);
        setEspecie(especie);
        setIdade(idade);
        setHistorico(historico);
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getEspecie() { return especie; }
    public void setEspecie(String especie) { this.especie = especie; }

    public int getIdade() { return idade; }
    public void setIdade(int idade) {
        if (idade < 0) throw new IllegalArgumentException("Idade não pode ser negativa!");
        this.idade = idade;
    }

    public String getHistorico() { return historico; }
    public void setHistorico(String historico) { this.historico = historico; }

    public void adicionarHistorico(String descricao) {
        this.historico += "\n" + descricao;
    }
}
