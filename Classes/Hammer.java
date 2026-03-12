package Classes;

import javax.swing.*;

public class Hammer extends Weapon {
    private ImageIcon hammerPic;

    //Constructors
    public Hammer(int attack, int weight) {
        super(attack,weight);

        //Set image for this shape
        hammerPic = new ImageIcon(this.getClass().getResource("/Images/hammer.png"));
    }

    public ImageIcon getHammerPic() {
        return hammerPic;
    }

    public void setHammerPic(ImageIcon hammerPic) {
        this.hammerPic = hammerPic;
    }

    @Override
    public String getWeaponInformString() {
        return "The hammer is a weapon with powerful attack power. " +
                "A single attack can create a high hit point. " +
                "However, it is a heavy weapon and has a slow attack speed. ";
    }
}
