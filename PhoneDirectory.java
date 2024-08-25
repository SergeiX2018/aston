import java.util.ArrayList;
import java.util.HashMap;
public class PhoneDirectory {
    private HashMap<String, ArrayList<String>> phoneBook;
    public PhoneDirectory() {
        phoneBook = new HashMap<>();
    }
    public void add(String lastName, String phoneNumber) {
        if (phoneBook.containsKey(lastName)) {
            phoneBook.get(lastName).add(phoneNumber);
        } else {
            ArrayList<String> numbers = new ArrayList<>();
            numbers.add(phoneNumber);
            phoneBook.put(lastName, numbers);
        }
    }
    public ArrayList<String> get(String lastName) {
        if (phoneBook.containsKey(lastName)) {
            return phoneBook.get(lastName);
        } else {
            return null;
        }
    }
    public static void main(String[] args) {
        PhoneDirectory phoneDirectory = new PhoneDirectory();
        phoneDirectory.add("Иванов", "894565454555");
        phoneDirectory.add("Иванов", "896767673456");
        phoneDirectory.add("Антонов", "895674563653");
        phoneDirectory.add("Белова", "89226571245");
        System.out.println("Номера Иванова: " + phoneDirectory.get("Иванов"));
        System.out.println("Номера Антонова: " + phoneDirectory.get("Антонов"));
        System.out.println("Номера Беловой: " + phoneDirectory.get("Белова"));
        System.out.println("Номера Кудряшова: " + phoneDirectory.get("Кудряшов"));
    }
}
