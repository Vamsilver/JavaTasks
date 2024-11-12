package Tasks.Task17;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Task17_Enum {
    public static void main(String[] args) {
        //Task 1
        System.out.println(getLetterIndex('d'));
        System.out.println(getLetterIndex("D"));

        //Task 2
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Валера", 20, Gender.M));
        persons.add(new Person("Полина", 18, Gender.F));
        persons.add(new Person("Дима", 21, Gender.M));
        persons.add(new Person("Анастасия", 25, Gender.F));
        persons.add(new Person("Кирилл", 31, Gender.M));
        persons.add(new Person("Катя", 19, Gender.F));
        persons.add(new Person("Адам", 24, Gender.M));
        persons.add(new Person("Клава", 38, Gender.F));
        persons.add(new Person("Никита", 29, Gender.M));
        persons.add(new Person("Лиза", 27, Gender.F));

        System.out.println(persons);

        System.out.println(getFilteredListOfPersons(persons, Gender.M));
    }

    public static int getLetterIndex(char c) {
        return getLetterIndex(Character.toString(c));
    }

    public static int getLetterIndex(String letter) {
        int result = -2;
        try {
            result = AlphabetEnglish.valueOf(letter.toUpperCase()).ordinal();
        } catch (Exception e) {
            System.out.println("Невозможно");
        }
        return result + 1;
    }

    public static List<Person> getFilteredListOfPersons(List<Person> personList, Gender gender) {
        List<Person> newPersons = new ArrayList<>(personList);
        newPersons.removeIf(person -> person.gender != gender);

        return newPersons;
    }

    public enum AlphabetEnglish {
        A,
        B,
        C,
        D,
        E,
        F,
        G,
        H,
        I,
        J,
        K,
        L,
        M,
        N,
        O,
        P,
        Q,
        R,
        S,
        T,
        U,
        V,
        W,
        X,
        Y,
        Z

    }

    public static class Person {
        private String name;
        private int age;
        private Gender gender;

        public Person(String name, int age, Gender gender) {
            this.name = name;
            this.age = age;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Name = " + name + ", Age = " + age + ", Gender = " + gender;
        }
    }

    public enum Gender {
        M,
        F
    }
}
