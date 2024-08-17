public class AnimalAction {
    public static void main(String[] args) {
        Dog dog = new Dog("Бобик");
        Cat cat = new Cat("Барсик");
        System.out.println();
        System.out.println(dog.animalSwim(1000));
        System.out.println(dog.animalFoodInfo(60));
        System.out.println(dog.animalRun(200));
        System.out.println(cat.animalRun(50));
        System.out.println(cat.animalSwim(8));
        System.out.println(cat.eat(70)+" "+"сытость кошки"+" "+ cat.satiety);
        System.out.println("Общее количество созданных животных: " + Animal.getAnimalCount());
        System.out.println("Общее количество котов: " + Cat.getCatCount());
        System.out.println("Общее количество собак: " + Dog.getDogCount());
    }
}
