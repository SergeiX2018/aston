
import java.util.Arrays;

public class Lesson_4 {
    public static void main(String[] args) {
        System.out.println("Решение 1 задания:".toUpperCase());
        printThreeWords();
        System.out.println("Решение 2 задания:".toUpperCase());
        checkSumSign();
        System.out.println("Решение 3 задания:".toUpperCase());
        printColor();
        System.out.println("Решение 4 задания:".toUpperCase());
        compareNumbers();
        System.out.println("Решение 5 задания:".toUpperCase());
        System.out.println(cSum(3,11));
        System.out.println("Решение 6 задания:".toUpperCase());
        num(0);
        System.out.println("Решение 7 задания:".toUpperCase());
        System.out.println(boolNum((-7)));
        System.out.println("Решение 8 задания:".toUpperCase());
        strNum("hello world", 5);
        System.out.println("Решение 9 задания:".toUpperCase());
        System.out.println(leapYear(800));
        System.out.println("Решение 10 задания:".toUpperCase());
        int[] arr = {1, 1, 0, 0, 1, 0, 0,1, 0, 0};
       System.out.println(Arrays.toString(getArr(arr)));
        System.out.println("Решение 11 задания:".toUpperCase());
       int [] arrNum = new int[100];
        System.out.println(Arrays.toString(arrayNumber(arrNum)));
        System.out.println("Решение 12 задания:".toUpperCase());
        int[] arrayNum = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(getArray(arrayNum)));
        System.out.println("Решение 13 задания:".toUpperCase());
        int[][] cell =new int [5][5];


        for (int[] row :  getTable(cell)) {
            System.out.println(Arrays.toString(row));

     }
        System.out.println("Решение 14 задания:".toUpperCase());
        System.out.println(Arrays.toString(getArrayE(5, 10)));

}

//         СОЗДАНИЕ МЕТОДОВ

    public static  void printThreeWords(){
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign(){
        int a =13;
        int b=-15;
        int sum=a+b;
        if(sum>=0){
            System.out.println("сумма положительная");
        }
        else{
            System.out.println("сумма отрицательная");
        }
    }

    public static void printColor(){
        int value=637;
        if(value<=0) {
            System.out.println("Красный");
        }
        else if(value>0&&value<=100) {
            System.out.println("Жёлтый");
        }
        else if(value>100){
            System.out.println("зелёный");
        }
    }

    public static void compareNumbers(){
        int a=15;
        int b=10;
        if(a>=b){
            System.out.println("a>=b");
        }
        else{
            System.out.println("a<b");
        }
    }

    public static boolean cSum(int a, int b){
        int sum= a+b;
        if(sum>=10&&sum<=20){
            return true;

        }
        else{
            return  false;
        }
    }

    public  static void num(int a){
        if(a<0){
            System.out.println("передано отрицательное число");
        }
        else{
            System.out.println("передано положительное число");
        }
    }

    public  static boolean boolNum(int a){
        if(a<0){
            return true;
        }
        else{
            return false;
        }
    }

    public static void strNum(String str, int num){
        for(int i=0; i<num;i++) {

            System.out.println(str);
        }
    }

    public  static  boolean leapYear(int year){
        if(year%4==0&&year%100!=0){
            return true;
        }
        else if(year%400==0){
            return true;
        }

        else{
            return false;
        }
    }

    public static int [] getArr(int[] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                arr[i]=0;
            }
            else{
                arr[i]=1;
            }
        }
       return arr;
    }


    public static int [] arrayNumber(int[] arrNum){
        for(int i=0;i<arrNum.length;i++){
            arrNum[i]=i+1;

        }
        return  arrNum;
    }

    public static int [] getArray(int[] arrayNum){
        for(int i=0;i<arrayNum.length;i++){
            if(arrayNum[i]<6){
                arrayNum[i]*=2;
            }

        }
        return arrayNum;
    }

    public static int [][] getTable(int[][] cell){
        for(int i=0;i<cell.length;i++){
            for(int y=0;y<cell[i].length; y++){
                cell[i][y]=0;

                if (i == y || y == cell[i].length - 1 - i) {
                    cell[i][y] = 1;
                }

                else{
                    cell[i][y] = 0;
                }




            }


        }
        return cell;
    }

    public static int[] getArrayE(int len, int initialValue){
        int [] arrayElem = new int [len];
        for(int i =0; i< arrayElem.length; i++){
            arrayElem[i]=initialValue;
        }
        return arrayElem;
    }

}
