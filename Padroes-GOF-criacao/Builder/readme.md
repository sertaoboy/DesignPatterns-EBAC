# Builder 
- Fornece uma ***interface generica*** para a construcao incremental de agregacoes. Esse padrao esconde os detahles de como os componentes sao criados, representados e compostos.
- ***Permite*** a criacao de objetos ***complexos***, ***passo a passo***.
- ***Separar*** a ***construcao de um objeto complexo*** de sua ***representacao***, de modo que o mesmo processo de construcao possa criar diferentes representacoes.
- "Esconder a logica da criacao" de um objeto complexo e permitir que o mesmo processo de construcao possa criar diferentes representacoes.

>- "Ao ir no balcao de um restaurante e pedir um hamburguer, voce nao sabe como ele e feito, mas o cozinheiro sabe. O Builder simula o cozinheiro atraves de instrucoes bem definidas para a criacao de um hamburguer." 
>- Este processo fica "escondido".

![Builder](https://github.com/sertaoboy/DesignPatterns-EBAC/blob/main/Padroes-GOF-criacao/Builder/builder.png?raw=true)

## Exemplo em UML:

