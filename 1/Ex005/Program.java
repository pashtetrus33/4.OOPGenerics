package Ex005;

public class Program {
    public static void main(String[] args) {
        Magician hero1 = new Magician();
        System.out.println(hero1.getInfo());
        
        Priest hero2 = new Priest();
        System.out.println(hero2.getInfo());

        Priest hero3 = new Priest();
        System.out.println(hero3.getInfo());

        System.out.println(hero1.Attack());
        System.out.println(hero1.Attack());
        System.out.println(hero1.Attack());
        System.out.println(hero2.Attack());
        System.out.println(hero2.Attack());


        hero1.GetDamage(100);
        hero1.GetDamage(100);

    }
}