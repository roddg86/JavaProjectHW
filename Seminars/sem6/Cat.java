package Seminars.sem6;

public class Cat {
    private String name_cat;
    private int age;
    private String breed;
    private String color;
    private String gender;
    private String name_owner;
    private int id;
    private boolean vaccinated;

    public Cat(String name_cat, String name_owner, int age, String breed, String color, String gender, int id,
            boolean vaccinated) {
        this.name_cat = name_cat;
        this.name_owner = name_owner;
        this.age = age;
        this.breed = breed;
        this.color = color;
        this.gender = gender;
        this.id = id;
    }

    public void makeVaccinated() {
        this.vaccinated = true;
    }

    public void setName_cat(String name_cat) {
        this.name_cat = name_cat;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setName_owner(String name_owner) {
        this.name_owner = name_owner;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setVaccinated(boolean vaccinated) {
        this.vaccinated = vaccinated;
    }

    @Override
    public String toString() {
        return String.format("%s %s %d %s %s %s %d %b", name_cat, name_owner, age, breed, color, gender, id,
                vaccinated);
    }

}
