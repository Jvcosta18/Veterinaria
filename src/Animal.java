import java.util.ArrayList;
import java.util.List;

public class Animal {
    private String nome;
    private String especie;
    private int idade;
    private String historico;
    private List<Tutor> tutores; // agora um animal pode ter vários tutores

    public Animal(String nome, String especie, int idade, String historico) {
        this.nome = nome;
        this.especie = especie;
        this.idade = idade;
        this.historico = historico;
        this.tutores = new ArrayList<>();
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getEspecie() { return especie; }
    public void setEspecie(String especie) { this.especie = especie; }

    public int getIdade() { return idade; }
    public void setIdade(int idade) { this.idade = idade; }

    public String getHistorico() { return historico; }
    public void setHistorico(String historico) { this.historico = historico; }

    public void adicionarTutor(Tutor tutor) {
        this.tutores.add(tutor);
    }

    public void listarTutores() {
        System.out.println("Tutores do animal " + nome + ":");
        for (Tutor t : tutores) {
            System.out.println("- " + t.getNome());
        }
    }
}
