import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class ArrayCollection {
    private ArrayList<String> arrayList;
    public void createArray() {
        arrayList = new ArrayList<>();
        arrayList.add("Программист");
        arrayList.add("Аналитик");
        arrayList.add("Менеджер");
        arrayList.add("Аналитик");
        arrayList.add("Дизайнер");
        arrayList.add("Менеджер");
        arrayList.add("Системный администратор");
        arrayList.add("Программист");
        arrayList.add("Тестировщик");
        arrayList.add("Аналитик");
        arrayList.add("Тестировщик");
        arrayList.add("Дизайнер");
        arrayList.add("Менеджер");
        arrayList.add("Системный администратор");
        arrayList.add("Тестировщик");
    }
    public static void main(String[] args) {
        ArrayCollection arrayCollection = new ArrayCollection();
        arrayCollection.createArray();
        Set<String> set = new LinkedHashSet<>(arrayCollection.arrayList);
        System.out.println("Список уникальных слов: " + set);
        System.out.println("Количество уникальных слов: " + set.size());
    }
}
