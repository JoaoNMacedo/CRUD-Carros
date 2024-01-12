# CRUD de Carros - JavaSpringBoot

Este projeto é um CRUD (Create, Read, Update, Delete) desenvolvido em JavaSpringBoot para gerenciar informações sobre carros. Ele oferece operações básicas para registrar, visualizar, atualizar e excluir dados relacionados a diferentes modelos e marcas de carros, incluindo vários atributos específicos.

## Funcionalidades

- **Cadastro de Carro:**
  - Registre novos carros, incluindo informações como marca, modelo e outros atributos relevantes.

- **Consulta de Carros:**
  - Visualize a lista completa de carros registrados.

- **Atualização de Informações:**
  - Atualize os detalhes de um carro existente.

- **Exclusão de Carro:**
  - Remova carros da base de dados.

## Atributos do Carro

Cada registro de carro inclui informações sobre:

- Marca
- Modelo
- Ano de Fabricação
- Cor
- Combustível
- Número de Portas
- Entre outros atributos específicos.

## Pré-requisitos

Antes de executar o CRUD, certifique-se de ter as seguintes ferramentas instaladas em seu ambiente:

- Java Development Kit (JDK) 8 ou superior
- Maven
- Banco de dados H2 configurado

## Executando o CRUD

1. Clone o repositório para o seu ambiente local.

2. Acesse o diretório raiz do projeto via terminal.

3. Execute os seguintes comandos para compilar e construir o projeto:

   ```shell
   mvn clean install

Você pode iniciar o CRUD de carros de duas maneiras:

Via Terminal:

  ```shell
  java -jar target/nome-do-arquivo.jar


Via IDE Spring Boot:
Importe o projeto para sua IDE preferida (como IntelliJ ou Eclipse) e execute a classe principal (Application.java) como um aplicativo Spring Boot.

Prossiga com as instruções adicionais fornecidas no README do projeto para iniciar a aplicação. Certifique-se de configurar adequadamente o banco de dados H2 e iniciar o aplicativo.

Este CRUD oferece uma maneira eficiente de gerenciar informações sobre carros, proporcionando uma experiência simples e intuitiva para manipulação de dados usando a plataforma JavaSpringBoot com o banco de dados H2 integrado. Você pode escolher entre rodar o aplicativo via terminal ou através da IDE Spring Boot, dependendo de suas preferências.
