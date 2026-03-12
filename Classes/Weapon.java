package Classes;

public abstract class Weapon {
    private int attack;
    private int weight;

    public Weapon(int attack, int weight) {
        this.attack = attack;
        this.weight = weight;

    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public abstract String getWeaponInformString();

}
