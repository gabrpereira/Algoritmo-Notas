📘 Algoritmo de Notas

Este repositório contém um programa em Java que ajuda estudantes a entenderem sua situação acadêmica com base em uma ou duas notas. O algoritmo informa se o aluno pode ser aprovado diretamente, se está em recuperação ou já está reprovado — inclusive considerando a prova final quando necessário.


⚙️ O que o programa faz

✅ Caso tenha apenas a 1ª nota:
- Calcula quanto é necessário tirar na 2ª prova para atingir média 7.
- Se for necessário tirar mais de 10, avisa que já está automaticamente em **recuperação**.

✅ Caso tenha as duas notas:
- Calcula a **média parcial** entre as duas notas.
- Informa se você está:
  - ✅ Aprovado direto,
  - ⚠️ Em recuperação,
  - ❌ Reprovado direto.
- Se estiver em **recuperação** (média entre 4.00 e 6.99):
  - Mostra quanto é necessário tirar na **prova final** para alcançar média 5.
  - Após inserir a nota da prova final, informa se foi aprovado ou reprovado.


🧠 Lógica de aprovação

Média parcial:
- `≥ 7.00` → ✅ Aprovado direto  
- `4.00 até 6.99` → ⚠️ Recuperação (precisa fazer prova final)  
- `< 4.00` → ❌ Reprovado direto  

Média final (caso vá para a final):
- `≥ 5.00` → ✅ Aprovado  
- `< 5.00` → ❌ Reprovado


💻 Como compilar e executar

1. **Abra o terminal** e navegue até a pasta onde está o arquivo `AlgoritmoNotas.java`.

2. Compile o arquivo com o comando:
```bash
javac AlgoritmoNotas.java
