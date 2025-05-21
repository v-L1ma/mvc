# Atividade Prática: Arquitetura MVC com Spring Boot 

*Disciplina: Engenharia de Software*  

---

## 1 · Objetivo Geral  
Vivenciar **na prática** a aplicação da arquitetura **Model – View – Controller (MVC)** em um projeto Spring Boot criado via **start.spring.io**, diferenciando claramente as responsabilidades de **Model**, **View** e **Controller**.

---

## 2 · Pré‑requisitos  

| Item | Descrição | Pontos de verificação |
|------|-----------|-----------------------|
| **Java 17 (ou superior)** | Verifique `java -version` no terminal | ✔ JDK instalado |
| **Maven** *(embutido no projeto)* | Não é necessário instalar separadamente | ✔ `mvn -v` responde |
| **IntelliJ IDEA Community** | IDE para importar o projeto | ✔ Importa projetos Maven |
| **Navegador Web** | Chrome, Edge, Firefox… | ✔ Permite testar endpoints |

> **Observação:** Nenhum plug‑in adicional do IntelliJ é necessário, pois a geração do projeto será feita externamente.

---

## 3 · Revisão rápida do padrão MVC  

| Camada | Responsabilidade chave | Correspondência no Spring Boot |
|--------|------------------------|--------------------------------|
| **Model (M)** | Regras de negócio + dados | POJO/JPA Entity |
| **View (V)** | Apresentação ao usuário | Template Thymeleaf / HTML |
| **Controller (C)** | Mediação entre M e V, ou API REST | `@Controller`, `@RestController` |

---

## 4 · Estrutura mínima esperada do projeto  

```
src
└── main
    ├── java/com/seuGrupo
    │   ├── Application.java         # inicialização Spring Boot
    │   ├── controller
    │   │   ├── PaginaController.java   # @Controller → HTML
    │   │   └── ApiController.java      # @RestController → JSON
    │   └── model
    │       └── Produto.java            # sua classe de domínio
    └── resources
        └── templates
            └── pagina.html             # Thymeleaf ou HTML simples
```

Você **pode escolher** outro domínio além de “Produto” (ex.: **Livro**, **Curso**, **Usuário**), desde que **não** copie o exemplo usado em aula.

---

## 5 · Passo a passo (geração no start.spring.io + IntelliJ)

| Passo | Ação | Pontos de verificação |
|------:|------|-----------------------|
| **1** | **Gerar projeto** em <https://start.spring.io> <br>• Project: **Maven** <br>• Language: **Java** <br>• Spring Boot: 3.2.x <br>• Group: `com.seuGrupo` <br>• Artifact: `mvc-demo` <br>• Dependencies: **Spring Web**, **Thymeleaf** <br>• Clique **GENERATE** para baixar o `.zip`. | ✔ Arquivo `mvc-demo.zip` baixado |
| **2** | **Descompactar** o `.zip` em uma pasta de trabalho. | ✔ Estrutura Maven visível |
| **3** | **Importar no IntelliJ**: **File ▸ New ▸ Project from Existing Sources…** → selecione a pasta descompactada → escolha **Maven**. | ✔ Projeto carrega sem erros |
| **4** | **Criar Model**: em `src/main/java/com/seuGrupo/model` adicionar `Produto.java` com ≥ 3 atributos, construtor e getters. | ✔ Classe criada |
| **5** | **Criar View**: em `src/main/resources/templates` adicionar `pagina.html` que utiliza Thymeleaf (`th:text`). | ✔ Renderiza conteúdo |
| **6** | **Controller HTML**: `PaginaController` em `com.seuGrupo.controller` <br>`@GetMapping("/pagina")` adiciona objeto Produto ao `Model` e retorna `"pagina"`. | ✔ Log mostra acesso `/pagina` |
| **7** | **Controller JSON**: `ApiController` em `com.seuGrupo.controller` <br>`@GetMapping("/api/produto")` devolve objeto Produto em JSON. | ✔ Browser/Postman exibe JSON |
| **8** | **Executar**: clique no ícone ▶️ *Application* ou use **Shift + F10**. | ✔ Spring iniciado sem erros |
| **9** | **Testar URLs**: <br>`http://localhost:8080/pagina` (HTML) <br>`http://localhost:8080/api/produto` (JSON) | ✔ Ambos respondem |
| **10** | **Capturar prints**: Model, View (HTML) e resposta JSON. | ✔ Imagens salvas |

---

## 6 · Evidências para entrega  

| Ordem | Evidência | Detalhes |
|-------|-----------|----------|
| **a)** | Print da **classe Model** | Código completo visível |
| **b)** | Print da **View HTML** no navegador | Mostrar URL + conteúdo |
| **c)** | Print da **resposta JSON** | Mostrar URL + JSON |

Agrupe as imagens em **um documento Word ou PDF** **OU** anexe diretamente na tarefa do Teams com um parágrafo explicativo relacionando **M**, **V** e **C**.

---

## 7 · Lista de verificação rápida  

- [ ] **Model** tem ≥ 3 atributos.  
- [ ] **Controller HTML** usa `@Controller` e retorna View.  
- [ ] **Controller JSON** usa `@RestController`.  
- [ ] URLs `/pagina` e `/api/produto` funcionam.  
- [ ] Prints legíveis e sem dados sensíveis.  
- [ ] Documento final com identificação (nome, e-mail insitucional).

---


## 8 · Recursos de apoio  

- **Documentação Spring Boot 3.x** – <https://docs.spring.io/spring-boot/reference/>  
- **Guide: Serving Web Content** – <https://spring.io/guides/gs/serving-web-content/>  
- **Guide: RESTful Web Service** – <https://spring.io/guides/gs/rest-service/>  

---
