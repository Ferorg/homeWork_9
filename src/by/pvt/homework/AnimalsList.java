
package by.pvt.homework;

public class AnimalsList {
    public static Dogs[] createAnArrayOfDogs() {
        Dogs[] massDogs = new Dogs[3];
        massDogs[0] = new Dogs("Шарик", "Дворняга", 11, "чЕрный", 14, "Мясо");
        massDogs[1] = new Dogs("Биба", "Корги", 10, "Рыжий", 22, "Мясо");
        massDogs[2] = new Dogs("DD", "Хаски", 12, "Белый", 12, "Мясо");
        return massDogs;
    }

    public static Birds[] createAnArrayOfBirds() {
        Birds[] massBirds = new Birds[3];
        massBirds[0] = new Birds("Стриж", 8, "Черный", 5, "Насекомые");
        massBirds[1] = new Birds("Орел", 9, "Черный", 15, "мясо");
        massBirds[2] = new Birds("Воробей", 6, "Белый", 6, "Насекомые");
        return massBirds;
    }

    public static Lions[] createAnArrayOfLions() {
        Lions[] massLions = new Lions[3];
        massLions[0] = new Lions("Джек", "красный", 10, "Мясо");
        massLions[1] = new Lions("Тимон", "белый", 11, "Мясо");
        massLions[2] = new Lions("Пумба", "бурый", 12, "Мясо");
        return massLions;
    }
}
