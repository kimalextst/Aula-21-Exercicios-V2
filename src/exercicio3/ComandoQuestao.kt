package exercicio3

/*Após a sua formação no Catalisa, o pessoal te redirecionou para o
cliente chamado ICarros. No seu primeiro dia de trabalho , a sua tech
lead te pediu que crie um sistema simples de registro de carros para
que o time comece a catalogar os tipos de carros que o cliente
possui para financiamento. Ela te passou que, por enquanto, o cliente
trabalha apenas com 3 marcas de carros, sendo Renault, Fiat e
Hyundai e todos os carros possuem as seguintes informações:
- Marca;
- Ano;
- Valor;
- Cor;
- Portas;
- Velocidade.
Depois, sua tech lead te informou que todos os carros iniciam a
partida do motor, freiam e aceleram, porém, cada um faz isso de uma
forma diferente.
Para o carro Renault, considere o seguinte:
- Quando ele inicia a partida do carro, ele mostra a mensagem:
“Iniciando o motor... minha velocidade está em [VELOCIDADE]”
e a velocidade é igual a zero km/h.
- Quando ele freia, ele mostra a mensagem: "Freando... minha
velocidade está em [VELOCIDADE]" e a velocidade perde
5km/h a cada chamada do freio, ou seja, a cada chamada do
método frear.
- Quando ele acelera, ele mostra a mensagem: “Acelerando...
minha velocidade está em [VELOCIDADE]”, a velocidade
aumenta em 10km/h a cada pisada no acelerador, ou seja, a
cada chamada do método acelerar.

Para o carro Fiat, considere o seguinte:

- Quando ele inicia a partida do carro, ele mostra a mensagem:
“Iniciando o motor... minha velocidade está em [VELOCIDADE]”
e a velocidade é igual a 3 km/h.
- Quando ele freia, ele mostra a mensagem: "Freando... minha
velocidade está em [VELOCIDADE]" e a velocidade perde
6km/h a cada chamada do freio, ou seja, a cada chamada do
método frear.
- Quando ele acelera, ele mostra a mensagem: “Acelerando...
minha velocidade está em [VELOCIDADE]”, a velocidade
aumenta em 12km/h a cada pisada no acelerador, ou seja, a
cada chamada do método acelerar.

Para o carro Hyundai, considere o seguinte:
- Quando ele inicia a partida do carro, ele mostra a mensagem:
“Iniciando o motor... minha velocidade está em [VELOCIDADE]”
e a velocidade é igual a 5km/h.
- Quando ele freia, ele mostra a mensagem: "Freando... minha
velocidade está em [VELOCIDADE]" e a velocidade perde
2km/h a cada chamada do freio, ou seja, a cada chamada do
método frear.
- Quando ele acelera, ele mostra a mensagem: “Acelerando...
minha velocidade está em [VELOCIDADE]”, a velocidade
aumenta em 15km/h a cada pisada no acelerador, ou seja, a
cada chamada do método acelerar.
Ela também te pediu para criar, ou seja, instanciar no método main,
pelo menos um exemplo de cada marca de carros feito para que, quando o
time rodar o programa, as pessoas possam ver como fica o registro e
comportamento desses carros no sistema.*/