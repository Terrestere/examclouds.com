package VremenaGoda;

public class VremenaDemo {
    public static void main(String[] args) {
        VremenaGoda vremenaGoda = VremenaGoda.Summer;
        System.out.println(vremenaGoda);
        print(VremenaGoda.Summer);
        printAllValues();

        VremenaGoda vremenaGoda1 = VremenaGoda.valueOf("Summer");
        System.out.println(vremenaGoda1);


    }

        public static void print (VremenaGoda vremenaGoda){
            switch (vremenaGoda) {
                case Summer -> System.out.println("I love summer");
                case Spring -> System.out.println("I love spring");
                case Autumn -> System.out.println("I love autumn");
                case Winter -> System.out.println("I love winter");
                default -> System.out.println("Season don't choose");
            }
        }

        public static void printAllValues() {
        for (VremenaGoda vremenaGoda : VremenaGoda.values()){
            System.out.println(vremenaGoda + " " + vremenaGoda.ordinal()
                    +" " + vremenaGoda.getTemp() + " "
                    + vremenaGoda.getDescription());
        }
    }
}
