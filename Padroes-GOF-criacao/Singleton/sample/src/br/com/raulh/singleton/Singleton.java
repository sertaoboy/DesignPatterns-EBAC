package br.com.raulh.singleton;
public class Singleton {
    private static Singleton singleton; //uma referencia para ele mesmo

    private Singleton() { //construtor privado

    }

    public static Singleton getInstance() {  //metodo estatico para realizar o instanciamento
        if (singleton == null) {
            singleton = new Singleton(); //cria-se somente uma instancia, se ela ja nao existir
        }
        return singleton;
    }

}
