import animal.Bear;
import animal.Deer;

public class Dz {
    public static void main(String[] args) {
//         Домашка
//         Базовый уровень
//         Задание №1 - Написать цикл, который выводит через пробел 100 чисел с приставкой "a".
//         Ожидаемый результат: 1а 2а 3а .. 100а
//
        for (int n = 1; n < 101; n++)
            System.out.print(n + "a ");


//        Задание №2
//         Дано:
//        int ageChildren = 10;
//        Задача: Написать условную конструкцию, которая в зависимости от возраста ребенка, отправляет его в учебное заведение
//        если ребенку до 6 лет то в сад, если до 11 лет в младшую школу, если до 17 лет в среднюю школу, иначе в университет
//        Отправляет - имеется в виду, печатает на экран: "пошел с сад", "пошел в младшую школу" и т.д.
//        Проверьте работоспособность условий, через изменение значения переменной.
//

        int Children = 10;
        if (Children <= 6) {
            System.out.println("детский сад");
        }
        if (7 <= Children == Children <= 10) {
            System.out.println("младшая школа");
        }
        if (11 <= Children == Children <= 16) {
            System.out.println("средняя школа");
        }
        if (Children >= 17) {
            System.out.println("университет");
        }


//        Задание №3
//        Дано:
        boolean chicken = true;
        boolean vegetables = false;
        boolean sour = true;
        boolean toast = true;
        boolean sausage = true;
        boolean eggs = true;

        if (chicken && vegetables && sour && toast) {
            System.out.println("цезарь");
        }
        if (vegetables && (sausage || chicken) && eggs) {
            System.out.println("оливье");
        }
        if (vegetables) {
            System.out.println("овощной");
        } else {
            System.out.println("нет салата");

        }


//         Задача: Повара попросили сделать салат.
//         Если у повара есть все ингредиенты для "Цезаря" (курица, овощи, соус и гренки), то лучше сделать "Цезарь".
//         Если для "Цезаря" ингредиентов не нашлось, то сделать Оливье (овощи, колбаса или курица, яйца).
//         Если и для Оливье не нашлось ингредиентов, то сделать Овощной салат (нужны только овощи).
//         Если ингредиентов нет, то повар объявляет: У меня ничего нет
//         Написать набор условий, приготовления салатов, по приоритету (от Цезаря к овощному). Либо объявить о невозможности сделать салат.
//         Ожидаемый результат: вывод на экран сделанного салата или объявление о том, что ничего нет.
//         Проверьте работоспособность условий, через изменение значения переменных.
//


//         Задание №4
//         Создать два класса, которые описывают какое либо животное (имеют два атрибута).
//         Написать к ним конструктор, сеттеры, геттеры.


        Bear bear = new Bear ("Grizzly",20);
        System.out.println(bear.getInfo() );

        Deer deer = new Deer("Sohat",10);
        System.out.println(deer.getInfo2() );


    }}