PulseStore - API de Serviços Web

O PulseStore é um sistema de back-end robusto projetado para gerenciar operações de e-commerce, incluindo gestão de usuários, pedidos, categorias e produtos, com suporte a fluxos complexos de associação de dados e tratamento de exceções customizado.
🛠 Tecnologias e Ferramentas

    Linguagem: Java 17/25.

    Framework: Spring Boot.

    Gerenciamento de Dependências: Maven.

    Persistência de Dados: JPA / Hibernate.

    Bancos de Dados: H2 (Teste), PostgreSQL (Dev/Prod).

    Ferramentas de API: Postman.

🏗 Arquitetura do Sistema

O projeto segue uma arquitetura em camadas, o que mitiga o risco de acoplamento excessivo e falhas em cascata:

    Camada de Recursos (REST Controllers): Expõe os endpoints da API.

    Camada de Serviço: Concentra a lógica de negócio.

    Camada de Acesso a Dados (Repositories): Interface de comunicação com o banco de dados via JPA.

    Entidades de Domínio: Representação fiel do modelo de dados.

Modelo de Domínio

O sistema implementa associações complexas para refletir um ambiente real de varejo:

    User: Cadastro de clientes com autenticação básica.

    Order: Gestão de pedidos vinculados a usuários e status (WAITING_PAYMENT, PAID, SHIPPED, etc.).

    Product & Category: Relação Many-to-Many permitindo que produtos pertençam a múltiplas categorias.

    OrderItem: Classe de associação com atributos extras (quantidade e preço no momento da venda).

    Payment: Associação One-to-One vinculada ao pedido.

⚙️ Implementação Técnica e Auditoria de Riscos

A viabilidade técnica do PulseStore é sustentada por três perfis de configuração distintos, garantindo que o ambiente de produção não seja contaminado por dados de teste:
Perfil	Banco de Dados	Objetivo
Test	H2 (Em memória)	

Validação rápida de lógica e seeding automático.
Dev	PostgreSQL (Local)	

Deployment escalável com variáveis de ambiente sensíveis.
Tratamento de Exceções

Para evitar o encerramento abrupto de processos e fornecer feedback cirúrgico, foram implementadas exceções customizadas:

    ResourceNotFoundException: Para buscas de ID inexistentes.

    DatabaseException: Para falhas de integridade referencial ao deletar registros.

🚀 Como Executar o Projeto

    Clone o repositório:
    Bash

    git clone https://github.com/acenelio/workshop-springboot2-jpa

    Configuração de Banco: O projeto está pré-configurado para rodar com H2 no perfil test.

    Execução:
    Bash

    ./mvnw spring-boot:run

    Acesse o console H2: http://localhost:8080/h2-console (JDBC URL: jdbc:h2:mem:testdb).
