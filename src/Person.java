import java.util.Scanner;

public abstract class Person implements IPerson {
    Scanner PersonScanner = new Scanner(System.in);

    public String ReadName() {
        System.out.println("Podaj imie");
        return PersonScanner.nextLine();
    }

    public String ReadLastName() {
        System.out.println("Podaj nazwisko");
        return PersonScanner.nextLine();
    }

    public String ReadAnimal() {
        System.out.println("Podaj zwierze");
        return PersonScanner.nextLine();
    }

    public Sex ReadSex() {
        System.out.println("Podaj plec [M lub F]: ");

        Sex sex = Sex.INNE;

        while (sex == Sex.INNE) {
            String wynik = PersonScanner.nextLine();

            if ("F".equals(wynik)) {
                sex = Sex.FEMALE;
            } else if ("M".equals(wynik)) {
                sex = Sex.MALE;
            } else {
                System.out.println("Wybierz poprawnie plec");
            }
        }
        return sex;
    }
}
