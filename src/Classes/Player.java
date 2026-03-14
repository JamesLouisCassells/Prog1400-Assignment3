package Classes;

public class Player extends Character { //inheritance
    //attributes, encapsulation (private fields), aggregation (player has a CharacterClass and Weapon)
    private CharacterClass characterClass;
    private Weapon weapon;
    //constructor
    public Player(String name, int hp, int defence, int agility, int baseAttack, CharacterClass characterClass, Weapon weapon) {
        super(name, hp, defence, agility, baseAttack);
        this.characterClass = characterClass;
        this.weapon = weapon;
    }

    public CharacterClass getCharacterClass() {

        return characterClass;
    }

    public void setCharacterClass(CharacterClass characterClass) {

        this.characterClass = characterClass;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public int calculateAttack() {
        return getBaseAttack()
                + weapon.getAttackValue()
                + characterClass.getClassBonus();
    }

    @Override
    public String toString() {
        return getName() +
                " | Class: " + characterClass +
                " | Weapon: " + weapon;
    }
}

