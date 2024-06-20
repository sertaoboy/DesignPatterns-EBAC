package br.com.raulh.bugerBuilder;

public class BurgerRestaurantDiretor {
    private BurgerBuilder burgerBuilder;

    public void setBuilder(BurgerBuilder burgerBuilder) {
        this.burgerBuilder = burgerBuilder;
    }

    public Burger buildBurger(){
        burgerBuilder.buildBun();
        burgerBuilder.buildMeat();
        burgerBuilder.buildSalad();
        burgerBuilder.buildChesse();
        burgerBuilder.buildSauce();
        return burgerBuilder.build();
    }
}
