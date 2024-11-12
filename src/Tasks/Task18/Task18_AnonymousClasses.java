package Tasks.Task18;

public class Task18_AnonymousClasses {
    public static void main(String[] args) {
        Printable printable1 = new Printable() {
            @Override
            public void print(String str) {
                System.out.println(str);
            }
        };

        Printable printable2 = new Printable() {
            @Override
            public void print(String str) {
                System.out.print(str);
            }
        };

        Printable printable3 = new Printable() {
            @Override
            public void print(String str) {
                System.out.print("\n" + str + "\n\n");
            }
        };

        printable1.print("Привет я 1");
        printable1.print("Привет я 1");
        printable2.print("Привет я 2");
        printable2.print("Привет я 2");
        printable3.print("Привет я 3");
        printable3.print("Привет я 3");

        Concationble concationble1 = new Concationble() {
            @Override
            public String concat(String str1, String str2) {
                return str1 + str2;
            }
        };

        Concationble concationble2 = new Concationble() {
            @Override
            public String concat(String str1, String str2) {
                return str1 + " " + str2;
            }
        };

        Concationble concationble3 = new Concationble() {
            @Override
            public String concat(String str1, String str2) {
                return "\n" + str1 + " " + str2 + "\n";
            }
        };

        System.out.println(concationble1.concat("Привет", "я 1"));
        System.out.println(concationble2.concat("Привет", "я 2"));
        System.out.println(concationble3.concat("Привет", "я 3"));
    }

    @FunctionalInterface
    interface Printable {
        void print(String str);
    }

    //Ошибка в названии в задании
    @FunctionalInterface
    interface Concationble {
        String concat(String str1, String str2);
    }
}
