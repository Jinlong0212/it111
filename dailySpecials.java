import java.util.Scanner;

public class dailySpecials {

    public static void main(String[] args) {

        String specials;
        int amounts;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a day of the week excluding weekends (Monday - Friday) only!");


        specials = input.next();

//        input.close();
        // in the world of coffee, I need a name of a coffee beverage and a price.

        boolean saturday = specials.equalsIgnoreCase("Saturday");
        boolean sunday = specials.equalsIgnoreCase("Sunday");


        String coffee = " ";
        double price = 0, totalPrice, discountPrice1, discountPrice2;

        while(saturday || sunday) {
            System.out.println("Please enter a weekday, not weekend!");
            specials = input.next();

            saturday = specials.equalsIgnoreCase("Saturday");
            sunday = specials.equalsIgnoreCase("Sunday");

        }



            switch (specials.toLowerCase()) {

                // my cases will be the day of the week
                case "monday" -> {
                    coffee = "Latte";
                    price = 4.95;


                }// end of case.
                case "tuesday" -> {
                    coffee = "Frappe";
                    price = 5.95;



                }// end of case.
                case "wednesday" -> {
                    coffee = "Cappuccino";
                    price = 4.35;



                }// end of case.
                case "thursday" -> {
                    coffee = "Regular Joe";
                    price = 2.95;



                }// end of case.
                case "friday" -> {
                    coffee = "Green Tea Latte";
                    price = 6.95;


                }// end of case.

                default -> System.out.println("Please enter a valid day, or check your spelling!");
            }





        System.out.println(specials + "'s coffee of the day is a " + coffee + " and the price will be $" + price);

        System.out.println("How many " + coffee + "s would you like to oder?");
        amounts = input.nextInt();
        totalPrice = amounts * price;

        if (amounts == 0) {
            System.out.println("Looks like you don't like " + coffee + "s! So sad!!!");

        } else if (amounts == 1) {
            System.out.println("Looks like you will be ordering only " + amounts + " " + coffee + " today!");

        } else if(amounts <= 4 && amounts > 1){

            System.out.print(amounts + " " + coffee + "s have been ordered totalling $");
            System.out.printf("%.2f", totalPrice);
            System.out.println(" dollars!");

        } else  if(amounts < 10 && amounts >4) {
            discountPrice1= totalPrice * .9;

            System.out.print("Looks like you qualify for a group discount! Your regular price is $");
            System.out.printf("%.2f",totalPrice);
            System.out.println(" dollars!");
            System.out.print("you have ordered " +amounts+ " " +coffee+ "s but will be only charged $");
            System.out.printf("%.2f",discountPrice1);
            System.out.println(" dollars!");
        } else if(amounts >= 10) {
            discountPrice2= totalPrice * .8;

            System.out.print("A bigger group discount! Your regular price is $");
            System.out.printf("%.2f",totalPrice);
            System.out.println(" dollars!");
            System.out.print("You have ordered " +amounts+ " " +coffee+ "s but will be only charged $");
            System.out.printf("%.2f",discountPrice2);
            System.out.println(" dollars!");


        }








    }

}
