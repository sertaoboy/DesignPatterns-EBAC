# Agregacao
- **Agregação** é um tipo de associação que indica que uma classe é composta por outra classe. A classe que compõe outra classe é chamada de **classe composta** e a classe que contém a classe composta é chamada de **classe que compõe**. A classe composta pode ser compartilhada por várias classes que a compõem. A agregação é representada por um losango oco na classe que compõe e uma linha contínua na classe composta.

- **Exemplo**: Uma escola é composta por várias salas de aula. Uma sala de aula é composta por várias cadeiras. Uma cadeira é composta por várias pernas. Neste exemplo, a escola é a classe que compõe, a sala de aula é a classe composta, a cadeira é a classe composta e a perna é a classe composta.

- **Exemplo em código**:
```java
public class Escola {
    private SalaDeAula[] salasDeAula;
}

public class SalaDeAula {
    private Cadeira[] cadeiras;
}

public class Cadeira {
    private Perna[] pernas;
}

public class Perna {
    private int tamanho;
}
```

- **Vantagens**:
    - **Reuso de código**: A classe composta pode ser compartilhada por várias classes que a compõem.
    - **Organização**: A agregação ajuda a organizar o código, separando as responsabilidades de cada classe.

- **Desvantagens**:
    - **Acoplamento**: A classe que compõe depende da classe composta, o que pode aumentar o acoplamento entre as classes.
    - **Complexidade**: A agregação pode aumentar a complexidade do código, tornando-o mais difícil de entender e manter.

- **Quando usar**: Use a agregação quando uma classe precisar ser composta por outra classe e a classe composta puder ser compartilhada por várias classes que a compõem.

# Composição
- **Composição** é um tipo de associação que indica que uma classe é composta por outra classe. A classe que compõe outra classe é chamada de **classe composta** e a classe que contém a classe composta é chamada de **classe que compõe**. A classe composta não pode ser compartilhada por várias classes que a compõem. A composição é representada por um losango preenchido na classe que compõe e uma linha contínua na classe composta.

- **Exemplo**: Uma casa é composta por várias peças. Uma peça é composta por várias paredes. Uma parede é composta por vários tijolos. Neste exemplo, a casa é a classe que compõe, a peça é a classe composta, a parede é a classe composta e o tijolo é a classe composta.

- **Exemplo em código**:
```java
public class Casa {
    private Peça[] peças;
}

public class Peça {
    private Parede[] paredes;
}

public class Parede {
    private Tijolo[] tijolos;
}

public class Tijolo {
    private int tamanho;
}
```

- **Vantagens**:
    - **Encapsulamento**: A classe composta é encapsulada dentro da classe que compõe, o que ajuda a proteger os dados da classe composta.
    - **Organização**: A composição ajuda a organizar o código, separando as responsabilidades de cada classe.

- **Desvantagens**:
    - **Acoplamento**: A classe que compõe depende da classe composta, o que pode aumentar o acoplamento entre as classes.
    - **Complexidade**: A composição pode aumentar a complexidade do código, tornando-o mais difícil de entender e manter.

- **Quando usar**: Use a composição quando uma classe precisar ser composta por outra classe e a classe composta não puder ser compartilhada por várias classes que a compõem.
```

- [Agregacao%26ComposicaoClasses](Agregacao%26ComposicaoClasses/readme.md)