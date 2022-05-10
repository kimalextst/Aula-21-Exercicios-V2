package exercicio4

/*MINI DESAFIO

4. Crie um sistema bancário de criação de contas, onde a pessoa possa
criar uma conta salário ou uma conta poupança ou conta corrente.
Cada conta deve ter os métodos depósito, saque e saldo.
Para a conta salário, considere o seguinte:
- O saldo deve começar no valor de um salário mínimo brasileiro
(valor vigente do ano de 2022).
- A pessoa não pode fazer um saque que deixe o saldo menor
do que R$0,00. Por exemplo: a pessoa tem um saldo de
R$500.00 e tenta sacar R$ 550,00, o sistema deve apresentar
“Saldo insuficiente”.
- Se a pessoa atender as condições de fazer o saque, o
saldo deve ser atualizado de acordo com a operação e o
novo saldo deve ser mostrado em tela.

- Para depósito, o sistema deve perguntar se quem está fazendo
o depósito é a pessoa EMPREGADORA.
- Se sim, pode realizar o depósito, o saldo deve ser
atualizado de acordo com a operação e o novo saldo
deve ser mostrado em tela.
- Caso contrário, deve apresentar a seguinte mensagem
em tela “Conta Salário só pode receber depósito do
empregador”.

Para a conta poupança, considere o seguinte:
- O saldo deve começar sempre zerado, ou seja, em R$ 0,00.
- A pessoa não pode fazer um saque que deixe o saldo menor
do que R$0,00. Por exemplo: a pessoa tem um saldo de
R$500.00 e tenta sacar R$ 550,00, o sistema deve apresentar
“Saldo insuficiente”.
- Para depósito, o sistema deve perguntar se quem está fazendo
o depósito é a pessoa EMPREGADORA.
- Se sim, pode realizar o depósito e o saldo deve ser
atualizado de acordo com a operação.
- Caso contrário, deve apresentar a seguinte mensagem
em tela “Conta Salário só pode receber depósito do
empregador”.

Para a conta corrente, considere o seguinte:
- O saldo deve começar de acordo com o valor que a pessoa
usuária informar.
- A pessoa pode fazer um saque que deixe o saldo menor do
que R$0,00. Por exemplo: a pessoa tem um saldo de R$500.00
e tenta sacar R$ 550,00, o sistema deve permitir, o saldo deve
ser atualizado de acordo com a operação e exibir em tela o
novo saldo.
- Para depósito, a pessoa não pode fazer um depósito cujo valor
seja maior que R$5.000,00, se a pessoa tentar fazer essa
operação, deve aparecer a mensagem: “Operação inválida,
procure a sua agência.”.
- Caso a pessoa tente fazer um depósito menor do que R$
5.000,00 o saldo deve ser atualizado de acordo com a
operação e o novo saldo deve ser mostrado em tela.

Crie dois objetos para cada tipo de conta, faça duas operações de
cada tipo e mostre em tela cada um dos resultados obtidos.*/