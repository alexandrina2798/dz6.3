package main.java;

public class Hunter extends Elf implements archer{

    public Hunter(String name){
        super.name = name;
        super.specification = "Охотник";
    }

    @Override
    public void run() {
        System.out.print("\"Мчусь, словно ветер!\"");
        System.out.println(", - донеслось из чащи, где уже сверкали пятки " + super.raceName);
    }

    @Override
    public void shot() {
        System.out.print(super.specification + " " + super.name + " натягивает тетиву: ");
        System.out.println("\"Я не промахнусь!\"");
    }

    @Override
    public void daggerAttack() {
        System.out.print(super.specification + " " + super.name + " достает кинжал и исподтишка наносит удар: ");
        System.out.println("\"Еще ничего не кончено!\"");
    }

    @Override
    public void evasion() {
        System.out.print(super.specification + " " + super.name + " уворачивается от атаки противника: ");
        System.out.println("\"Ты слишком медленный!\"");
    }
}
