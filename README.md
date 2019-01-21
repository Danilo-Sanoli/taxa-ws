# Serviços relacionados à taxas

## Serviços

- `taxas/salvar`: Serviço responsável por salvar taxas
- `taxas/cpf{CPF}`: Serviço responsável por buscar taxas através de um CPF


## Descrição

	Foi construído um projeto específico para taxas, para desvincular taxas de qualquer outra entidade. Já que os valores de taxas são sigilosos, evitamos que sejam trafegados em consultas de outras entidades.
	
## Execução

- `Porta`: 8081

## Banco de Dados

- `URL`: http://localhost:8081/h2
- `Base de Dados`: jdbc:h2:file:/home/taxas_bd
- `Usuário`: admin
- `Senha`: admin