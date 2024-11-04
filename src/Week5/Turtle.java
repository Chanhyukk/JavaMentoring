package Week5;

public class Turtle {
    protected int limbs = 4;
    protected String food;
    public void setFood(String food) {
        this.food = food;
    }
    public void eat() {
        System.out.println("Turtle eats " + food);
    }
    public int getLimbs() {
        return limbs;
    }
}
