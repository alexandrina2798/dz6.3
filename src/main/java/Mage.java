package main.java;

public class Mage extends Human implements wizard{

    public Mage(String name){
        super.name = name;
        super.specification = "Маг";
    }

    @Override
    public void run() {
        System.out.print(super.raceName + " " + super.name + " негодует: ");
        System.out.println("\"Не ради физических упражнений я обучался магии!\" *убегает по-магически*");
    }

    @Override
    public void iceAttack() {
        System.out.print(super.specification + " " + super.name + " кидает сосульки во врага: ");
        System.out.println("\"Я пронжу твою плоть!\"");
    }

    @Override
    public void fireAttack() {
        System.out.print(super.specification + " " + super.name + " создает фаербол: ");
        System.out.println("\"Сгори!\"");
    }

    @Override
    public void iceBlock(){
        System.out.print(super.specification + " " + super.name + " создает вокруг себя непробимаеммую ледяную глыбу: ");
        System.out.println("*из-под толщи льда не доносится звуков*");
    }
}
