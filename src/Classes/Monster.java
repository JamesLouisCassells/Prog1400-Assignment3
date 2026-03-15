package Classes;
public class Monster extends Character {

    public Monster(String name, int hp, int defence, int agility, int baseAttack) {
        super(name, hp, defence, agility, baseAttack);
    }

    @Override
    public String toString() {
        return "Monster: " + getName();
    }
}
