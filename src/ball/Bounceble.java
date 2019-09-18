    package ball;

interface Bounceble {
        void bounce();
        int getBounceFactor();
    }

    class GameWithBouncyBall{


            public static void play(Bounceble bounceble){

                if (bounceble.getBounceFactor() > 3) {
                        bounceble.bounce();
                    } else {
                        System.out.println("This is not bounceble enough to play this game");
                    }
                }
            }



    class BeachBall implements Bounceble{
    @Override
        public void bounce(){
        System.out.println("");
    }

        @Override
        public int getBounceFactor() {
            return 17;
        }
    }
      class Ball{
         public static void main(String[] args) {
//             GameWithBouncyBall.p
         }

    }
