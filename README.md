🌍 Hello World API - Backend
Este é o backend do projeto Hello World API, desenvolvido com Java 21 e Spring Boot. A aplicação oferece uma API REST simples que permite salvar um nome via POST e, em seguida, exibir uma saudação personalizada via GET. Ideal para testes de integração com frontends em React ou outros sistemas.

🚀 Tecnologias Utilizadas
✅ Java 21

✅ Spring Boot

✅ Spring Web

✅ Lombok

✅ Maven

✅ Postman (para testes)

✅ MySQL (opcional, se desejar persistência)

⚙️ Como rodar o projeto localmente
✅ Pré-requisitos:
Java 21 instalado

IDE como Eclipse ou IntelliJ

Lombok instalado/configurado

Postman (ou Insomnia) para testes

Projeto clonado na máquina

▶️ Rodando o projeto
Clone o repositório:

bash
Copiar
Editar
git clone https://github.com/GabrielSedcu1/HelloWord-Back.git
cd HelloWord-Back
Abra o projeto em sua IDE.

Execute a classe principal:

java
Copiar
Editar
HelloWorldApplication.java
Por padrão, a API estará disponível em:

arduino
Copiar
Editar
http://localhost:8080/Hello_World
📁 Estrutura de Pastas
css
Copiar
Editar
src
└── main
    ├── java
    │   └── com
    │       └── kipper
    │           └── first_spring_app
    │               ├── controller
    │               │   └── HelloWorldController.java
    │               ├── service
    │               │   └── HelloWorldService.java
    │               └── entity
    │                   └── User.java
    └── resources
        └── application.properties
📋 Endpoints da API
🔸 GET /Hello_World
Retorna uma saudação. Se um nome foi salvo antes, responde:

nginx
Copiar
Editar
Hello World Veronica
🔸 POST /Hello_World
Envia um nome para salvar na memória e retorna uma confirmação.

Corpo da requisição:

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
🧪 Testando com Postman
Faça uma requisição POST para:

arduino
Copiar
Editar
http://localhost:8080/Hello_World
Com corpo (raw / JSON):

json
Copiar
Editar
{ "name": "Veronica" }
Depois, faça uma requisição GET para:

arduino
Copiar
Editar
http://localhost:8080/Hello_World
Você verá a resposta:

nginx
Copiar
Editar
Hello World Veronica
📚 Referência
Projeto inspirado para fins didáticos em integrações frontend/backend com Spring Boot + React.

Repositório no GitHub:
https://github.com/GabrielSedcu1/HelloWord-Back.git

