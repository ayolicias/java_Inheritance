    package animals;

    public class Animal {
        public void eat(){
            System.out.println("Generic Animal can eat Generically");
        }
    }
    class Horse extends Animal{
        public void eat(){
            System.out.println("Horse eats hay, oats " + " and Horse treats");
        }
    }
    class TestAnimals{
        public static void main(String[] args) {
            Animal a = new Animal();
            Animal b = new Horse();
            a.eat();
            b.eat();
        }
    }