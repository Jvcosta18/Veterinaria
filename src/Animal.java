/**
 * Representa um animal cadastrado na clínica veterinária.
 * Contém informações como nome, espécie, idade e histórico médico.
 */
public class Animal {
    private String nome;
    private String especie;
    private int idade;
    private String historico;

    /**
     * Cria uma nova instância de Animal.
     *
     * @param nome      Nome do animal.
     * @param especie   Espécie do animal.
     * @param idade     Idade do animal em anos (não pode ser negativa).
     * @param historico Histórico médico do animal.
     * @throws IllegalArgumentException se a idade for negativa.
     */
    public Animal(String nome, String especie, int idade, String historico) {
        setNome(nome);
        setEspecie(especie);
        setIdade(idade);
        setHistorico(historico);
    }

    /** @return Nome do animal. */
    public String getNome() { return nome; }

    /** @param nome Nome do animal. */
    public void setNome(String nome) { this.nome = nome; }

    /** @return Espécie do animal. */
    public String getEspecie() { return especie; }

    /** @param especie Espécie do animal. */
    public void setEspecie(String especie) { this.especie = especie; }

    /** @return Idade do animal. */
    public int getIdade() { return idade; }

    /**
     * Define a idade do animal.
     *
     * @param idade Idade do animal em anos (não pode ser negativa).
     * @throws IllegalArgumentException se a idade for negativa.
     */
    public void setIdade(int idade) {
        if (idade < 0) throw new IllegalArgumentException("Idade não pode ser negativa!");
        this.idade = idade;
    }

    /** @return Histórico médico do animal. */
    public String getHistorico() { return historico; }

    /** @param historico Histórico médico do animal. */
    public void setHistorico(String historico) { this.historico = historico; }

    /**
     * Adiciona uma nova anotação ao histórico médico do animal.
     *
     * @param descricao Texto a ser adicionado no histórico.
     */
    public void adicionarHistorico(String descricao) {
        this.historico += "\n" + descricao;
    }
}
