public class Tutor {
    private String nome;
    private String telefone;
    private String endereco;

    public Tutor(String nome, String telefone, String endereco) {
        setNome(nome);
        setTelefone(telefone);
        setEndereco(endereco);
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) {
        if (telefone == null || telefone.isEmpty())
            throw new IllegalArgumentException("Telefone não pode estar vazio!");
        this.telefone = telefone;
    }

    public String getEndereco() { return endereco; }
    public void setEndereco(String endereco) { this.endereco = endereco; }
}
