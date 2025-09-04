import java.util.ArrayList;

public class Atendimento {
    private String data;
    private String descricao;
    private Veterinario veterinario;
    private ArrayList<Procedimento> procedimentos;

    public Atendimento(String data, String descricao, Veterinario veterinario) {
        this.data = data;
        this.descricao = descricao;
        this.veterinario = veterinario;
        this.procedimentos = new ArrayList<>();
    }

    // Getters e Setters
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }

    public ArrayList<Procedimento> getProcedimentos() {
        return procedimentos;
    }


    public void adicionarProcedimento(Procedimento procedimento) {
        procedimentos.add(procedimento);
    }

    public void removerProcedimento(Procedimento procedimento) {
        procedimentos.remove(procedimento);
    }


    public void exibirAtendimento() {
        System.out.println("Data: " + data);
        System.out.println("Descrição: " + descricao);
        System.out.println("Veterinário: " + veterinario.getNome());
        System.out.println("Procedimentos realizados:");
        for (Procedimento p : procedimentos) {
            System.out.println(" - " + p.getNome());
        }
    }

}
