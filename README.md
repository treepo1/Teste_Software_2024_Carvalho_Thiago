# Teste_Software_2024_Carvalho_Thiago


## Problema
Na pergunta em questão, o desenvolvedor se questiona de que forma pode testar e mockar um método de uma classe cujo retorno é void. Para demonstrar o problema, o usuário fornece uma replicação incompleta do código fonte, apenas para fim de entendimento da dúvida.

## Solução

Na resposta aceita pelo Stack Overflow, o usuário recomenda utilizar os métodos
feitos para testes em métodos void de acordo com a recomendação da
documentação do próprio Mockito.

De acordo com o link enviado pelo usuário, é possível ver que a documentação da
API do Mockito informa o caso de uso dos seguintes métodos:


You can use doThrow(), doAnswer(), doNothing(), doReturn() and
doCallRealMethod() in place of the corresponding call with when(), for any
method. It is necessary when you
● stub void methods
● stub methods on spy objects (see below)
● stub the same method more than once, to change the behaviour of a mock in
the middle of a test

O usuário ainda disponibiliza um trecho de código utilizando o método doAnswer.
Este método permite ao programador uma maior observabilidade e manipulação do
comportamento do método. No exemplo, ele o utiliza para checar os
argumentos que foram enviados para o método setState da classe World.


## Replicação do problema e configuração de ambiente

No seu terminal, execute:

```git clone https://github.com/treepo1/Teste_Software_2024_Carvalho_Thiago```

Abra a pasta do projeto na sua IDE (No caso de teste, foi utilizado o Intelij IDEA)

```Execute o teste em: src/test/java/WorldTest.java```

O relatório em PDF está disponível aqui.