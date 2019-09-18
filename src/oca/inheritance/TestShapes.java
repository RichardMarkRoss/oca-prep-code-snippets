package oca.inheritance;

class GameShape{
    public void displayShape(){
        System.out.println("display shape");
    }
}
class PlayerPiece extends GameShape {
    public void movePiece() {
        System.out.println("moving game piece");
    }
}
class TilePiece extends PlayerPiece{
    public void getAdjacent(){
        System.out.println("getting adjacent tiles");
    }
}

public class TestShapes {
    public static void main(String[] args) {
        PlayerPiece shape = new PlayerPiece();
        TilePiece tile = new TilePiece();
        GameShape game = new GameShape();
        doShape(shape);
        doShape(tile);
        doShape(game);
    }

    public static void doShape(GameShape shape){
        shape.displayShape();
    }
}
