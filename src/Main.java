import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Person> listPeople = new ArrayList<>();
        listPeople.add(new Person("Анна", "Мырсакат Уллу", 30));
        listPeople.add(new Person("Адриан", "Танги Мио", 25));
        listPeople.add(new Person("Лоди", "Юдин Мыс", 28));
        listPeople.add(new Person("Мадин", "Фролов", 17));
        listPeople.add(new Person("Тори", "Мира Ми", 15));
        System.out.println(listPeople);


        listPeople.sort ((p1, p2) -> {
            int len1 = p1.getSurname().split(" ").length;
            int len2 = p2.getSurname().split(" ").length;
            if (len1 != len2) {
                return Integer.compare(len1, len2);
            }
            return Integer.compare(p1.getAge(), p2.getAge());
        });

        System.out.println(listPeople);
    }
}
