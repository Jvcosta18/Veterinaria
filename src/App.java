public class App {
    public static void main(String[] args) {

        System.out.println("--- Sistema de Clínica Veterinária ---");


        Tutor tutor1 = new Tutor("Ana Silva", "123456789", "Rua A");
        Tutor tutor2 = new Tutor("Pedro Costa", "987654321", "Avenida B");

        Animal animal1 = new Animal("Rex", "Cachorro", 5, "Histórico: vacinas em dia");
        Animal animal2 = new Animal("Miau", "Gato", 2, "Histórico: consulta recente");
        Animal animal3 = new Animal("Bolinha", "Cachorro", 3, "Histórico: sem problemas");

        Veterinario vet1 = new Veterinario("Dr. João", "CRMV-1234", "Clínico Geral");
        Veterinario vet2 = new Veterinario("Dra. Maria", "CRMV-5678", "Dermatologia");
        Veterinario vet3 = new Veterinario("Dr. Carlos", "CRMV-9012", "Ortopedia");


        tutor1.adicionarAnimal(animal1);
        tutor1.adicionarAnimal(animal2);
        tutor2.adicionarAnimal(animal3);

        System.out.println("\n--- Animais dos Tutores ---");
        tutor1.listarAnimais();
        tutor2.listarAnimais();


        vet2.setSupervisor(vet1);
        vet3.setSupervisor(vet1);

        System.out.println("\n--- Dados dos Veterinários ---");
        System.out.println(vet1.retornaDados());
        System.out.println(vet2.retornaDados());
        System.out.println(vet3.retornaDados());


        System.out.println("\n--- Criando um Atendimento ---");
        Atendimento atendimento1 = new Atendimento("2025-09-04", "Consulta de rotina", vet1);
        atendimento1.adicionarProcedimento(new Procedimento("Exame de Sangue", 100.00, "Resultados normais"));
        atendimento1.adicionarProcedimento(new Procedimento("Vacina Antirrábica", 50.00, ""));

        atendimento1.exibirAtendimento();


        System.out.println("\n--- Criando outro Atendimento ---");
        Atendimento atendimento2 = new Atendimento("2025-09-04", "Consulta de pele", vet2);
        atendimento2.adicionarProcedimento(new Procedimento("Exame Dermatológico", 80.00, ""));

        atendimento2.exibirAtendimento();
    }
}