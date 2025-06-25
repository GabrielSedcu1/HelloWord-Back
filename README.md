🌍 Hello World API - Backend
Este é o backend do projeto Hello World API, desenvolvido com Spring Boot. Ele fornece uma API RESTful simples que permite cadastrar um nome e retornar uma saudação personalizada — ideal para estudos, integrações com frontend ou demonstrações de APIs.

🔗 Repositório: HelloWord-Back

🧪 Tecnologias Utilizadas
✅ Java 21
✅ Eclipse IDE
✅ Postman
✅ Lombok
✅ Maven

📦 Dependências
✅ Spring Boot DevTools
✅ Spring Web
✅ Lombok

⚙️ Como rodar o projeto localmente
✅ Pré-requisitos
Java 21 instalado

IDE (Eclipse, IntelliJ ou VSCode)

Lombok configurado na IDE

Postman (ou Insomnia) para testar a API

▶️ Passos para rodar
Clone o repositório:

bash
Copiar
Editar
git clone https://github.com/GabrielSedcu1/HelloWord-Back.git
cd HelloWord-Back
Abra o projeto em sua IDE, aguarde o Maven instalar as dependências e execute a classe HelloWorldApplication.

A aplicação estará disponível em:
👉 http://localhost:8080/Hello_World

📁 Estrutura de Pastas
css
Copiar
Editar
src
├── main
│   ├── java
│   │   └── com.kipper.first_spring_app
│   │       ├── controller
│   │       │   └── HelloWorldController.java
│   │       ├── service
│   │       │   └── HelloWorldService.java
│   │       └── entity
│   │           └── User.java
│   └── resources
│       └── application.properties
└── test
📬 Testes com Postman
📌 Obter saudação
GET

arduino
Copiar
Editar
http://localhost:8080/Hello_World
Retorno:

nginx
Copiar
Editar
Hello World Veronica
➕ Cadastrar nome
POST

arduino
Copiar
Editar
http://localhost:8080/Hello_World
Body (JSON):

json
Copiar
Editar
{
  "name": "Veronica"
}
Resposta:

yaml
Copiar
Editar
Nome salvo com sucesso: Veronica
📚 Referência
Projeto desenvolvido com base nas boas práticas do ecossistema Spring Boot, ideal para aprendizado, integração com frontend e APIs simples.

🎥 Vídeo Sugerido:
Como criar uma aplicação Fullstack com Java e React – Fernanda Kipper

