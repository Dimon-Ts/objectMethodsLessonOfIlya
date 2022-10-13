public class Person {

        private final String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age =  age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age ;
        }
        public void increaseAge(int increment) {
            if (increment < this.age) {
                throw new IllegalArgumentException(" Инкримент не может быть меньше,текущего.");
            }
            if (increment < 0) {
                throw new IllegalArgumentException(" Инкримент не может быть отрицательным.");
            }

        }
        public String toString() {
            return "Имя " + this.name + " , Возраст " + this.age + ".";
        }
    }

