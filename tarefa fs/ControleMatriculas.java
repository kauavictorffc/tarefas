import java.util.ArrayList;
import java.util.List;

// Passo 1: Crie uma interface para representar uma disciplina
interface Disciplina {
    void realizarMatricula(String aluno);
    void exibirListaMatriculados();
}

// Passo 2: Crie uma classe abstrata para representar uma disciplina abstrata
abstract class DisciplinaAbstrata {
    private List<String> listaMatriculados = new ArrayList<>();

    public abstract void realizarMatricula(String aluno);

    public void exibirListaMatriculados() {
        System.out.println("Alunos matriculados:");
        for (String aluno : listaMatriculados) {
            System.out.println(aluno);
        }
    }

    protected void adicionarMatriculado(String aluno) {
        listaMatriculados.add(aluno);
        System.out.println("Matrícula realizada para o aluno: " + aluno);
    }
}

// Passo 3: Implemente a disciplina usando a interface
class DisciplinaComInterface implements Disciplina {
    private List<String> listaMatriculados = new ArrayList<>();

    @Override
    public void realizarMatricula(String aluno) {
        listaMatriculados.add(aluno);
        System.out.println("Matrícula realizada para o aluno: " + aluno);
    }

    @Override
    public void exibirListaMatriculados() {
        System.out.println("Alunos matriculados:");
        for (String aluno : listaMatriculados) {
            System.out.println(aluno);
        }
    }
}

// Passo 4: Implemente a disciplina usando a classe abstrata
class DisciplinaComClasseAbstrata extends DisciplinaAbstrata {
    @Override
    public void realizarMatricula(String aluno) {
        adicionarMatriculado(aluno);
    }
}

// Passo 5: Exemplo de uso da implementação com interface e classe abstrata
public class ControleMatriculas {
    public static void main(String[] args) {
        // Usando a implementação com interface
        Disciplina disciplina1 = new DisciplinaComInterface();

        disciplina1.realizarMatricula("João");
        disciplina1.realizarMatricula("Maria");

        disciplina1.exibirListaMatriculados();

        System.out.println("------------------------");

        // Usando a implementação com classe abstrata
        DisciplinaAbstrata disciplina2 = new DisciplinaComClasseAbstrata();

        disciplina2.realizarMatricula("Carlos");
        disciplina2.realizarMatricula("Ana");

        disciplina2.exibirListaMatriculados();
    }
}

