package Classes;
package Classes;

import GUI.*;
import javax.swing.*;

public class Cleric extends Character {
    private ImageIcon clericPic;
    private String name ;

    //Constructor
    public Cleric(String name, int hitPoints, int defense, int agility, int baseAttack) {
        super(name, hitPoints, defense, agility, baseAttack);

        clericPic = new ImageIcon(this.getClass().getResource("/Images/dwarf.png"));
    }

    public String getName() {return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public ImageIcon getClericPic() {
        return clericPic;
    }

    public void setClericPic(ImageIcon clericPic) {
        this.clericPic = clericPic;
    }

    public String toString() {
        int[] stats = ChoosePanel.getTextFieldsData();
        int[] monsStats = ChoosePanel.getSelectMonster();
        String monsterName = ChoosePanel.getMonsterName();
        return String.format("Player: %-10s\n---------------------" +
                        "\nClass: %-10s" +
                        "\nHP: %-3d\tDefense: %-3d\tAgility: %-3d\tBase Attack: %-3d" +
                        "\nWeapon: %-13s\tWeight: %-3d\tAttack Mod: %-3d" +
                        "\n\n" +

                        "Monster: %-10s\n---------------------" +
                        "\nHP: %-3d\tDefense: %-3d\tAgility: %-3d\tBase Attack: %-3d",
                name,
                ChoosePanel.getCharacterType(),
                stats[0],
                stats[1],
                stats[2],
                stats[3],
                ChoosePanel.getWeaponType(),
                stats[5],
                stats[4],
                monsterName,
                monsStats[0],
                monsStats[1],
                monsStats[2],
                monsStats[3]);
    }

    public String getCharacterInformString() {
        return "Clerics are usually dwarf. Have higher defense but low agility ";
    }

    public String getWeaponInformString() {
        return null;
    }
}
