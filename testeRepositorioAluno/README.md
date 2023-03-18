<!--
<<<<<<< HEAD
# Processos-Testes-Software
Este repositório tem como objetivo registrar os meus aprendizados e as atividades executadas na disciplina de "Processos de Testes de Software" do meu 4° período.
=======
# sys-unicap

Sistema desenvolvido durante a Aula de Arquitetura em Camadas - Disciplina de Programação 3
Professor: Léuson da Silva
>>>>>>> 2dcd004 (Creating RepositorioAluno.java's Tests)
---> 

# Atividade 02: Repositório Aluno
> Contexto: Em nossa última aula, nós continuamos exercitando testes unitários, mas desta vez com JUnit 5. Assim, foi possível conhecer novas opções de uso, bem como comparar os novos recursos com a versão prévia do framework. 

## Atividade
Considere um sistema de cadastro de alunos (implementação disponível), onde é possível realizar algumas operações básicas de inserção e busca de elementos. Assim, importem o projeto para o IntelliJ, e verifiquem como o projeto encontra-se organizado. Em seguida, crie casos de testes para as seguintes funcionalidades:

- adição de um novo aluno no sistema;
- adição de um aluno já existente no sistema;
- verificação da existência de um aluno já presente no sistema;
- verificação da existência de um aluno não presente no sistema;
- busca por um aluno pelo seu nome já presente no sistema;
- busca por um aluno pelo seu nome não presente no sistema.

**Entrega:** Baseado nos cenários de uso do sistema proposto, cada estudante deverá apresentar a implementação de testes unitários. <br>
**DICA:** todas as funcionalidades listadas neste exercício encontram-se implementados a partir da classe RepositorioAluno.java

## Resultado

- **Visualização do Sistema**

Antes de começarmos a testar o nosso sistema de alunos, vamos apenas visualizar se a classe que fizemos deu certo.

```java

@Test
  public void myTest() {
    System.out.println("Meu teste...");
  }

```

- **Teste 01: Inserir Alunos**

Estando criado a nossa class "Aluno", com os requisitos - nome e matricula - necessários e já criado um método para cadastrar os alunos. Este teste se concentra em testar se o método de cadastro está funcionando. 

```java

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
```

Como foi visto, precisou instanciar a nossa classe, inserir os dados e depois verificar a quantidade de alunos na nossa lista de array, se o valor é compatível com o nosso cadastro. 

Perceba que agora precisamos usar o "Assertions" antes de qualquer "assert...", isso pois, estamos usando o JUnit 5.

