import java.util.Arrays;

public class Employee{
      private String  surname;
      private String name;
      private String patronymic;
      private String position;
      private String email;
      private String phone;
      private String salary;
      private String age;

public  Employee(String surname, String name, String patronymic, String position, String email,String phone,String salary,String age){
    this.surname = surname;
    this.name = name;
    this.patronymic = patronymic;
    this.position = position;
    this.email=email;
    this.phone= phone;
    this.salary= salary;
    this.age=age;
}

     public    String getInfo(){
             return "ФИО: " + surname + " " + name + " " + patronymic +
                    ", Должность: " + position +
                    ", Электронная почта: " + email +
                    ", Телефон: " + phone +
                    ", Зарплата: " + salary +
                    ", Возраст: " + age;
    }

    public static void main(String[] args) {
        Employee employeeAston = new Employee("Обухов", "Сергей", "Степанович","Тестировщик", "sergey@gmail.com", "89448356777", "70", "37");
        System.out.println("ФИО: " + employeeAston.surname + " " + employeeAston.name + " " + employeeAston.patronymic +
                ", Должность: " + employeeAston.position +
                ", Электронная почта: " + employeeAston.email +
                ", Телефон: " + employeeAston.phone +
                ", Зарплата: " + employeeAston.salary +
                ", Возраст: " + employeeAston.age);

        Employee[] persArray = new Employee[5];
        persArray[0] = new Employee("Иванов", "Иван", "Иванович", "Аналитик", "Ivanov@gmail.com", "89554433333", "66", "33");
        persArray[1] = new Employee("Петров", "Дмитрий", "Сергеевич", "Программист", "petrov@gmail.com", "89654433434", "33", "23");
        persArray[2] = new Employee("Сидоров", "Пётр", "Петрович", "Системный админстратор", "sidorov@gmail.com", "89655656734", "90", "45");
        persArray[3] = new Employee("Смирнов", "Алексей", "Алексеевич", "Тестировщик", "smirnov@gmail.com", "89543732566", "80", "30");
        persArray[4] = new Employee("Кузнецова", "Кристина", "Александровна", "Дизайнер", "kuznetsova@gmail.com", "893433334343", "75", "29");

        for(Employee man : persArray){
            System.out.println(man.getInfo());
        }

    }

}


