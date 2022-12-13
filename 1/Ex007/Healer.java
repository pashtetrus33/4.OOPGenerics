package Ex007;

public class Healer extends BaseHero {
    int power;
    int maxpower;

    public Healer() {
        super(String.format("Hero_Healer #%d", ++BaseHero.number), Healer.r.nextInt(100, 500));
        this.maxpower = Healer.r.nextInt(100, 300);
        this.power = maxpower;
    }

    public String getInfo() {
        return String.format("%s, Power: %d", super.getInfo(), this.power);
    }

    public void heal(BaseHero target) {
        if (this.power > 0) {
            target.healed(power);
            this.power=0;
        }

        else {
            System.out.println("Healer does not have power to heal!");
        }
    }

}
