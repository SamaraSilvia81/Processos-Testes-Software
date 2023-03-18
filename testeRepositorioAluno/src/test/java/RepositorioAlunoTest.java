import dados.aluno.RepositorioAluno;
import negocio.aluno.entidade.Aluno;
import negocio.excecoes.AlunoInexistenteException;
import negocio.excecoes.AlunoJaCadastradoException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RepositorioAlunoTest {

  @Test
  public void myTest() {
    System.out.println("Meu teste...");
  }

  @Test
  public void inserirAluno() throws AlunoJaCadastradoException {
    RepositorioAluno repositorioAluno = new RepositorioAluno();

    Aluno aluno = new Aluno("Samara Silvia","012");
    Aluno aluno2 = new Aluno("Eudes Pereira","023");
    Aluno aluno3 = new Aluno("Matheus Santos","034");

    repositorioAluno.inserirAluno(aluno);
    repositorioAluno.inserirAluno(aluno2);
    repositorioAluno.inserirAluno(aluno3);

    Assertions.assertEquals(3,repositorioAluno.getNumberAlunos());
  }

  @Test
  public void alunoExistente() throws AlunoJaCadastradoException {
    RepositorioAluno repositorioAluno = new RepositorioAluno();

    Aluno aluno = new Aluno("Samara Silvia","012");
    repositorioAluno.inserirAluno(aluno);

    Assertions.assertThrows(AlunoJaCadastradoException.class, () -> {
      repositorioAluno.inserirAluno(aluno);
    });

    //Assertions.assertEquals(1,repositorioAluno.getNumberAlunos());
  }

  @Test
  public void verificarExistenciaAluno() throws AlunoJaCadastradoException {
    RepositorioAluno repositorioAluno = new RepositorioAluno();

    Aluno aluno = new Aluno("Samara Silvia","012");
    repositorioAluno.inserirAluno(aluno);
    repositorioAluno.verificarExistenciaAluno("012");
    //Assertions.assertEquals(1,repositorioAluno.getNumberAlunos());

    Assertions.assertTrue(repositorioAluno.verificarExistenciaAluno("012"));
    //Assertions.assertTrue(repositorioAluno.verificarExistenciaAluno("789"));
  }

  @Test
  public void verificarNaoExistenciaAluno() throws AlunoJaCadastradoException {
    RepositorioAluno repositorioAluno = new RepositorioAluno();

    Aluno aluno = new Aluno("Samara Silvia","012");
    repositorioAluno.inserirAluno(aluno);

    //repositorioAluno.verificarExistenciaAluno("789");
    //Assertions.assertEquals(1,repositorioAluno.getNumberAlunos());

    Assertions.assertFalse(repositorioAluno.verificarExistenciaAluno("456"));
  }

  @Test
  public void buscarAlunoExistente() throws AlunoJaCadastradoException, AlunoInexistenteException {
    RepositorioAluno repositorioAluno = new RepositorioAluno();

    Aluno aluno = new Aluno("Samara Silvia","012");
    repositorioAluno.inserirAluno(aluno);
    repositorioAluno.buscarAluno("Samara Silvia");
    //repositorioAluno.buscarAluno("Thomas Hiddleston");
  }

  @Test
  public void buscarAlunoNaoExistente() throws AlunoJaCadastradoException, AlunoInexistenteException {
    RepositorioAluno repositorioAluno = new RepositorioAluno();

    Aluno aluno = new Aluno("Samara Silvia","012");
    repositorioAluno.inserirAluno(aluno);
    //repositorioAluno.buscarAluno("Samara Silvia");

    Assertions.assertThrows(AlunoInexistenteException.class, () -> {
      repositorioAluno.buscarAluno("Thomas Hiddleston");
      //repositorioAluno.buscarAluno("Samara Silvia");  // Erro Proposital: Para vê que se eu colocar um aluno que existe ele não entra nessa exceção
    });
  }
}