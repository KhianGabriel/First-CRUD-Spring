<h1>CRUD de Produtos - Spring Boot - Primeiro Projeto Spring</h1>

<p>Este é um projeto simples de CRUD (Create, Read, Update, Delete) para gerenciamento de produtos, desenvolvido com Spring Boot. O objetivo é servir como um exemplo básico para aprendizado e referência.</p>

<h2>Tecnologias Utilizadas</h2>

<ul>
  <li>Java 17</li>
  <li>Spring Boot</li>
  <li>Spring Data JPA</li>
  <li>Hibernate</li>
  <li>Banco de Dados postegreSQL</li>
  <li>Spring Web</li>
  <li>Maven</li>
</ul>

<h2>Como Executar o Projeto</h2>

<ol>
  <li>Clone o repositório:</li>  
    git clone https://github.com/KhianGabriel/First-CRUD-Spring.git
  <li>Acesse o diretório do projeto:</li>
    cd crud
  <li>Compile e execute o projeto:</li>
    mvn spring-boot:run
</ul>

<h2>Endpoints da API</h2>

A API expõe os seguintes endpoints para manipulação de produtos:

<h3>Criar um novo produto</h3>
  <p><strong>POST</strong> /api/produtos</p>
  <p>Corpo da requisição (JSON):</p>
    {<br>
    "name": "Produto(camiseta,calça,carro)",<br>
    "price_in_cents": 100.0,<br>
    }<br>

<h3>Listar todos os produtos</h3>

GET /api/produtos

Buscar um produto

<p><strong>GET</strong> /api/produtos</p>

<h3>Atualizar um produto</h3>

<p><strong>PUT</strong> /api/produtos/{id}

 <p>Corpo da requisição (JSON):</p>

{<br>
  "nome": "Produto Atualizado",<br>
  "preco": 120.0,<br>
}<br>

<h3>Excluir um produto</h3>

<p><strong>DELETE</strong> /api/produtos/{id}</p>

<h3>Configuração do Banco de Dados</h3>

<p>
spring.datasource.url=jdbc:postgresql://localhost:5432/product
spring.datasource.username=admin
spring.datasource.password=admin
spring.datasource.driver-class-name=org.postgresql.Driver
</p>

<h3>Melhorias Futuras</h3>

<ul>
  <li>Criar validações e ampliar a aplicação</li>
  <li>Documentação da API com Swagger</li>
</ul>

<h3>Autor</h3>
<p>Khian Gabriel Brito Fortunato</p>

