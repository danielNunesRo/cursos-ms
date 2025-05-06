# Gestão de Cursos API

Este projeto é uma aplicação de gerenciamento de cursos, que permite criar, atualizar, excluir e listar cursos em um banco de dados. A comunicação entre a camada de front-end e back-end é feita por meio de uma API RESTful.

## Tecnologias Utilizadas
- Java: Linguagem de programação principal.
- Spring Boot: Framework para construção da API.
- JPA (Java Persistence API): Para persistência de dados com o banco de dados.
- Lombok: Biblioteca para redução de código boilerplate, como getters, setters, constructors, etc.
- Spring Web: Para construir a API REST.

**Pré-requisitos**
Antes de rodar o projeto, você precisará ter instalado:

- JDK 21 ou superior
- Maven (opcional, se não estiver usando o Spring Boot Maven plugin)

## Como Rodar o Projeto
1. Clone o repositório
bash
Copiar código
git clone [git@github.com:danielNunesRo/cursos-ms.git](https://github.com/danielNunesRo/cursos-ms.git)
cd projeto-gestao-cursos

2. Abra o projeto em sua IDE
Abra o projeto na IDE de sua preferência (como IntelliJ IDEA ou Eclipse).

3. Execute a aplicação
Se estiver usando uma IDE, basta executar a classe principal GestaoCursosApplication.java (essa classe deve ter a anotação @SpringBootApplication).

você pode rodar o seguinte comando no terminal:

```
mvn spring-boot:run
```
A aplicação será iniciada na porta 8080 por padrão.
