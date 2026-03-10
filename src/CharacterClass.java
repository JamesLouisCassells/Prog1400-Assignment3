public abstract class CharacterClass {
    private String className;
    private String armourType;

    public CharacterClass(String className, String armourType) {
        this.className = className;
        this.armourType = armourType;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getArmourType() {
        return armourType;
    }

    public void setArmourType(String armourType) {
        this.armourType = armourType;
    }

    //superclass does not provide the value, FORCES THE SUBCLASS TO IMPLEMENT
    public abstract int getClassBonus();

    @Override
    public String toString() {
        return className + " (Armour Type: " + armourType + ")";
    }
}
