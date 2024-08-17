
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
    @Override
    public String animalRun(int run){
        if (run > limitationsRun) {
            return "Животное " + getName() + " не может пробежать " + run + " метров.";
        }
        else{
            return "Животное " + getName() + " пробежало " + run + " метров.";
        }
    }

    public String animalSwim(int swim) {
        if (swim > limitationsSwim) {
            return "Животное " + getName() + " не может проплыть " + swim + " метров.";
        } else {
            return "Животное " + getName() + " проплыло " + swim + " метров.";
        }
    }

    public String eat(int food) {
        if (food <0) {
            return "Животное " + getName() + " не может покушать из пустой миски ";
        } if (food>0 && food<50) {
            return "Животное " + getName() + " не трогает миску";
        } else{
            satiety= true;
            return "Животное " + getName() + " покушал " + food;
        }
    }
}

