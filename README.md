# Teste De Aplicação Empresa ONI learning

### OBS: O banco de dados está na pasta src/main/resources/db

Criar um CRUD em MVC para cadastro de fornecedores e produtos que este
fornecedor trabalha. Não é necessário o uso de nenhum template de interface.

Abaixo estão os requisitos para o teste.

O banco de dados deverá ser entregue em formato dump com o nome **bd.sql** junto
com os arquivos fonte do projeto.

O projeto deve ser entregue em formato **zip** e deve conter todos os arquivos de código
necessários para a execução dele.

**Banco Mysql 8**

**PHP 8**


| Tabela Fornecedor |            | 
|-------------------|------------|
| ID Fornecedor     |            |
| Nome Fornecedor   |            |
| Data de Cadastro  |            |

| Tabela Produtos   |            |
|-------------------|------------|
| ID Produto        |            |
| Nome Produto      |            |
| Data de Cadastro  |            |

| Tabela Fornecedor / Produtos |            |
|------------------------------|------------|
| ID Produto                   |            |
| ID Fornecedor                |            |
| Valor                        |            |
| Data de Cadastro             |            |

# Pré-requisitos
- JDK (versão 11+)
- Maven (versão 3+)

# Instalação

- Clone o repositório: git clone https://github.com/hadesfranklyn/TesteDeAplicacaoCRUD_Empresa_ONI_learning.git
- Navegue para o diretório do projeto: cd seu-projeto
- Compile o projeto: mvn compile
- Execute o projeto: mvn exec:java
