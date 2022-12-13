package Ex007;

// import java.util.ArrayList;
// import java.util.List;
// import java.util.Random;

public class Program {
    public static void main(String[] args) {
      
        // #region ex1 Demo

        BaseHero magician1 = new Magician();
        System.out.println(magician1.getInfo());

        BaseHero priest1 = new Priest();
        //System.out.println(priest1.getInfo());

        Healer healer1 = new Healer();
        //System.out.println(healer1.getInfo());

        //System.out.println("------");
   

        priest1.Attack(magician1);
        System.out.println(magician1.getInfo());

        healer1.heal(magician1);
        System.out.println(magician1.getInfo());
        healer1.heal(magician1);




        



        // #endregion

        // #region Teams

        // int teamCount = 15;
        // Random rand = new Random();
        // int magicianCount = 0;
        // int priestCount = 0;
        // int healerCount = 0;
 

        // List<BaseHero> teams = new ArrayList<>();
        // for (int i = 0; i < teamCount; i++) {
        //     int choice = rand.nextInt(3);
        //     if ( choice == 0) {
        //         teams.add(new Priest());
        //         priestCount++;
        //     }
        //     else if (choice == 1){
        //         teams.add(new Healer());
        //         healerCount++;
        //     }
        //     else{
        //         teams.add(new Magician());
        //         magicianCount++;
        //     }

        //     System.out.println(teams.get(i).getInfo());

        // }
        // System.out.println();
        // System.out.printf("magicalCount: %d priestCount: %d healerCount: %d \n\n", magicianCount, priestCount, healerCount);
        
        // attack

        // #endregion

        // todo добавить ещё один класс и 
        // реализовать возможность лечения героев
    }
}