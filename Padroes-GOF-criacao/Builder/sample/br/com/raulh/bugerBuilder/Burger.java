package br.com.raulh.bugerBuilder;

public class Burger {
    private String bun = "No bun";
    private String meat = "No meat";
    private String salad = "No salad";
    private String chesse = "No chesse";
    private String sauce = "No sauce";

    public void setBun(String bun) {
        this.bun = bun;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public void setSalad(String salad) {
        this.salad = salad;
    }

    public void setChesse(String chesse) {
        this.chesse = chesse;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public void print(){
        System.out.println("Burger: " + bun + ", " + meat + ", " + salad + ", " + chesse + ", " + sauce);
    }

}
