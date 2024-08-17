public class CatArrayFood {
    private static String[] cat;
    public static void getCat() {
        cat = new String[3];
        cat[0] = "Пантера";
        cat[1] = "Черный";
        cat[2] = "Матильда";
    }
    public static int eatFromPlate(int eatCount, int plate) {
        boolean satiety;
        for (int i = 0; i < cat.length; i++) {
            plate -= eatCount;
            if (plate > 20) {
                satiety = true;
                System.out.println("Кот " + cat[i] + " покушал. Осталось еды: " + plate + ". Сытость: " + satiety);
            } else if (plate <= 0) {
                satiety = false;
                System.out.println("Кот " + cat[i] + " не ел. Осталось еды: " + plate + ". Сытость: " + satiety);
                break;
            } else {
                satiety = false;
                System.out.println("Кот " + cat[i] + " покушал. Осталось еды: " + plate + ". Сытость: " + satiety);
            }
        }
        return plate;
    }
    public static int addFood(int plate) {
        if (plate < 20) {
           return  100;
        }
        else{
            return plate;
        }
    }
    public static void main(String[] args) {
        getCat();
        eatFromPlate(30, 100);
        int remainingFood =  eatFromPlate(30, 100);
        addFood(remainingFood);
    }
}
