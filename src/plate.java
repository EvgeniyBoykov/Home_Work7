public class plate {

    // 2. Сделать так, чтобы в тарелке с едой не могло получиться отрицательного
    // количества еды (например, в миске 10 еды, а кот пытается покушать 15-20).

    private int food;
    public plate(int food) {this.food = food;}
    public void negativefood(int appetit) {
        if (!tobeeat(appetit)){
            System.out.println("Еды в тарелике меньше, чем желания поесть");}
        else
        {food = food -appetit;}}
    public boolean tobeeat (int appetit){
        return appetit < food;}

    //6. Добавить в тарелку метод, с помощью которого можно было бы
// добавлять еду в тарелку.
    public void toeat (int Food)
    {
        food += Food;
    }}