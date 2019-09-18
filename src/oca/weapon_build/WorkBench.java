package oca.weapon_build;

import java.util.ArrayList;
import java.util.List;

public class WorkBench {

    private Weapon weapon;
    private List<String> attachment = new ArrayList<>(){};

    WorkBench(Weapon weapon){
        this.weapon = weapon;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setAttachment(Attachments att){
        attachment.add(att.toString());
    }

    public String getAttachment() {
        return attachment.toString();
    }

    public String fire(Weapon weapon){
        return weapon.fire();
    }
    public int magSize(Weapon weapon){
        return weapon.magSize();
    }
}
