package br.com.raulh.singleton;

public class SingletonPropriedadesSyncronized {
    private static SingletonPropriedadesSyncronized singleton; 
    private static  String value;

    private SingletonPropriedadesSyncronized(String value) { 
        this.value =  value;
    }

    public String getValue() {
        return this.value;
    }

    public static synchronized SingletonPropriedadesSyncronized getInstance(String value) {  //`syncronized` garante que apenas uma thread por vez possa acessar o metodo --> resolve o problema das threads em Java; UTILIZAR COM CUIDADO
        if(singleton == null) {
            singleton = new SingletonPropriedadesSyncronized(value);
        }
        return singleton;
    }
}
