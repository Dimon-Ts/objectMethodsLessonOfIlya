public class Main {
    public static void main(String[] args) {
        PersonService personService = new PersonService();
        Person sarah = new Person("Sarah",30);
        sarah.setAge(31);
        sarah.increaseAge(31);

        if (personService.isAdult(sarah)) {
            System.out.println(" Иди в бар.");
        } else {
            System.out.println(" Иди в школу.");
        }
        System.out.println(sarah);
    }
}