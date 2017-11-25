import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonHandler {
    Scanner mainScanner = new Scanner(System.in);
    boolean doStuff = true;

    Hero FirstHero = new Hero("Edmund","Whitesword","Wolf",Sex.MALE);
    List<Hero> heroes = new ArrayList<Hero>();

    public void method() {
        heroes.add(FirstHero);
        Hero hero = heroes.get(0);
        System.out.println(hero);
    }

    public void Init() {
        while (doStuff) {
            System.out.flush();
            System.out.println("Co chcesz zrobic ?");
            String Input = mainScanner.nextLine();
            if ("Exit".equals(Input)) {
                doStuff = false;
            }
            if ("AddPerson".equals(Input)) {
                Hero hero = new Hero();
                hero.setName(hero.ReadName());
                hero.setLastName(hero.ReadLastName());
                hero.setAnimal(hero.ReadAnimal());
                hero.setSex(hero.ReadSex());

                heroes.add(hero);
            }
            if ("ShowPersons".equals(Input)){
                ShowPersons();
            }
        }
    }
    public void ShowPersons(){
        for(Hero x : heroes) {
            System.out.println(x);
        }
    }
}
