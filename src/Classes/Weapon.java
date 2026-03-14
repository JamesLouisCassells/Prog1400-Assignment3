package Classes;
public abstract class Weapon {
    private String weaponName;
    private int damageBonus;

    public Weapon(String weaponName, int damageBonus) {
        this.weaponName = weaponName;
        this.damageBonus = damageBonus;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    public int getDamageBonus() {
        return damageBonus;
    }

    public void setDamageBonus(int damageBonus) {
        this.damageBonus = damageBonus;
    }

    //superclass does not provide the value, FORCES THE SUBCLASS TO IMPLEMENT
    public abstract int getAttackValue();

    @Override
    public String toString() {

        return weaponName + " (Damage Bonus: " + damageBonus + ")";
    }
}
