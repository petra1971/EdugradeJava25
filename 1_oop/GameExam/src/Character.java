public class Character {

    private String name;
    private int speed;
    private int health;
//    private int experience;

    public Character(String name, int speed, int health) {
        this.name = name;
        this.speed = speed;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }
//     TODO: use experience
//    public int getExperience() {
//        return experience;
//    }

    public int getHealth() {
        return health;
    }

    public void boostHealth(int newEnergy) {
        health += newEnergy;
    }
    public void getInjured(int injury) {
        health -= injury;
        if (isAlive()) {
            System.out.println(name + " was hurt! The health is now " + health);
        }
    }

    public boolean isAlive() {
        return speed > 0;
    }

    public void status() {
        System.out.println(name + ", has health: " + health + " and speed " + speed);
    }
}
