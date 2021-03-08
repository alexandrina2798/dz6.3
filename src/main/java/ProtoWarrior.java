package main.java;

public class ProtoWarrior extends Orc implements warriorWithShield{

    public ProtoWarrior(String name){
        super.name = name;
        super.specification = "Щитоносец";
    }

    @Override
    public void run() {
        System.out.print(super.raceName + " " + super.name+ " изменился в лице и сказал: ");
        System.out.println("\"Больно, очень больно, я лучше пойду\"");
    }

    @Override
    public void attack() {
        System.out.print(super.specification + " " + super.name + " делает выпад из-за щита в сторону противника: ");
        System.out.println("\"Умри с честью!\"");
    }

    @Override
    public void shieldAttack() {
        System.out.print(super.specification + " " + super.name + " бьет противника плашмя свои щитом: ");
        System.out.println("\"Арррррр!\"");
    }

    @Override
    public void shieldBlock() {
        System.out.print(super.specification + " " + super.name + " блокирует удар щитом: ");
        System.out.println("\"Это дамасская сталь, у тебя нет ни единого шанса!\"");
    }
}
