/**
 * This is an example of a class that represents a Professor.
 * It includes attributes, a constructor, and methods to classify the professor
 * based on their years of experience.
 */
public class Professor {
    private String name;
    private int experience;

    public Professor(String name, int experience) {
        this.name = name;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public int getExperience() {
        return experience;
    }

    public String classify() {
        return switch (experience) {
            case 0,1,2,3,4,5 -> "Assistente";
            case 6,7,8,9,10 -> "Adjunto";
            default -> "Titular";
        };
    }

    @Override
    public String toString() {
        return "Professor " + name + " possui " + experience + " anos de experiência e é classificado como " + classify();
    }
}