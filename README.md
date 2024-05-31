# Product Management Microservice

## Descrição

Este projeto é um microsserviço de gerenciamento de produtos, desenvolvido utilizando Spring. A API exposta é RESTful e permite realizar operações CRUD nos objetos `Product` e `Category`, que estão relacionados entre si. 

## Tecnologias Utilizadas

- **Java**
- **Spring Framework**
- **MySQL**: Utilizado como banco de dados.
- **Postman**: Utilizado para testar a API.
- **Conceitos**: Clean Code, Clean Architecture, REST.

## Funcionalidades

A API permite as seguintes operações CRUD:

### Product

- **Create**: Adicionar um novo produto.
- **Read**: Buscar um produto pelo ID ou listar todos os produtos.
- **Update**: Atualizar as informações de um produto existente.
- **Delete**: Remover um produto.

### Category

- **Create**: Adicionar uma nova categoria.
- **Read**: Buscar uma categoria pelo ID ou listar todas as categorias.
- **Update**: Atualizar as informações de uma categoria existente.
- **Delete**: Remover uma categoria.

## Estrutura do Projeto

A estrutura do projeto segue os princípios de Clean Architecture, garantindo que o código seja modular, fácil de manter e escalável.


## Configuração do Banco de Dados

No arquivo `application.properties`, configure suas credenciais do MySQL:

```
properties:
spring.datasource.url=your_url
spring.datasource.username=your_username
spring.datasource.password=your_password
```

## Testando a API
Utilize o Postman para testar os endpoints da API.

Endpoints:

Product
POST /products: Adicionar um novo produto.
GET /products/{id}: Buscar um produto pelo ID.
GET /products: Listar todos os produtos.
PUT /products/{id}: Atualizar um produto existente.
DELETE /products/{id}: Remover um produto.

Category
POST /categories: Adicionar uma nova categoria.
GET /categories/{id}: Buscar uma categoria pelo ID.
GET /categories: Listar todas as categorias.
PUT /categories/{id}: Atualizar uma categoria existente.
DELETE /categories/{id}: Remover uma categoria.
