    package animals;
    //About casting
    public class Animal2 {
        public void makeNoise(){
            System.out.println("Generic Noise");
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
        public static void main(String[] args) {

        }
    }
