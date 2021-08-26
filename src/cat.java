public class cat {

    //3. Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны).
    // Если коту удалось покушать (хватило еды), сытость = true.
    private boolean full;
    private int appetite;
    private String name;

    public cat (int appetite, String name){
        full = false;
        this.appetite = appetite;
        this.name = name;}

    //4. Считаем, что если коту мало еды в тарелке, то он её просто не трогает, то есть
// не может быть наполовину сыт (это сделано для упрощения логики программы).
    public void eat (plate plate){
        if (plate.tobeeat(appetite) && !full){
            System.out.println(name + " кушает ");
            plate.negativefood(appetite);
            full = true;}
        else if (!plate.tobeeat(appetite))
        {System.out.println(name + "," + " недовольный хочет есть ");}
        else if (full){
            System.out.println(name + "," + " сытый ");}
    }}
