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
        }
        else{
            return "Животное " + getName() + " проплыло " + swim + " метров.";
        }
    }
}
