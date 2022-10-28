import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> listPeople = new ArrayList<>();
        listPeople.add(new Person("Анна", "Мырсакат Уллу", 30));
        listPeople.add(new Person("Адриан", "Танги Мио", 25));
        listPeople.add(new Person("Лоди", "Юдин Мыс", 28));
        listPeople.add(new Person("Мадин", "Фролов", 17));
        listPeople.add(new Person("Тори", "Мира Ми", 15));

        listPeople.removeIf(x -> x.getAge() < 18);
        System.out.println(listPeople);

    }
}
