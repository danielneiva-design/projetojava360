public class AlgoritmoTres {
    void main(){
        String nomeAluno = IO.readln("Digite o nome do aluno: ");
        String disciplina = IO.readln("Digite a disciplina: ");
        String nomeTurma = IO.readln("Digite o nome da turma: ");

        //números inteiros de 0 a 100
        int nota1, nota2, nota3;
        //média é real (double)
        double media;
        //operadores: +, -, *, /, %
        //ENTRADA das Notas dos alunos
        nota1 = Integer.parseInt(IO.readln("Digite a primeira nota: "));
        nota2 = Integer.parseInt(IO.readln("Digite a segunda nota: "));
        nota3 = Integer.parseInt(IO.readln("Digite a terceira nota: "));
        //SOMA das notas
        int soma = nota1 + nota2 + nota3;
        //Média das notas
        media = soma / 3.0;
        //SAÍDA das notas SOMA e MÉDIA
        IO.println("Notas: " + nota1 + ", " + nota2 + ", " + nota3);
        IO.println("A soma das notas é: " + soma);
        IO.println("A média das notas é: " + media);

        if (media >= 75) {
            IO.println("Parabéns! " + nomeAluno + " da turma " + nomeTurma + " foi aprovado na disciplina " + disciplina + "!");
        } else {
            IO.println("Que pena! " + nomeAluno + " da turma " + nomeTurma + " foi reprovado na disciplina " + disciplina + "!");
        }
    }
}