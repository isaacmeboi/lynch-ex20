package exercise20;

import java.util.Scanner;

class Taxes {
    double a;
    double tAmount;
    double t;
    String s;

    Scanner sc = new Scanner(System.in);

    public void scn() {
        System.out.print("What is order amount? ");
        a = sc.nextInt();
        System.out.print("Which state do you live in? ");
        s = sc.next();

    }
    public void prt() {

        if(s.equals("Wisconsin")){

            System.out.print("Which county?? ");
            String county = sc.next();

            if(county.equals("Eau Claire")){
                t = (a*5.005)/100;
                tAmount = t + a;
            }
            if(county.equals("Milwaukee")){
                t = (a*5.005)/100;
                tAmount = t + a;
            }
            if(county.equals("Brown")){
                t = (a*5.005)/100;
                tAmount = t + a;
            }
            else if(county.equals("Dunn")){
                t = (a*5.004)/100;
                tAmount = t + a;
            }
            else{
                System.out.println("Please enter an available county.");
            }
        }
        else{
            t = 0.0;
            tAmount = a;
        }
        System.out.println("The tax is  $"+String.format("%.2f",t));
        System.out.println("The total is  $"+String.format("%.2f",tAmount));
    }
}


public class solution20{

    public static void main(String[] args) {
        Taxes ca = new Taxes();
        ca.scn();
        ca.prt();

    }
}
/*
a very fun one to do. the first thing we do is create the voids prt and scn, our old friends.
these are held within the class Taxes which first initializes the doubles a, t, tAmount, and
then the string s. scn scans in the order amount as well as the state the user is from. then,
prt holds the if else statements. if the user inputs any other state than wisconsin then it
prints the initial amount and adds zero tax. if they do put in wisconsin there are 4 diff
counties to choose from for this if else: brown, dunn, eua claire, and milwaukee. the main
function then calls these two public voids to run the program.
 */