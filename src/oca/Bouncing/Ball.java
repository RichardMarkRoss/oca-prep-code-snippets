package oca.Bouncing;

class GameWithBouncyBall{
    public static void play(Bouncable bouncable){
        if(bouncable.getBounceFactor() > 3){
            System.out.println("lets play the game");
            bouncable.bounce();
        }else{
            System.out.println("This is not bouncable enough to play this game");
        }
    }
}
class BeachBall implements Bouncable{

    @Override
    public void bounce() {
        System.out.println("bounce a beach ball");
    }

    @Override
    public int getBounceFactor() {
        return 5;
    }

    @Override
    public void ageGroup() {

    }
}
public class Ball {
    public static void main(String[] args) {
        GameWithBouncyBall.play(new BeachBall());
        GameWithBouncyBall gameWithBouncyBall = new GameWithBouncyBall();
        BeachBall beachBall = new BeachBall();
        System.out.println(beachBall instanceof Bouncable);
    }

}
