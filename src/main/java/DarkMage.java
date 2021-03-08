package main.java;

public class DarkMage extends Elf implements warlock{

    public DarkMage(String name){
        super.name = name;
        super.specification = "Чернокнижник";
    }

    @Override
    public void run() {
        System.out.print("Словно гром среди ясного неба звучал крик " + super.raceName + ": ");
        System.out.println("\"Во имя Вельзевула, это еще не конец!\" *исчезает в портале*");
    }

    @Override
    public void summonDemons() {
        System.out.print(super.specification + " " + super.name + " заключает контракт с чем-то зловещим: ");
        System.out.println("\"Придите на землю и сейте хаос, прислужники темных сил!\"");
    }

    @Override
    public void disintegration() {
        System.out.print(super.specification + " " + super.name + " сводит руки в непонятных рунических изображениях: ");
        System.out.println("\"Я расщеплю тебя на атомы!\"");
    }

    @Override
    public void astralEvasion() {
        System.out.print(super.specification + " " + super.name + " теряет физическую оболочку и переносится в мир духов для избежания урона: ");
        System.out.println("\"Тебе не навредить мне! Моя душа принадлежит силам столь могущественным, что ты и представить не можешь! Ахахаха\"");
    }
}
