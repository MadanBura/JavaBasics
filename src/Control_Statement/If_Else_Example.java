package Control_Statement;

//Demonstrating If else with basic statement

public class If_Else_Example {

    public static void main(String[] args) {

        int number = 100;


        //IF
        if(number>10){
            System.out.println("Tha number is greater than 100 ");
        }

        //IF-ELSE
        if (number > 50){
            System.out.println("The number is greater than 50");
        }else {
            System.out.println("The number is smaller than 50");
        }


        // IF-ELSE IF
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }


    }
}
