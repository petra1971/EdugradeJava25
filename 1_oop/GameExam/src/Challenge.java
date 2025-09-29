public class Challenge {

    private String name;
    private String description;
    private Character character1;
    private Character character2;

    public Challenge(String name, String description, Character character1, Character character2) {
        this.name = name;
        this.description = description;
        this.character1 = character1;
        this.character2 = character2;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }
}
