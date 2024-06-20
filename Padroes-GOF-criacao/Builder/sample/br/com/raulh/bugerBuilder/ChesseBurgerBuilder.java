package br.com.raulh.bugerBuilder;

public class ChesseBurgerBuilder extends BurgerBuilder{

    @Override
    public void buildBun() {
        burger.setBun("Bun with sesame");
    }

    @Override
    public void buildMeat(){
        burger.setMeat("Beef");
    }

    @Override
    public void buildSalad(){
        burger.setSalad("Lettuce, tomato, onion");
    }

    @Override
    public void buildChesse(){
        burger.setChesse("Cheddar");
    }

    @Override
    public void buildSauce(){
        burger.setSauce("Ketchup, mustard");
    }
}
