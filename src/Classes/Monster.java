package Classes;
public class Monster extends Character {
    private String p_monsterType;

    public Monster(String name, int hp, int defence, int agility, int baseAttack, String p_monsterType) {
        super(name, hp, defence, agility, baseAttack);
        this.p_monsterType = p_monsterType;
    }

    public String getP_monsterType() {
        return p_monsterType;
    }

    public void setP_monsterType(String p_monsterType) {
        this.p_monsterType = p_monsterType;
    }

    @Override
    public String toString() {
        return "Monster: " + p_monsterType;
    }
}
