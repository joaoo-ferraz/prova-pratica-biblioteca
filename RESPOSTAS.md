# Respostas — Sistema de Emprestimo da Biblioteca

Nome completo: João Paulo Ferraz  RA: ______________

> Preencha **todos** os campos. Campo vazio é campo não avaliado.
> Não apague os títulos nem os rótulos em negrito: a correção procura por eles.

---

# Etapa 1 — Diagnóstico

## Problema 1 — a conversão do acervo central

**Em que consiste o problema, e o que acontece quando o sistema cresce: O mesmo teste(parâmetro) é replicado em mais de um lugar do código, conforme o sistema for aumentando o parametro deverá ser replicado, numa possível alteração de regra de negocio o programador deverá passar por todos os lugares que possuem a regra, além de permitir que a mesma regra sofra variações pelo projeto**


**Princípio SOLID violado: Inversão de dependência**


**Classes afetadas (pelo nome): CatalogoExemplares e RelatorioColecao**


**Que outra dependência indevida essas classes têm em relação ao
acervo central, e por que ela é um problema: No caso de o servico legado acrescentar uma nova coluna, os pontos se quebrariam ao mesmo tempo pois uma não conheceria a outra**


## Problema 2 — o ciclo de vida de Emprestimo

**Em que consiste o problema, e o que acontece quando o sistema cresce: Os estados do exemplar estão espalhados por uma única classe, ao tentar adicionar um novo estado toda ela deveria ser refatorada, além dos estados serem impressos como string atráves de métodos públicos**


**Princípio SOLID violado: State**


**Classes afetadas (pelo nome): Emprestimo, Leito e Exemplar**


---

# Etapa 4 — Justificativa

## Padrão aplicado ao Problema 1

**O problema que ele resolve (descreva antes de nomear o padrão): torna compatíveis duas interfaces diferentes que tem a informação necessária, porém que não se comunicam**


**Nome do padrão: Adapter**


**Alternativa descartada e por que ela não resolveria por completo: Decorator, pois a interface permaneceria igual mas seria adicionada funcionalidades**


## Padrão aplicado ao Problema 2

**O problema que ele resolve (descreva antes de nomear o padrão): encapsula os estados atuais de cada objeto conhece as transições permitidas e proibe as demais.**


**Nome do padrão: State**


**Alternativa descartada e por que ela não resolveria por completo: Strategy, nesse caso a escolha mudaria o algoritmo das condições e/ou regras de negocio**
