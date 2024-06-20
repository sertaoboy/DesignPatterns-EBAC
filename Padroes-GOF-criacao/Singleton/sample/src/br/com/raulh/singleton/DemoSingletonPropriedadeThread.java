package br.com.raulh.singleton;

public class DemoSingletonPropriedadeThread {
    public static void main(String[] args) {
        Thread t1 = new Thread(new ThreadFoo());
        Thread t2 = new Thread(new ThreadBar());
        t1.start();
        t2.start(); 
        //Fica a criterio do sistema operacional qual thread sera executada primeiro e qual sera a ordem de execucao; depende de varias coisas como: processador, sistema operacional, etc.
    }



    //classes internas: "classes dentro de classes, acessadas somente por sua classe externa."
    static class ThreadFoo implements Runnable {  //runnable: processamento paralelo; criacao da thread implementando a interface
        @Override
        public void run() {
            SingletonPropriedade singleton = SingletonPropriedade.getInstance("Teste");
            System.out.println(singleton.getValue());
        }
    }

    static class ThreadBar implements Runnable {
        @Override
        public void run() {
            SingletonPropriedade singleton = SingletonPropriedade.getInstance("Teste1");
            System.out.println(singleton.getValue());
        }
    }
}
