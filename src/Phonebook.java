import java.util.HashMap;
import java.util.Map;

public class Phonebook {

    Map<String, String> phonebook = new HashMap<>();

    public void addPhone(String firstname, String lastname, String number) {
        phonebook.put((firstname + " " + lastname), number);
    }

    public int size() {
        return phonebook.size();
    }

    public void printPhonebook() {
        int i = 0;
        for (Map.Entry<String, String> current : phonebook.entrySet()) {
            System.out.println(++i + ". " + current.getKey() + " : " + current.getValue());
        }
    }
}
