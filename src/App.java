public class App {
    public static void main(String[] args) {

        System.out.println("--- Sistema de Clínica Veterinária ---");


        Tutor[] tutores = new Tutor[2];
        tutores[0] = new Tutor("Ana Silva", "123456789", "Rua A");
        tutores[1] = new Tutor("Pedro Costa", "987654321", "Avenida B");

        Animal[] animais = new Animal[3];
        animais[0] = new Animal("Rex", "Cachorro", 5, "Histórico: vacinas em dia");
        animais[1] = new Animal("Miau", "Gato", 2, "Histórico: consulta recente");
        animais[2] = new Animal("Bolinha", "Cachorro", 3, "Histórico: sem problemas");

        Veterinario[] veterinarios = new Veterinario[3];
        veterinarios[0] = new Veterinario("Dr. João", "CRMV-1234", "Clínico Geral");
        veterinarios[1] = new Veterinario("Dra. Maria", "CRMV-5678", "Dermatologia");
        veterinarios[2] = new Veterinario("Dr. Carlos", "CRMV-9012", "Ortopedia");


        tutores[0].adicionarAnimal(animais[0]);
        tutores[0].adicionarAnimal(animais[1]);
        tutores[1].adicionarAnimal(animais[2]);

        System.out.println("\n--- Animais dos Tutores ---");
        tutores[0].listarAnimais();
        tutores[1].listarAnimais();


        veterinarios[1].setSupervisor(veterinarios[0]);
        veterinarios[2].setSupervisor(veterinarios[0]);

        System.out.println("\n--- Dados dos Veterinários ---");
        System.out.println(veterinarios[0].retornaDados());
        System.out.println(veterinarios[1].retornaDados());
        System.out.println(veterinarios[2].retornaDados());


        System.out.println("\n--- Criando um Atendimento ---");
        Atendimento atendimento1 = new Atendimento("2025-09-04", "Consulta de rotina", veterinarios[0]);
        atendimento1.adicionarProcedimento(new Procedimento("Exame de Sangue", 100.00, "Resultados normais"));
        atendimento1.adicionarProcedimento(new Procedimento("Vacina Antirrábica", 50.00, ""));

        atendimento1.exibirAtendimento();


        System.out.println("\n--- Criando outro Atendimento ---");
        Atendimento atendimento2 = new Atendimento("2025-09-04", "Consulta de pele", veterinarios[1]);
        atendimento2.adicionarProcedimento(new Procedimento("Exame Dermatológico", 80.00, ""));

        atendimento2.exibirAtendimento();
    }
}