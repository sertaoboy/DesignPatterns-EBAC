package br.com.raulh.bugerBuilder;

public class Demo {
    public static void main(String[] args) {
        BurgerRestaurantDiretor burgerRestaurant = new BurgerRestaurantDiretor(); 
        burgerRestaurant.setBuilder(new ChesseBurgerBuilder());
        buildBurger(burgerRestaurant);

        burgerRestaurant.setBuilder(new VeganBurgerBuilder());
        buildBurger(burgerRestaurant);
    }

    private static void buildBurger(BurgerRestaurantDiretor burgerRestaurant) {
        Burger burger = burgerRestaurant.buildBurger();
        burger.print();
    }
}
