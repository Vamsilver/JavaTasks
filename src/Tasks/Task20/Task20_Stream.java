package Tasks.Task20;

import Tasks.Task17.Task17_Enum;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Task20_Stream {
    public static void main(String[] args) {

        //Task 1
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Сыр");
        strings.add("Яйцо");
        strings.add("Майонез");
        strings.add("Колбаса");
        strings.add("Огурцы");
        strings.add("Кукуруза");

        System.out.println(func(strings.stream(),'М'));

        //Task 2
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Валера", 20));
        persons.add(new Person("Полина", 18));
        persons.add(new Person("Дима", 21));
        persons.add(new Person("Анастасия", 25));
        persons.add(new Person("Кирилл", 31));
        persons.add(new Person("Катя", 19));
        persons.add(new Person("Адам", 24));
        persons.add(new Person("Клава", 38));
        persons.add(new Person("Никита", 29));
        persons.add(new Person("Лиза", 27));

        persons.stream().filter(el -> el.age > 30).forEach(System.out::println);

    }

    public static long func(Stream<String> stringStream, char ch)
    {
        return stringStream.filter( element -> element.charAt(0) == ch)
                .count();

    }

    public static class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Name = " + name + ", Age = " + age;
        }
    }
}
