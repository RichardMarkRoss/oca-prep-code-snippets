package oca.weapon_build;

public class Pistol implements Weapon {
    @Override
    public String fire() {
        return "Bang";
    }

    @Override
    public int magSize() {
        return 15;
    }
}
