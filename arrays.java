public class arrays {
    public static void main(String[] args){
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        int [] mynumbers = {10, 20, 30, 40};
        System.out.println(cars[0]);
        System.out.println(mynumbers[2]);

        cars[0] = "Opel";
        System.out.println(cars[0]);

        System.out.println(cars.length);

        String[] mycars1 = new String[4];
        mycars1[0] = "Volvo";
        mycars1[1] = "BMW"; 
        mycars1[2] = "Ford";
        mycars1[3] = "Mazda";

        for (String car : cars) {
            System.out.println(car);
        }

        for (String car1 : mycars1){
            System.out.println(car1);
        }
    }
}
