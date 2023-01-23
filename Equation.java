import java.util.Scanner;

public class Equation {
    public static void main(String[] args) {
        System.out.println("Enter equation: ");
        Scanner sc = new Scanner(System.in);
        String eq_str = sc.nextLine();
        sc.close();
        String str1 = eq_str.replace(" ", "");
        String str2 = str1.replace("+", ",");
        String str3 = str2.replace("=", ",");
        String[] eq_array = str3.split(",");

        boolean solution_found = false;
        for(int d = 0; d < 10 && !solution_found; d++){
            int x = Integer.parseInt(eq_array[0].replace("?",Integer.toString(d)));
            int y = Integer.parseInt(eq_array[1].replace("?",Integer.toString(d)));
            int z = Integer.parseInt(eq_array[2].replace("?",Integer.toString(d)));
            if(x + y == z){
                System.out.println(eq_str.replace("?",Integer.toString(d)));
                solution_found = true;
            }
        }
        if(!solution_found){
            System.out.println("No solution");
        }
    }
}