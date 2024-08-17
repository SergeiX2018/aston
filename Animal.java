public class Animal {
    private String name;
    private static int animalCount = 0;
public String animalSwim(int swim){
   return "Животное может плыть"+swim+ "метров";
}
    public String animalRun(int run){
        return "Животное может бежать"+run+ "метров";
    }
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
