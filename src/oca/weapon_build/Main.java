package oca.weapon_build;

public class Main {
    public static void main(String[] args) {
        Pistol pistol = new Pistol();
        AssualtRifle rifle = new AssualtRifle();
        WorkBench smallGun = new WorkBench(pistol);
        WorkBench smalllargeGun = new WorkBench(pistol);

        smallGun.fire(pistol);
        smallGun.magSize(pistol);

        smallGun.setAttachment(Attachments.extendedMag);
        smallGun.setAttachment(Attachments.laserSight);
        smallGun.setAttachment(Attachments.longBarrel);
        smallGun.setAttachment(Attachments.Supressor);
        smallGun.setAttachment(Attachments.stock);

        System.out.println(smallGun.getAttachment());
        System.out.println(smallGun.fire(pistol));
//        System.out.println();

    }
}
