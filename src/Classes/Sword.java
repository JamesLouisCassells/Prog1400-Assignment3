public class Sword extends Weapon {
    public Sword() {
        super("Sword", 5);
    }

    @Override
    public int getAttackValue(){
        return getDamageBonus();
    }
}
