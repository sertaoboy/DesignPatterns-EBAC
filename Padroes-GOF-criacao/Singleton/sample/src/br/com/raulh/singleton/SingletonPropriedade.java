package br.com.raulh.singleton;
public class SingletonPropriedade {
    private static SingletonPropriedade singleton; //uma referencia para ele mesmo
    private static  String value;

    private SingletonPropriedade(String value) { //construtor privado
        this.value =  value;
    }

    public String getValue() {
        return this.value;
    }

    public static SingletonPropriedade getInstance(String value) {  //metodo estatico para realizar o instanciamento; ao se invocar o construtor ele exige uma String para `value`
        if(singleton == null) {
            singleton = new SingletonPropriedade(value);
        }
        return singleton;
    }

}
