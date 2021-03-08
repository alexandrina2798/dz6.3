package main.java;

public class FuryWarrior extends Human implements doubleHandWeapon {

    public FuryWarrior(String name){
        super.name = name;
        super.specification = "Воин";
    }

    @Override
    public void run() {
        System.out.print("Яростный " + super.raceName + " " + super.name + " замешкался. ");
        System.out.println("\"А я выключил утюг?\" *яростно бежит прочь*");
    }

    @Override
    public void attack() {
        System.out.print(super.specification + " " + super.name + " проводит серию ударов: ");
        System.out.println("\"И с правой, и с левой!\"");
    }

    @Override
    public void strongAttack() {
        System.out.print(super.specification + " " + super.name + " обрушивает на врага швал сокрушительных ударов: ");
        System.out.println("\"Я тебя уничтожу, чернь!\"");
    }

    @Override
    public void reflection() {
        System.out.print(super.specification + " " + super.name + " отражает удар, скрещивая свои клинки : ");
        System.out.println("\"Ты даже не стараешься!\"");
    }
}
