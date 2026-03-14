package Classes;
public class Warhammer extends Weapon {
    public Warhammer() {
        super("Warhammer", 7);
    }

    @Override
    public int getAttackValue(){
        return getDamageBonus();
    }
}
