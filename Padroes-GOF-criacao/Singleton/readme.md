# Singleton
- Usado quando desejado, que uma classe tenha apenas ***uma instancia na aplicacao***. Abaixo, mostra alguns aspectos que devem ter atencao ao criar esse padrao:
  - ***Construtor da classe fica como privado*** (private), sendo que *nao pode ser instanciada fora da classe*.
  - A classe e ***final***, pois ***nao*** *permite a criacao de subclasses*.
  - O acesso e permitido ***atraves do metodo que retorna a instancia unica da classe***, ou faz a criacao de uma, caso nao tenha sido criada.

## Importante!
- ***Nao*** *deve ser usado em aplicacoes multi-thread*, pois pode ocorrer problemas de concorrencia.
- ***Nao*** *deve ser usado em aplicacoes que possuem muitas instancias de classes*, pois pode ocorrer problemas de memoria.
- Os ***metodos da classe devem ser sincronizados***, para evitar problemas de concorrencia.
- Os atributos da classe devem ser ***final***, para evitar que sejam alterados.
- Os atributos da classe devem ser ***static***, para que sejam acessados sem a necessidade de instanciar a classe.
- A classe deve ser ***final***, para evitar que seja herdada.
- O construtor da classe deve ser ***privado***, para evitar que seja instanciado fora da classe.
- O metodo que retorna a instancia da classe deve ser ***static***, para que seja acessado sem a necessidade de instanciar a classe.
- O metodo que retorna a instancia da classe deve ser ***synchronized***, para evitar problemas de concorrencia.

### Exemplo em Java:
```java
public class Singleton {
  private static Singleton singleton;
  private Singleton() {
  }

  public static Singleton getInstance() {
    if (singleton == null) {
      singleton = new Singleton();
    }
    return singleton;
  }
}

public class DemoSingleton {
  public static void main (String [] args) {
    Singleton singleton = Singleton.getInstance();
  }
}
```

![Singleton png](https://github.com/sertaoboy/DesignPatterns-EBAC/blob/main/Padroes-GOF-criacao/Singleton/singleton.png?raw=true)
