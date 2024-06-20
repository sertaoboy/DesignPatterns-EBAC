package br.com.raulh.singleton;

public class DemoSingletonPropriedadesThreadsSyncronized {
    public static void main(String[] args) {
        Thread t1 = new Thread(new ThreadFoo());
        Thread t2 = new Thread(new ThreadBar());
        t1.start();
        t2.start(); 
        
    }



    
    static class ThreadFoo implements Runnable {  
        @Override
        public void run() {
            SingletonPropriedadesSyncronized singleton = SingletonPropriedadesSyncronized.getInstance("Teste");
            System.out.println(singleton.getValue());
        }
    }

    static class ThreadBar implements Runnable {
        @Override
        public void run() {
            SingletonPropriedadesSyncronized singleton = SingletonPropriedadesSyncronized.getInstance("Teste1");
            System.out.println(singleton.getValue());
        }
    }


    //Dessa forma se garante que apenas uma thread por vez possa acessar o metodo --> resolve o problema das threads em Java; UTILIZAR COM CUIDADO
}
