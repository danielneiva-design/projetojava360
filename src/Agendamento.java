package src;

public class Agendamento {
    void main() {
        IO.println("Agendamento de Consultas 0.1 \n");
        IO.println("\nSeja bem-vindo(a) ao sistema de agendamento de consultas médicas! \n");
        IO.println("\nPor favor, informe os dados do paciente para prosseguir com o agendamento. \n");
        String nomePaciente = IO.readln("Nome do paciente: \n");
        String dataNascimento = IO.readln("Data de nascimento (dd/mm/aaaa): \n");
        String cpf = IO.readln("CPF (somente números): \n");
        String telefone = IO.readln("Telefone (somente números): \n");

        IO.println("\nSelecione a especialidade médica desejada: \n");
        IO.println("1 - Clínica Geral");
        IO.println("2 - Pediatria");
        IO.println("3 - Ginecologia");
        IO.println("4 - Cardiologia \n");

        int especialidade = Integer.parseInt(IO.readln("\nDigite o número da especialidade desejada: \n"));
        String especialidadeSelecionada = "";

        switch (especialidade) {
            case 1 -> especialidadeSelecionada = "\n Clínica Geral";
            case 2 -> especialidadeSelecionada = "Pediatria";
            case 3 -> especialidadeSelecionada = "Ginecologia";
            case 4 -> especialidadeSelecionada = "Cardiologia";
            default -> IO.println("Especialidade inválida!");
        }
        IO.println("Especialidade selecionada: " + especialidadeSelecionada + "\n");
        
        IO.println("Essa semana temos os seguintes dias disponíveis para agendamento: \n");
        IO.println("1 - Segunda-feira");
        IO.println("2 - Terça-feira");
        IO.println("3 - Quarta-feira");

        int diaEscolhido = Integer.parseInt(IO.readln("\nDigite o número do dia desejado: \n"));
        String diaSelecionado = "";

        switch (diaEscolhido) {
            case 1 -> diaSelecionado = "Segunda-feira";
            case 2 -> diaSelecionado = "Terça-feira";
            case 3 -> diaSelecionado = "Quarta-feira";
            default -> IO.println("Dia inválido!");
        }
        IO.println("Dia selecionado: " + diaSelecionado + "\n");

        IO.println("Agora escolha o horário da consulta: \n");
        IO.println("1 - 08:00");
        IO.println("2 - 09:00");
        IO.println("3 - 10:00");

        int horarioEscolhido = Integer.parseInt(IO.readln("\nDigite o número do horário desejado: \n"));
        String horarioSelecionado = "";

        switch (horarioEscolhido) {
            case 1 -> horarioSelecionado = "08:00";
            case 2 -> horarioSelecionado = "09:00";
            case 3 -> horarioSelecionado = "10:00";
            default -> IO.println("Horário inválido!");
        }
        IO.println("Horário selecionado: " + horarioSelecionado + "\n");

        IO.println("Agendamento realizado com sucesso! \n");
        IO.println("Resumo do agendamento: \n");
        IO.println("Paciente: " + nomePaciente);
        IO.println("Data de nascimento: " + dataNascimento);
        IO.println("CPF: " + cpf);
        IO.println("Telefone: " + telefone);
        IO.println("Especialidade: " + especialidadeSelecionada);
        IO.println("Dia: " + diaSelecionado);
        IO.println("Horário: " + horarioSelecionado + "\n");

        IO.println("Obrigado por utilizar o sistema de agendamento de consultas médicas! \n");
    }
}
