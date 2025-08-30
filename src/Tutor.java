/**
 * Representa um tutor responsável por um ou mais animais.
 * Contém informações de contato como telefone e endereço.
 */
public class Tutor {
    private String nome;
    private String telefone;
    private String endereco;

    /**
     * Cria uma nova instância de Tutor.
     *
     * @param nome     Nome do tutor.
     * @param telefone Telefone de contato (não pode ser vazio).
     * @param endereco Endereço do tutor.
     * @throws IllegalArgumentException se o telefone for vazio ou nulo.
     */
    public Tutor(String nome, String telefone, String endereco) {
        setNome(nome);
        setTelefone(telefone);
        setEndereco(endereco);
    }

    /** @return Nome do tutor. */
    public String getNome() { return nome; }

    /** @param nome Nome do tutor. */
    public void setNome(String nome) { this.nome = nome; }

    /** @return Telefone do tutor. */
    public String getTelefone() { return telefone; }

    /**
     * Define o telefone do tutor.
     *
     * @param telefone Telefone do tutor (não pode ser vazio).
     * @throws IllegalArgumentException se o telefone for vazio ou nulo.
     */
    public void setTelefone(String telefone) {
        if (telefone == null || telefone.isEmpty())
            throw new IllegalArgumentException("Telefone não pode estar vazio!");
        this.telefone = telefone;
    }

    /** @return Endereço do tutor. */
    public String getEndereco() { return endereco; }

    /** @param endereco Endereço do tutor. */
    public void setEndereco(String endereco) { this.endereco = endereco; }
}
