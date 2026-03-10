public class Staff extends Weapon {
    public Staff() {
        super("Staff", 3);
    }

    @Override
    public int getAttackValue(){
        return getDamageBonus();
    }
}
