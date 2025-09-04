import java.util.ArrayList;
import java.util.List;

/**
 * Classe que representa um Tutor de animais.
 */
public class Tutor {
    private String nome;
    private String telefone;
    private String endereco;
    private List<Animal> animais; // cada tutor pode ter vários animais

    /**
     * Construtor da classe Tutor.
     *
     * @param nome     Nome do tutor.
     * @param telefone Telefone de contato.
     * @param endereco Endereço do tutor.
     */
    public Tutor(String nome, String telefone, String endereco) {
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
        this.animais = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * Associa um animal a este tutor.
     *
     * @param animal Animal a ser adicionado.
     */
    public void adicionarAnimal(Animal animal) {
        this.animais.add(animal);
    }

    /**
     * Lista todos os animais deste tutor.
     */
    public void listarAnimais() {
        System.out.println("Animais do tutor " + nome + ":");
        for (Animal a : animais) {
            System.out.println("- " + a.getNome() + " (" + a.getEspecie() + ")");
        }
    }
}
