package main.java;

public class Battle {

    public static void start(){

        //battle1
        Mage mage = new Mage("Солярис");
        DarkMage darkMage = new DarkMage("Даркмун");

        mage.iceAttack();
        darkMage.summonDemons();
        mage.fireAttack();
        darkMage.astralEvasion();
        darkMage.disintegration();
        mage.run();

        //перерыв
        System.out.println("**************************************************");
        System.out.println("Через время на поле битвы схлетнулись другие противники");
        System.out.println("**************************************************");

        //battle2
        Hunter hunter = new Hunter("Вепрь");
        ProtoWarrior protoWar = new ProtoWarrior("Оксимирон");

        hunter.shot();
        protoWar.shieldBlock();
        protoWar.attack();
        hunter.daggerAttack();
        protoWar.run();

        //перерыв
        System.out.println("**************************************************");
        System.out.println("Через время на поле битвы схлетнулись другие противники");
        System.out.println("**************************************************");

        //battle3
        FuryWarrior furyWar = new FuryWarrior("Гнойный");

        furyWar.strongAttack();
        protoWar.shieldBlock();
        protoWar.shieldAttack();
        furyWar.attack();
        protoWar.shieldAttack();
        furyWar.run();

    }

}
