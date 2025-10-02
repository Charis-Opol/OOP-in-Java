import java.util.ArrayList;
import java.util.Scanner;

public class Student_marks {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        ArrayList<String> regnos = new ArrayList<>();
        ArrayList<Integer> math_marks = new ArrayList<>();
        ArrayList<Integer> physics_marks = new ArrayList<>();
        ArrayList<Float> averages = new ArrayList<>();
        ArrayList<String> pass_or_fail = new ArrayList<>();
        System.out.println("Are you here to enter your marks?");
        System.out.println("If yes press 1 and if no press 0!");
        int answer1 = scan.nextInt();

        if(answer1 == 0){
            System.out.println("Exiting the system!");
        }
        else {
            System.out.println("Enter the number of students: ");
            int count = scan.nextInt();
            for (int i = 0; i < count; i++){
                System.out.println("Enter your name: ");
                String name = scan.nextLine();
                names.add(name);
                System.out.println("Enter your registration number: ");
                String regno = scan.nextLine();
                regnos.add(regno);
                System.out.println("Enter the math marks: ");
                int math = scan.nextInt();
                math_marks.add(math);
                System.out.println("Enter the physics marks: ");
                int physics = scan.nextInt();
                physics_marks.add(physics);
                float average = (math + physics)/2;
                averages.add(average);

                if (average < 50){
                    pass_or_fail.add("Fail");
                } else {
                    pass_or_fail.add("Pass");
                }
            } 
            scan.close();
            
        }

        System.out.println("Student marks reports.");

        for(int j = 0; j < names.size(); j++){
            System.out.println("------------------------------------------------------");
            System.out.print(names.get(j) + "\t" + regnos.get(j) + "\t" + math_marks.get(j) + "\t" + physics_marks.get(j) + "\t" + averages.get(j) + "\t" + pass_or_fail.get(j));
        }
    }
}
