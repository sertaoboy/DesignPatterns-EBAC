# Singleton
- Usado quando desejado, que uma classe tenha apenas ***uma instancia na aplicacao***. Abaixo, mostra alguns aspectos que devem ter atencao ao criar esse padrao:
  - ***Construtor da classe fica como privado*** (private), sendo que *nao pode ser instanciada fora da classe*.
  - A classe e ***final***, pois ***nao*** *permite a criacao de subclasses*.
  - O acesso e permitido ***atraves do metodo que retorna a instancia unica da classe***, ou faz a criacao de uma, caso nao tenha sido criada.

### Exemplo em Java:
```java
public class Singleton {
  private static Singleton singleton;
  private Singleton() {
  }

  public static Singleton getInstance*() {
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
