# 🏋️ Fit Power Academia — Painel do Administrador

Aplicação front-end desenvolvida em React + Vite, com tema de academia, para gerenciamento dos alunos matriculados. Permite visualizar, cadastrar e atualizar os dados dos alunos, consumindo a API REST desenvolvida na disciplina de Programação Web.

## Tema

Academia (Fit Power Academia) — tema associado à primeira letra do nome do aluno.

## Funcionalidades

* Listagem de alunos matriculados — exibe todos os alunos cadastrados, consumindo a API via GET.
* Cadastro de novo aluno — formulário com envio dos dados via POST.
* Edição de aluno existente — carrega os dados via GET e salva as alterações via PUT.
* Painel com estatísticas — total de alunos, plano mais popular e peso médio, calculados a partir dos dados reais retornados pela API.

## ▶️ Como executar os projetos

Este projeto integra dois projetos separados: a API (back-end) e esta aplicação front-end. Os dois precisam estar rodando ao mesmo tempo para a aplicação funcionar por completo.

### 1. Executando a API (back-end)

Abra o projeto da API.

Siga as instruções de execução definidas. Confirme em qual endereço e porta a API está rodando, por padrão, este front-end espera que ela esteja em:

```text
http://localhost:8080/matriculas
```

Caso a API esteja rodando em outro endereço ou porta, ajuste a constante `API_URL` no início dos arquivos `Home.jsx`, `CadastrarAluno.jsx` e `EditarAluno.jsx` (dentro de `src/paginas/`).

### 2. Executando o front-end

```bash
# instalar as dependências
npm install

# rodar em modo de desenvolvimento
npm run dev
```

A aplicação abre por padrão em:

```text
http://localhost:5173
```

⚠️ A API precisa estar rodando antes de abrir o front-end.

## Tecnologias utilizadas

### Front-end

* React
* Vite
* React Router — navegação entre telas
* Axios — requisições HTTP à API
* CSS Modules — estilização isolada por componente

### Back-end

* Java
* Spring Boot — framework da API REST
* JDBC Template — acesso e manipulação dos dados no banco
* H2 — banco de dados utilizado pela API
ademia
