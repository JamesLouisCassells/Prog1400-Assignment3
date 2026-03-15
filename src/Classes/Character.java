package Classes;
public abstract class Character {

    //Attributes of character shared by all children
    private String name;
    private int hp;
    private int defence;
    private int agility;
    private int baseAttack;

    //constructor
    public Character(String name, int hp, int defence,int agility, int baseAttack) {
        this.name = name;
        this.hp = hp;
        this.defence = defence;
        this.agility = agility;
        this.baseAttack = baseAttack;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }
    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public int getBaseAttack() {
        return baseAttack;
    }

    public void setBaseAttack(int baseAttack) {
        this.baseAttack = baseAttack;
    }

    @Override
    public String toString() {
        return "Name: " + name +
                ", HP: " + hp +
                ", Defence: " + defence +
                ", Agility: " + agility +
                ", Base Attack: " + baseAttack;
    }









}
