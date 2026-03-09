public class Player extends Character { //inheritance
    //attributes, encapsulation (private fields), aggregation (player has a CharacterClass and Weapon)
    private CharacterClass p_characterClass;
    private Weapon p_weapon;
    //constructor
    public Player(String name, int hp, int defence, int agility, int baseAttack, CharacterClass p_characterClass, Weapon p_weapon) {
        super(name, hp, defence, agility, baseAttack);
        this.p_characterClass = p_characterClass;
        this.p_weapon = p_weapon;
    }

    public CharacterClass getP_characterClass() {
        return p_characterClass;
    }

    public void setP_characterClass(CharacterClass p_characterClass) {
        this.p_characterClass = p_characterClass;
    }

    public Weapon getP_weapon() {
        return p_weapon;
    }

    public void setP_weapon(Weapon p_weapon) {
        this.p_weapon = p_weapon;
    }
}

