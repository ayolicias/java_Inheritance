    package cars;

//    import java.awt.*;

    public class GameShape {
        public void displayShape(){
            System.out.println("Display Shapes");
        }
    }

    class PlayerPiece extends GameShape implements Animatable{
        public void movePiece(){
            System.out.println("Moving gameshape");
        }
        public void animate(){
            System.out.println("Animating....");
        }
    }

    class TilePiece extends GameShape{

        public void getAdjacent(){
            System.out.println(" Get Adjacent Tiles");
        }
    }
     class TestShape{

        public static void main(String[] args) {
            PlayerPiece player = new PlayerPiece();
            TilePiece tile = new TilePiece();
            doShape(player);
            doShape(tile);
//            shape.displayShape();
//            shape.movePiece();

        }

        public static void doShape(GameShape shape){
            shape.displayShape();
        }
    }



