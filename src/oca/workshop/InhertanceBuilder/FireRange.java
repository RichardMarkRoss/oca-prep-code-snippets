package oca.workshop.InhertanceBuilder;

class Weapon{
    public void sound(){
        System.out.println("different sounds");
    }
}
class Gun extends Weapon{
    @Override
    public void sound() {
        System.out.println("bang");
    }
}
class AssaultRifle extends Gun{
    @Override
    public void sound() {
        System.out.println("Skrrrrrrt Skrrrrrrt!");
    }
}
class  Pistol extends Gun{
    @Override
    public void sound() {
        System.out.println("bang bang bang!");
    }
}
class Launchers extends Weapon{
    @Override
    public void sound() {
        System.out.println("boom");
    }
}
class Missile extends  Launchers{
    @Override
    public void sound() {
        System.out.println("SSSHHHH.....BOOOOMMM!!!");
    }
}
class Grenade extends Launchers{
    @Override
    public void sound() {
        System.out.println("flump......BOOOOMMM!!!");
    }
}

class UseWeapons{
    void explode(Launchers launchers){

    }
    void closeCombat(Gun gun){

    }
    void antiTank(Missile missile){

    }
    void oneHanded(Pistol pistol){

    }
    void confirmKill(Object kill){

    }
}
class WaterGun{

}

public class FireRange {
    public static void main(String[] args) {
        Missile rpg = new Missile();
        Launchers rpg1 = rpg;
        Weapon rpg2 = rpg1;
        Object rpg3 = rpg2;

        Object castingRpg = (Launchers) rpg3;
        Weapon castingRpg1 = (Launchers) rpg3;// casing reference type needs to be higher
        Launchers castingRpg2 = (Launchers) rpg3; // casing reference type needs to be level

        castingRpg1.sound(); // casted form the missile.
        castingRpg2.sound(); // still calling the missile.

        Launchers launchers = new Launchers();
//        Missile boom = (Missile) launchers; // class casting exception.
        UseWeapons useWeapons = new UseWeapons();

        useWeapons.antiTank(new Missile());

        useWeapons.explode(new Launchers());
        useWeapons.explode(new Missile());
        useWeapons.explode(new Grenade());

        useWeapons.closeCombat(new Gun());
        useWeapons.closeCombat(new AssaultRifle());
        useWeapons.closeCombat(new Pistol());

        useWeapons.oneHanded(new Pistol());

        useWeapons.confirmKill(new WaterGun());// passing an 'Object' can pass in anything
    }
}
