public class Main {
    public static void main(String[] args) {
        System.out.println(condition(25,10));
        System.out.println(condition(67,14));
        System.out.println(condition(15,10));
        System.out.println(condition(25,16));
        System.out.println(condition(50,40));

    }
    public static String condition(int age, int temperature) {
        if (age>20 && age <45 && temperature >-20 && temperature<30){
            return "можно идти гулять";
        }else if (age<20 && temperature > 0 &&  temperature<25){
            return "можно идти гулять";
        }else if (age>45 && temperature>-10 && temperature<25){
            return " можно идти гулять";
        }else {return "оставайтесь дома";}
    }



}
