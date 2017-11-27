import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonHandler {
    Scanner mainScanner = new Scanner(System.in);
    boolean doStuff = true;

    List<Hero> heroes = new ArrayList<Hero>();

    public void Init() throws Exception {
        while (doStuff) {
            System.out.flush();
            System.out.println("Co chcesz zrobic ?");
            String Input = mainScanner.nextLine();
            if ("Exit".equals(Input)) {
                doStuff = false;
            }
            if ("AddPerson".equals(Input)) {
                Hero hero = new Hero();
                try {
                    hero.setName(hero.ReadName());
                }
                catch(Exception e){
System.out.println(e.getMessage());
                }finally {
                    hero.setName(ReadName());
                }

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

    public String ReadName(){
        Scanner PersonScanner = new Scanner(System.in);

        System.out.println("Podaj imie - substytut");
        String nameGot=PersonScanner.nextLine();
        return nameGot;
    }
}
