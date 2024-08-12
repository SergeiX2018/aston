public class Animal {
    private String name;
    private static int animalCount = 0;
    public Animal(String name) {
        this.name = name;
        animalCount++;
    }
    public String getName() {
        return name;
    }
    public static int getAnimalCount() {
        return animalCount;
    }
}
class Dog extends Animal {
    private int limitationsRun = 500;
    private int limitationsSwim = 10;
    private static int dogCount = 0;;
    public Dog(String name) {
        super(name);
        dogCount++;
    }
    public static int getDogCount() {
        return dogCount;
    }
    public String animalFoodInfo(int food) {
        if (food<0) {
            return "Животное " + getName() + " не может покушать из пустой миски ";
        }
        else{
            return "Животное " + getName() + " покушал " + food;
        }
    }
    public String animalRunningInfo(int lengthInfo) {
        if (lengthInfo > limitationsRun) {
            return "Животное " + getName() + " не может пробежать " + lengthInfo + " метров.";
        }
        else{
            return "Животное " + getName() + " пробежало " + lengthInfo + " метров.";
        }
    }
    public String animalSwimInfo(int lengthInfo) {
        if (lengthInfo > limitationsSwim) {
            return "Животное " + getName() + " не может проплыть " + lengthInfo + " метров.";
        }
        else{
            return "Животное " + getName() + " проплыло " + lengthInfo + " метров.";
        }
    }
}

class Cat extends Animal {
    private int limitationsRun = 200;
    private int limitationsSwim = 0;
    private static int catCount = 0;
    boolean satiety = false;
    public Cat(String name) {
        super(name);
        catCount++;
    }
    public static int getCatCount() {
        return catCount;
    }
    public String animalRunningInfo(int lengthInfo) {
        if (lengthInfo > limitationsRun) {
            return "Животное " + getName() + " не может пробежать " + lengthInfo + " метров.";
        }
        else{
            return "Животное " + getName() + " пробежало " + lengthInfo + " метров.";
        }
    }
    public String animalFoodInfo(int food) {
        if (food <0) {
            return "Животное " + getName() + " не может покушать из пустой миски ";
        } if (food>0 && food<50) {
            return "Животное " + getName() + " не трогает миску";
        } else{
            satiety= true;
            return "Животное " + getName() + " покушал " + food;
        }
    }
    public String animalSwimInfo(int lengthInfo) {
        if (lengthInfo > limitationsSwim) {
            return "Животное " + getName() + " не может проплыть " + lengthInfo + " метров.";
        } else {
            return "Животное " + getName() + " проплыло " + lengthInfo + " метров.";
        }
    }
}
class CatArrayFood {
    public static void getCat() {
        String[] cat = new String[3];
        cat[0] = "Пантера";
        cat[1] = "Черный";
        cat[2] = "Матильда";
        int dish = 100;
        int ate = 40;
        boolean satiety  = false;
        for (int i = 0; i < cat.length; i++) {
            dish-=ate;
            if(dish>20){
                satiety= true;
                System.out.println("Кот " + cat[i] + " покушал. Осталось еды: " + dish+ "Сытость"+satiety);
            }
            else if(dish<0){
                satiety=false;
                System.out.println("Кот " + cat[i] + " не ел.  Сытость"+satiety);
            }
            else{

                System.out.println("Кот " + cat[i] + " покушал. Осталось еды: " + dish+ "Сытость"+satiety);
            }
        }
    }
}
class AnimalAction {
    public static void main(String[] args) {
        Dog dog = new Dog("Бобик");
        Cat cat = new Cat("Барсик");
        System.out.println();
        System.out.println(dog.animalSwimInfo(1000));
        System.out.println(dog.animalFoodInfo(60));
        System.out.println(dog.animalRunningInfo(200));
        System.out.println(cat.animalRunningInfo(250));
        System.out.println(cat.animalSwimInfo(8));
        System.out.println(cat.animalFoodInfo(70)+" "+"сытость кошки"+" "+ cat.satiety);
        System.out.println("Общее количество созданных животных: " + Animal.getAnimalCount());
        System.out.println("Общее количество котов: " + Cat.getCatCount());
        System.out.println("Общее количество собак: " + Dog.getDogCount());
        CatArrayFood.getCat();
    }
}
