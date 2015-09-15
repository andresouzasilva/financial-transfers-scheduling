# Financial Transfers Scheduling - FTS 

A aplicação foi feita baseada na arquitetura REST, utilizando [Spring Boot][sb] como base.

Foram utilizados os seguintes padrões de projeto para resolução do problema:
  - Strategy
  - Factory

Para rodar a aplicação basta executar a classe **br.tur.reservafacil.FTSMain**

# Adicionar um agendamento de transferência financeira
Para adicionar um agendamento de transferência financeira basta fazer uma requisição **POST** em  http://localhost:8080/fts, enviando um payload seguindo o padrão abaixo.

Obs: Enviar o Header Content-Type como "application/json", na requisição.
```json
{
    "to": "XXXXX-X", 
    "from": "XXXXX-X", 
    "value": "20.0",
    "type": "A",
    "schedulingDate": "14/10/2015"
}
```
Onde : 
  - "to": Conta de Origem
  - "from": Conta de Destino
  - "value": Valor da Transferência
  - "type": Tipo da Trasferência (A/B/C/D)
  - "schedulingDate": Data do Agendamento (Formato dd/MM/yyyy)

# Listar todos os agendamentos de transferência financeira
Para listar todos os agendamentos de transferência financeira basta fazer uma requisição **GET** em  http://localhost:8080/fts.

Obs: Os agendamentos são persistidos apenas em memória (tempo de execução).

   [sb]: <http://projects.spring.io/spring-boot/>
