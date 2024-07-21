import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int userInp;

        Scanner input = new Scanner(System.in);
        System.out.print("Sınır sayısını giriniz: ");
        userInp = input.nextInt();

        for(int i=1; i<= userInp ; i*=4){
            System.out.println("4'ün katı: " + i);
        }
        System.out.println("----------------");

        for(int k=1;  k<=userInp; k*=5){
            System.out.println("5'in katı: " + k);
        }

    }
}