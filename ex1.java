import java.util.Scanner;
public class ex1{
public static void main(String[]args);{
    Scanner scan = new Scanner(System.in);
    System.out.println("Player 1 please enter your card");
    int num2 = scan.nextInt();
    System.out.println("Player 1 please enter the type of your card");
    char ch1 = scan.next().charAt(0);
    System.out.println("Player 2 please enter your card");
    int num2 = scan.nextInt();
    System.out.println("Player 2 please enter the type of your card");
    char ch2 = scan.next().charAt(0);
    if((char1 ='d')||(char2 = 'd')){
        System.out.println("The game is a tie");}

    else if (char1 ='d') {
        System.out.println("Player 1 is the winner");}

    else if (char 2 = 'd' ) {
        System.out.println("Player 2 is the winner");}

    else if ( num1 > num2 ){
        System.out.println("Player 1 is the winner");}

    else if ( num2 > num1){
        System.out.println("Player 2 is the winner");}

    else if (num1 = num2){
        System.out.println("The game is a tie");}

}

}