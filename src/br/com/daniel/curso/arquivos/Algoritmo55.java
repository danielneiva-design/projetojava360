package br.com.daniel.curso.arquivos;

import java.util.Map;
import java.util.HashMap;
import javax.swing.JOptionPane;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Algoritmo55 {

    /*
     * Considerando a lógica aristotélica, organize os programas de fluxogramas e
     * pseudocódigo a saber:
     *
     * visualgo.net
     * csvistool.com
     * geeksforgeeks.org
     * FAQ do professor nesse repositório: faq_logica.pdf
     *
     * Crie um arquivo que possa armazenar valores de um dicionário
     * Map (Interface) - HashMap (Classe)
     *
     * Ambiente - Laboratório de programação JAVA
     * Chave: F07
     * Chave: F07 Descrição: "Laboratório de programação Java"
     * Chave: B03 Descrição: "Sala de Aula Padrão"
     * Chave: G09 Descrição: "Oficina de lanternagem e pintura"
     *
     * Problema:
     * Criar um cadastro de um dicionário de ambientes, esse cadastro deverá
     * armazenar em um arquivo .txt, deverá ter um loop (DO WHILE)
     * com um menu de opções.
     *
     * 1) Cadastrar
     * 2) Listar
     * 3) Pesquisar
     * 4) Excluir
     * 5) Alterar
     * 6) Sair
     *
     * Avaliação de capacidades:
     * - Elaborar e explicar um (TRY, CATCH, FINALLY)
     * - Uso de JOptionPane ou JFrame ou outros SWING
     * - Elaborar e explicar LocalDateTime
     * - Elaborar e explicar FileWriter
     * - Elaborar e explicar HashMap
     * - Elaborar e explicar Map
     * - Elaborar e explicar a organização do código
     *
     */

    public void main() {

        Map<String, String> ambientes = new HashMap<>();
        String titulo = "CADASTRO DE AMBIENTES";

        File arquivo = new File("ambientes.txt");

        if (arquivo.exists()) {
            carregarArquivo(ambientes);
        } else {
            ambientes.put("F07", "Laboratório de programação Java");
            ambientes.put("B03", "Sala de Aula Padrão");
            ambientes.put("G09", "Oficina de lanternagem e pintura");
            salvarArquivo(ambientes);
        }

        int opcao;

        do {

            opcao = Integer.parseInt(JOptionPane.showInputDialog(
                    null,
                    "Menu de Opções:\n1) Cadastrar\n2) Listar\n3) Pesquisar\n4) Excluir\n5) Alterar\n6) Sair",
                    titulo,
                    JOptionPane.QUESTION_MESSAGE));

            switch (opcao) {

                case 1 -> {
                    // Cadastrar
                    String chave = JOptionPane.showInputDialog(
                            null,
                            "Digite a chave do ambiente:",
                            titulo,
                            JOptionPane.QUESTION_MESSAGE);

                    if (ambientes.containsKey(chave)) {

                        JOptionPane.showMessageDialog(
                                null,
                                "Este ambiente já está cadastrado.\nUtilize a opção 5 para alterar.",
                                titulo,
                                JOptionPane.WARNING_MESSAGE);

                    } else {

                        String descricao = JOptionPane.showInputDialog(
                                null,
                                "Digite a descrição do ambiente:",
                                titulo,
                                JOptionPane.QUESTION_MESSAGE);

                        ambientes.put(chave, descricao);
                        salvarArquivo(ambientes);
                    }
                }

                case 2 -> {
                    // Listar
                    String lista = "";

                    for (Map.Entry<String, String> entry : ambientes.entrySet()) {
                        lista += "Chave: " + entry.getKey() + ", Descrição: " + entry.getValue() + "\n";
                    }

                    JOptionPane.showMessageDialog(
                            null,
                            lista,
                            titulo,
                            JOptionPane.INFORMATION_MESSAGE);
                }

                case 3 -> {
                    // Pesquisar
                    String chave = JOptionPane.showInputDialog(
                            null,
                            "Digite a chave do ambiente para pesquisar:",
                            titulo,
                            JOptionPane.QUESTION_MESSAGE);

                    String descricao = ambientes.get(chave);

                    if (descricao != null) {

                        JOptionPane.showMessageDialog(
                                null,
                                "Chave: " + chave + "\nDescrição: " + descricao,
                                titulo,
                                JOptionPane.INFORMATION_MESSAGE);

                    } else {

                        JOptionPane.showMessageDialog(
                                null,
                                "Ambiente não encontrado.",
                                titulo,
                                JOptionPane.WARNING_MESSAGE);
                    }
                }

                case 4 -> {
                    // Excluir
                    String chave = JOptionPane.showInputDialog(
                            null,
                            "Digite a chave do ambiente para excluir:",
                            titulo,
                            JOptionPane.QUESTION_MESSAGE);

                    String descricao = ambientes.remove(chave);

                    if (descricao != null) {

                        JOptionPane.showMessageDialog(
                                null,
                                "Ambiente excluído:\n" + chave + " - " + descricao,
                                titulo,
                                JOptionPane.INFORMATION_MESSAGE);

                        salvarArquivo(ambientes);

                    } else {

                        JOptionPane.showMessageDialog(
                                null,
                                "Ambiente não encontrado.",
                                titulo,
                                JOptionPane.WARNING_MESSAGE);
                    }
                }

                case 5 -> {
                    // Alterar
                    String chave = JOptionPane.showInputDialog(
                            null,
                            "Digite a chave do ambiente para alterar:",
                            titulo,
                            JOptionPane.QUESTION_MESSAGE);

                    if (ambientes.containsKey(chave)) {

                        String novaDescricao = JOptionPane.showInputDialog(
                                null,
                                "Digite a nova descrição do ambiente:",
                                titulo,
                                JOptionPane.QUESTION_MESSAGE);

                        ambientes.put(chave, novaDescricao);
                        salvarArquivo(ambientes);

                    } else {

                        JOptionPane.showMessageDialog(
                                null,
                                "Ambiente não encontrado.",
                                titulo,
                                JOptionPane.WARNING_MESSAGE);
                    }
                }

                case 6 -> {
                    // Sair
                    JOptionPane.showMessageDialog(
                            null,
                            "Saindo do programa.",
                            titulo,
                            JOptionPane.INFORMATION_MESSAGE);
                }

                default -> {
                    // Opção inválida
                    JOptionPane.showMessageDialog(
                            null,
                            "Opção inválida. Tente novamente.",
                            titulo,
                            JOptionPane.ERROR_MESSAGE);
                }
            }

        } while (opcao != 6);
    }

    void salvarArquivo(Map<String, String> ambientes) {
        // FileWriter aqui
        try (FileWriter arquivo = new FileWriter("ambientes.txt")) {

            DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

            for (Map.Entry<String, String> entry : ambientes.entrySet()) {

                LocalDateTime agora = LocalDateTime.now();

                arquivo.write(
                        agora.format(formato) + ";" +
                                entry.getKey() + ";" +
                                entry.getValue() + "\n");
            }

            arquivo.flush();

            JOptionPane.showMessageDialog(
                    null,
                    "Arquivo salvo com sucesso!",
                    "CADASTRO DE AMBIENTES",
                    JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {

            JOptionPane.showMessageDialog(
                    null,
                    "Erro ao salvar arquivo: " + e.getMessage(),
                    "CADASTRO DE AMBIENTES",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    void carregarArquivo(Map<String, String> ambientes) {

        try (BufferedReader arquivo = new BufferedReader(new FileReader("ambientes.txt"))) {

            String linha;

            while ((linha = arquivo.readLine()) != null) {

                String[] dados = linha.split(";", 2);

                if (dados.length == 2) {
                    ambientes.put(dados[0], dados[1]);
                }
            }

        } catch (Exception e) {

            JOptionPane.showMessageDialog(
                    null,
                    "Erro ao carregar arquivo: " + e.getMessage(),
                    "CADASTRO DE AMBIENTES",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
}