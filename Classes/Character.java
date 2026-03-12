package Classes;

import GUI.*;

public abstract class Character {

    //Declare properties of ANY shape
    private String name;
    private Weapon weapon;
    private int baseAttack;
    private int defense;
    private int agility;
    private int hitPoints;

    public Character(String name, int attack, int weight, int agility, int hitPoints) {
        this.name = name;
        int[] stats = ChoosePanel.getTextFieldsData();
        this.setBaseAttack(stats[0]);
        this.setDefense(stats[1]);
        this.setAgility(stats[2]);
        this.setHitPoints(stats[3]);
    }

//    Getters & Setters:
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public int getBaseAttack() {
        return baseAttack;
    }

    public void setBaseAttack(int baseAttack) {
        this.baseAttack = baseAttack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    //Define a getCharacterInformString() method, to be inherited by subclasses
    public abstract String getCharacterInformString();

    @Override
    public String toString() {
        return "My name is " + name + ". My weapon is " + (weapon != null ? weapon.getWeaponInformString() : "none") + ".";
    }

    public abstract String getWeaponInformString();
}