
# Projeto de Folha de Pagamento

Atividade proposta pelo curso Especialista Java da AlgaWorks com objetivo de fixar os conteúdos apresentado no modulo de orientação a objeto. Desafio de composição de objetos e métodos



## Tecnologias

- Java

## Tarefa de cada classe

A atividade é composta por 5 classes, sendo elas: Funcionario, ContatoTrabalho, Holerite, FolhaPagamento e a classe Principal.

Funcionario: recebe os atributos:
* nome = String nome
* quantidade de filhos = int quantidadeFilhos
E um método do tipo boolean para ver se o funcionário possui filho ou não.

ContatoTrabalho: recebe os atributos:
* funcionário = Funcionario funcionario
* valor hora trabalhada = double valorHoraNormal
* valor hora extra = double valorHoraExtra 
E um método do tipo boolean para checar se o funcionário tem direito a adicional por ter filhos.

Holerite: recebe os atributos:
* funcionário = Funcionario funcionario 
* valor total horas trabalhada = double valorTotalHorasNormais
* valor total hora extra = double valorTotalHorasExtras 
* valor adicional por ter filho = double valorAdicionalParaFilhos. 
A classe também tem dois métodos, um método calcularTotal() para calcular o valor total que o funcionário vai receber e um método imprimir() que imprimi o nome do funcionário, valor a receber por horas trabalhadas, valor a receber pelas horas extras, valor total adicional por ter filhos e o salário total.

FolhaPagamento: a classe tem um método calcularSalario que retorna um Holerite, o método recebe como parâmetro:
* Quantidade de horas trabalhadas = int quantidadeHorasNormais
* Quantidade de horas extras = int quantidadeHorasExtras
* Contrato de Tabalho = ContratoTrabalho contrato

Dentro da classe FolhaPagamento são feitos os cálculos de horas trabalhadas, horas extra e se o funcionário possui filho ou não, caso ele possua 1 ou mais filhos ele receber um adicional de 10% encima do valor total.

