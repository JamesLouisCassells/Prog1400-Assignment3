package Classes;

import GUI.*;
import javax.swing.*;

public class Warrior extends Character {
    private ImageIcon warriorPic;
    private String name ;

    //Constructors
    public Warrior(String name, int hitPoints, int defense, int agility, int baseAttack) {
        super(name, hitPoints, defense, agility, baseAttack);
        warriorPic = new ImageIcon(this.getClass().getResource("/Images/fighter.png"));
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ImageIcon getWarriorPic() {
        return warriorPic;
    }

    public void setWarriorPic(ImageIcon warriorPic) {
        this.warriorPic = warriorPic;
    }

    //toString method to return a description of the object.
    @Override
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

    @Override
    public String getWeaponInformString() {
        return null;
    }

    @Override
    public String getCharacterInformString() {
        return "Fighters are often human.Have higher HP and defence but low agility.";
    }
}
