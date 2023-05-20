class Medic extends Hero {
    public Medic(int health, int damage, String superAbility) {
        super(health, damage, superAbility);
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Medic применил суперспособность HEAL");
    }
}



