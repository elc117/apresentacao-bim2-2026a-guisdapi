# apresentacao-bim2-2026a-guisdapi

## Parte 1 - Prática da Aula Passada

### Exercício 1: Point, Circle e ListOfCircles

- Percebi um erro ao tentar executar `java Circle` ou `java Point`, `java ListOfCircles` rodou corretamente... O compilador falou que o método main não foi encontrado na classe especificada.
- 

### Exercício 2: ListOfTeamMates

- Fiquei em dúvida ao criar os métodos get/set, não sabia o que isso significava, fiz uma pesquisa na internet e achei um artigo de um blog da Rocketseat que ajudou a elucidar.
- Ao criar o construtor default e com argumentos também fiquei perdido e tive que rever o material de aulas passadas para relembrar.
- Para fazer esse exercício fui me baseando no primeiro e no material de outras aulas.
- Fiquei em dúvida ao fazer um `if` dentro do `for`, como escrever a comparação de um atributo ao elemento específico da lista do tipo `ArrayList`.
- Usei `list.get(i).getOnline() == true`, apenas adaptei o código anterior `list.get(i).getName()`.
- Tive dificuldade em usar o método `.set()` da classe `ArrayList`, ao tentar acessar um objeto dentro da lista da classe. Resolvi criando um novo objeto na linha anterior e substituindo ele no `.set()`.

### Exercício 3: Groups

- Dificuldade em percorrer as listas de estudantes e professores.
- Dificuldade em como acessar as variáveis. Por exemplo, como acessar o `userId` da lista de estudantes para comparar com o `userId` do método `userExists`.
- Deu erro de comparação de strings, comparei strings usando ==, então pesquisei, no site w3schools, uma função que comparasse strings e achei .equals.

### Código Exercício 1 - GIF
<img width="1474" height="912" alt="ex1" src="https://github.com/user-attachments/assets/ee9531bd-1065-4100-8c93-4c00aabd00a2" />

### Código Exercício 2 - GIF
<img width="1148" height="590" alt="ex2" src="https://github.com/user-attachments/assets/ccdfac98-c93c-4e46-950b-6d00f3a3a5b2" />

### Código Exercício 3 - GIF
<img width="870" height="526" alt="ex3" src="https://github.com/user-attachments/assets/1c7b392e-07b7-4a49-b844-9426fa9b2418" />

---

## Parte 2 - Materiais de Referência

- [Encapsulamento em Java: Getters e Setters — Rocketseat](https://www.rocketseat.com.br/blog/artigos/post/encapsulamento-em-java-getters-setters)
  - Me ajudou a entender o que eram métodos get/set.
- **Slides das aulas anteriores**
  - Me ajudaram a relembrar sintaxes e conceitos.
- [Strings em Java - W3Schools](https://www.w3schools.com/java/java_strings.asp)
