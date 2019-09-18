package oca.weapon_build;

public class AssualtRifle implements Weapon {
    @Override
    public String fire() {
        return "Skrrrr";
    }

    @Override
    public int magSize() {
        return 40;
    }

    public void condition(){
        System.out.println("good");
    }
}
