    package animals;
    //About casting
    public class Animal2 {
        public void makeNoise(){
//            System.out.println("Generic Noise");
        }
    }
    class Dog extends Animal2{
        void makeNose(){
            System.out.println("bark");
        }
        void playDead(){
            System.out.println("roll over");
        }
    }
    class CastTest2{
        private static Object Animal2;

        public static void main(String[] args) {
            Animal2 [] a = {new Animal2(), new Dog (),new Animal2()};
            for (Animal2 animal2 : a){
            animal2.makeNoise();
            if (animal2 instanceof Dog){
                //Casting the playDog
                Dog d = (Dog) Animal2;
//                ((Dog) animal2).playDead();
            }

            }
        }
    }
    // Method overloaded
     class Foo{
        void go(){
        }
    }

    class Bar extends Foo{

        String go (int x){
            return null;
        }
    }
