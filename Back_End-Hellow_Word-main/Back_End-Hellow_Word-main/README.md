🌍 HelloWorld API - Backend
Este é o backend do projeto HelloWorld, desenvolvido com Spring Boot e MySQL. A aplicação disponibiliza uma API RESTful para cadastrar e consultar nomes de forma simples e prática.

🚀 Tecnologias Utilizadas
Java 21

Spring Boot

Spring Data JPA

Spring Web

MySQL

Swagger (Documentação da API)

Lombok

Maven

Eclipse IDE ou IntelliJ

Postman

Workbench

📦 Dependências
Spring Boot DevTools

Spring Web

Spring Data JPA

MySQL Driver

Lombok

Swagger OpenAPI

📁 Estrutura de Pastas
plaintext
Copiar
Editar
src  
├── main  
│   ├── java  
│   │   └── com.globo.first_spring_app  
│   │       ├── FirstSpringAppApplication.java  
│   │       ├── configuration  
│   │       │   └── HelloWorldConfiguration.java  
│   │       ├── controller  
│   │       │   └── HelloWorldController.java  
│   │       ├── entity  
│   │       │   └── User.java  
│   │       └── service  
│   │           └── HelloWorldService.java  
│   └── resources  
│       ├── application.properties  
│       └── static/  
└── test  
🔗 Endpoints da API
Método	Endpoint	Descrição
GET	/hello	Retorna a mensagem cadastrada
POST	/hello	Cadastra um nome

🛠️ Modificações no Projeto
✅ A controller foi ajustada para tratar requisições GET e POST de forma organizada e dinâmica.

✅ A entidade User foi simplificada, mantendo apenas os dados essenciais.

✅ O serviço (Service) foi reformulado para que o GET retorne os dados cadastrados via POST, substituindo a resposta fixa anterior.

✅ O arquivo de configuração teve métodos renomeados para refletirem melhor sua responsabilidade.

📚 Referência
Projeto baseado no conteúdo do canal Fernanda Kipper | Dev no vídeo: Curso Spring para Iniciantes, com adaptações e melhorias.

