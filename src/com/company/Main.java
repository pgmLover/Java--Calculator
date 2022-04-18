package com.company;

        import java.util.Scanner;

public class Main {



    static int Addition(int x, int y){
        System.out.print("Addition  is:");
        return (x+y);
    }

    static  int Subtraction (int x, int y){
        System.out.print("Subtraction is:");
        return (x-y);
    }

    static int Multiplication(int x, int y){
        System.out.print("Product is:");
        return (x*y);

    }

    static  int Division(int x, int y){
        System.out.print("Division is:");
        return (x/y);
    }

    static  int Modulus(int x, int y){
        System.out.print("Modulus is:"+ x%y);
        return (x%y);
    }

    public static void main(String[] args) {


        Scanner sc= new Scanner(System.in);

        System.out.print("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Modulas\n\n Choose Your Option:");
        int opt=sc.nextInt();

        if(opt<6 && opt >0) {

            System.out.print("Enter First Number: ");
            int Num1 = sc.nextInt();
            System.out.print("Enter Second Number:");
            int Num2 = sc.nextInt();
            int result;


            switch (opt) {
                case 1:
                    result = Addition(Num1, Num2);
                    System.out.print(result);
                    break;

                case 2:
                    result = Subtraction(Num1, Num2);
                    System.out.print(result);
                    break;

                case 3:
                    result = Multiplication(Num1, Num2);
                    System.out.print(result);
                    break;

                case 4:
                    result = Division(Num1, Num2);
                    System.out.print(result);
                    break;
                case 5:
                    result = Modulus(Num1, Num2);
                    break;
                default:
                    System.out.print("Choose a Valid Option");
            }
        }


    }
}
