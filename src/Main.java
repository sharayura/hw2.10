import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Phonebook phonebook1 = new Phonebook();

        String[] firstnames = {"Василий", "Петр", "Андрей", "Иван", "Анатолий", "Илья", "Владимир", "Олег"};
        String[] lastnames = {"Васильев", "Петров", "Ардреев", "Иванов", "Николаев", "Сидоров", "Владимиров"};

        Random rand = new Random();
        String firstname;
        String lastname;
        String number;

        while (phonebook1.size() < 20) {
            firstname = firstnames[rand.nextInt(firstnames.length)];
            lastname = lastnames[rand.nextInt(lastnames.length)];
            number = "+79" + (rand.nextInt(10) * 100_000_000 + rand.nextInt(100_000_000));
            phonebook1.addPhone(firstname, lastname, number);
        }
        phonebook1.printPhonebook();

        System.out.println();
        ////////////////////////////


    }
}