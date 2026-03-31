# 🏋️‍♂️ Fit Manager API

> API RESTful robusta para gestão de métricas físicas, periodização de treinos e cálculos metabólicos.

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
![Postgres](https://img.shields.io/badge/postgres-%23316192.svg?style=for-the-badge&logo=postgresql&logoColor=white)
![Docker](https://img.shields.io/badge/docker-%230db7ed.svg?style=for-the-badge&logo=docker&logoColor=white)

## 💻 Sobre o Projeto

O **Fit Manager API** é um sistema de backend desenvolvido com arquitetura limpa e boas práticas de Engenharia de Software. O objetivo principal é fornecer um motor de cálculo e persistência de dados focado no ecossistema de musculação e fisiculturismo, automatizando a obtenção de métricas essenciais como a Taxa Metabólica Basal (TMB) e servindo de base para montagem de dietas e treinos.

### ⚙️ Funcionalidades Atuais
- [x] Cadastro de Avaliações Físicas (Peso, Altura, Idade, Gênero).
- [x] Cálculo automatizado da Taxa Metabólica Basal utilizando a Equação de Harris-Benedict.
- [x] Persistência de histórico de avaliações para rastreamento de progresso.

---

## 🚀 Tecnologias e Ferramentas

O projeto foi desenvolvido utilizando o padrão da indústria para aplicações corporativas:

- **Linguagem:** Java 17
- **Framework:** Spring Boot 3
- **Persistência:** Spring Data JPA / Hibernate
- **Banco de Dados (Dev):** H2 Database (em memória)
- **Banco de Dados (Prod):** PostgreSQL
- **Infraestrutura:** Docker & Docker Compose
- **Gerenciador de Dependências:** Maven

---

## 🛠️ Como Executar o Projeto Localmente

### Pré-requisitos
Certifique-se de ter o **Java 17** e o **Maven** instalados na sua máquina.

### Passo a Passo

1. **Clone o repositório:**
```bash
git clone [https://github.com/MarcoTulioES/fit-manager-api.git](https://github.com/MarcoTulioES/fit-manager-api.git)
```

2. **Acesse o diretório do projeto:**
```bash
cd fit-manager-api
```

3. **Inicie a aplicação via Maven:**
```bash
./mvnw spring-boot:run
```

4. **Acesse o Banco de Dados (H2 Console):**
Abra o navegador e acesse `http://localhost:8080/h2-console`.
- **JDBC URL:** `jdbc:h2:mem:fit_manager`
- **User Name:** `sa`
- **Password:** *(deixe em branco)*

---

## 📡 Documentação da API (Endpoints)

### 1. Registrar nova Avaliação Física e calcular TMB
- **Rota:** `POST /api/assessments`
- **Descrição:** Recebe os dados físicos do atleta, calcula o metabolismo basal e salva o histórico.

**Exemplo de Requisição (JSON):**
```json
{
  "weight": 82.0,
  "height": 173.0,
  "age": 22,
  "gender": "M"
}
```

**Exemplo de Resposta (Status 200 OK):**
```json
{
  "id": 1,
  "weight": 82.0,
  "height": 173.0,
  "age": 22,
  "gender": "M",
  "basalMetabolicRate": 1891.801,
  "assessmentDate": "2026-03-31"
}
```

---

## 👨‍💻 Autor

Criado por **Marco Túlio Sales de Deus**.

[![LinkedIn](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/marco-t%C3%BAlio-sales-de-deus-422355329/)