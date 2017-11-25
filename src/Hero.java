import java.util.Scanner;

public class Hero extends Person {

    public Hero(String name, String lastName, String animal, Sex sex){
        setName(name);
        setLastName(lastName);
        setAnimal(animal);
        setSex(sex);
    }

    public Hero(){}

    @Override
    public String toString() {
        return "Name: " + Name + ", Last Name: " +LastName+ ", Animal: "+Animal+", Sex: "+ Sex.toString();
    }

    private String Name;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    private String LastName;

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    private String Animal;

    public String getAnimal() {
        return Animal;
    }

    public void setAnimal(String animal) {
        Animal = animal;
    }

    private Sex Sex;

    public Sex getSex() {
        return Sex;
    }

    public void setSex(Sex sex) {
        Sex = sex;
    }
}


