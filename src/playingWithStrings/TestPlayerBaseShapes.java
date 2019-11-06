package playingWithStrings;

interface MainGame{
    void showingName();
}

class GameShape implements MainGame{
    void displayShape(){
        System.out.println("display shape");
    }
    @Override
    public void showingName() {
        System.out.println("interface method");
    }
}

class PlayerBase extends GameShape{
    void runBase(){
        System.out.println("running second base");
    }
}

class PlayerPiece extends PlayerBase{
    void movePiece(){
        System.out.println("moving game piece");
    }
}

public class TestPlayerBaseShapes{

    public static void main(String[] args){
        GameShape piece = new GameShape();
        PlayerBase shape = new PlayerBase();
        PlayerPiece base = new PlayerPiece();
        base.runBase();
        shape.runBase();

        doShape(piece);
        doShape(shape);
        doShape(base);
    }

    public static void doShape(GameShape shape){
        shape.displayShape();
    }
}
