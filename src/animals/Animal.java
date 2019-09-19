    package animals;

    public class Animal {
        public void eat(){
            System.out.println("Generic Animal can eat Generically");
        }
        public void printYourself(){
            System.out.println("my name" + "is Ziya");
        }
    }
    class Horse extends Animal{
        public void eat(){

            System.out.println("Horse eats hay, oats " + " and Horse treats");

        }
        public void printYourself(){
            //Invoke the superclass
            super.printYourself();
        }

        //overload methods
        public static void eat(String s){
            System.out.println("Horse eating" + s);
        }

    }
    class TestAnimals{
        public static void main(String[] args) {
            Animal a = new Horse();
            a.eat();

            Horse b = new Horse();
            b.eat();
            String n = " ";

//            Horse he = new Horse();
//            he.eat();
              Horse.eat(n);



        }
    }