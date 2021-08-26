public class main {
    public static void main(String[] args) {
        //5. Создать массив котов и тарелку с едой, попросить всех котов
        // покушать из этой тарелки и потом вывести информацию о сытости котов в консоль.
        cat[] cats = {
                new cat(5, "Геша"),
                new cat(20, "Кен"),
                new cat(10, "Анатолий")};

        plate plate = new plate(45);
        for (cat cat : cats) {
            cat.eat(plate);
        }
        plate.toeat(5);
        for (cat cat : cats) {
            cat.eat(plate);
        }
    }
}