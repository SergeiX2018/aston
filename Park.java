import java.util.Arrays;

public class Park {

    private String name;
    private String address;

    public Park(String name, String address) {
        this.name = name;
        this.address = address;
    }
        public class AttractionInformation {
            private String name;
            private String time;
            private int price;

            public   AttractionInformation(String name,  String time, int price){
                this.name = name;
                this.time = time;
                this.price = price;
            }
         }



        public static void main(String[] args) {
            Park park = new Park("Ульяновка", "Ульяновск, улица капитана");
            Park.AttractionInformation attraction = park.new AttractionInformation("Остров", "9.00-18.00", 4000);
            System.out.println("Парк: " + park.name + ", Адрес: " + park.address);
            System.out.println("Атракцион: " + attraction.name + ", Время: " + attraction.time + " Стоимость " + attraction.price+" рублей");
        }
    }





