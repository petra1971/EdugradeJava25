public class MurderRabbit extends Character {

    public MurderRabbit(String name, int speed, int health) {
        super(name, speed, health);
    }

    public void eatCarrot(int carrots) {
        boostHealth(carrots);
        System.out.println(getName() + " ate " + carrots + " and the health is now " + getHealth() + " /100.");
    }


}
