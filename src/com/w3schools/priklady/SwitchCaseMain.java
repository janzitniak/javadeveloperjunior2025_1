package com.w3schools.priklady;

public class SwitchCaseMain {
    public static void main(String[] args) {
        int day = 4;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }
// Outputs "Thursday" (day 4)



        day = 4;
        switch (day) {
            case 6:
                System.out.println("Today is Saturday");
                break;
            case 7:
                System.out.println("Today is Sunday");
                break;
            default:
                System.out.println("Looking forward to the Weekend");
        }
// Outputs "Looking forward to the Weekend"


        String nazovDna = "štvrtok";
        switch (nazovDna) {
            case "pondelok":
                System.out.println(1);
                break;
            case "utorok":
                System.out.println(2);
                break;
            case "streda":
                System.out.println(3);
                break;
            case "štvrtok":
                System.out.println(4);
                break;
            default:
                System.out.println("Je to iný deň");
        }


    }
}
