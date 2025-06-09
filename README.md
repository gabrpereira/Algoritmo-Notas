📘 Algoritmo de Notas

Este repositório contém um programa em Java que ajuda estudantes a entenderem sua situação acadêmica com base em uma ou duas notas. O algoritmo identifica se o aluno ainda pode ser aprovado, está em recuperação ou já está reprovado.

O que o programa faz

- Permite escolher se você quer calcular com **apenas a 1ª nota** ou **com as duas**.
- Caso só tenha a 1ª nota:
  - Informa quanto você precisa tirar na 2ª nota para atingir média 7.
  - Se precisar de mais de 10, já avisa que está em recuperação.
- Caso já tenha as duas notas:
  - Calcula a média.
  - Informa se você está aprovado, em recuperação ou reprovado.

🧠 Lógica de aprovação

- Média final ≥ 7.00 → ✅ Aprovado
- Média entre 4.00 e 6.99 → ⚠️ Recuperação
- Média < 4.00 → ❌ Reprovado

 🖥️ Como usar

1. Compile
```bash
javac AlgoritmoNotas.java
