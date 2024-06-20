package br.com.raulh.bugerBuilder;

public class VeganBurgerBuilder extends BurgerBuilder {
    @Override
    public void buildBun() {
        burger.setBun("Bun with sesame");
    }

    @Override
    public void buildMeat() {
        burger.setMeat("Soy meat");
    }

    @Override
    public void buildSalad() {
        burger.setSalad("Lettuce, tomato, onion");
    }

    @Override
    public void buildChesse() {
        burger.setChesse("No chesse");
    }

    @Override
    public void buildSauce() {
        burger.setSauce("Vegan sauce");
    }

    
}
