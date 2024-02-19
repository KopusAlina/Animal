public class Animal {

    private boolean vegetarian;
    private String eats;

    public Animal(){
    }

    public Animal(boolean veg, String food){
        this.vegetarian = veg;
        this.eats = food;
    }

    public void sound(){
        System.out.println("Голос");
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public String getEats() {
        return eats;
    }
}