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

        boolean saturday = specials.equals("Saturday");
        boolean sunday = specials .equals("Sunday");

        if(saturday || sunday) {
            System.out.println("Please enter a weekday, not weekend!");
            specials = input.next();
        }

        String coffee;
        double price, totalPrice;

        switch (specials) {

            // my cases will be the day of the week
            case "Monday" -> {
                coffee = "Latte";
                price = 4.95;
                System.out.println(specials + "'s coffee of the day is a " + coffee + " and the price will be $" + price);

                System.out.println("How many Lattes would you like to oder?");
                amounts = input.nextInt();
                totalPrice =amounts * price;

                if(amounts == 0) {
                    System.out.println("Looks like you don't like "+coffee+"s! "+"So sad!!!");

                } else if (amounts == 1) {
                    System.out.println("Looks like you will be ordering only "+amounts+" "+coffee+" today!");

                }else {

                    System.out.print(amounts+" "+coffee+"s "+"have been ordered totalling $");
                    System.out.printf("%.2f", totalPrice);
                    System.out.println(" dollars!");

                }
            }// end of case.
            case "Tuesday" -> {
                coffee = "Frappe";
                price = 5.95;
                System.out.println(specials + "'s coffee of the day is a " + coffee + " and the price will be $" + price);

                System.out.println("How many Lattes would you like to oder?");
                amounts = input.nextInt();
                totalPrice =amounts * price;

                if(amounts == 0) {
                    System.out.println("Looks like you don't like "+coffee+"s! "+"So sad!!!");

                } else if (amounts == 1) {
                    System.out.println("Looks like you will be ordering only "+amounts+" "+coffee+" today!");

                }else {

                    System.out.print(amounts+" "+coffee+"s "+"have been ordered totalling $");
                    System.out.printf("%.2f", totalPrice);
                    System.out.println(" dollars!");

                }

            }// end of case.
            case "Wednesday" -> {
                coffee = "Cappuccino";
                price = 4.35;
                System.out.println(specials + "'s coffee of the day is a " + coffee + " and the price will be $" + price);

                System.out.println("How many Lattes would you like to oder?");
                amounts = input.nextInt();
                totalPrice =amounts * price;

                if(amounts == 0) {
                    System.out.println("Looks like you don't like "+coffee+"s! "+"So sad!!!");

                } else if (amounts == 1) {
                    System.out.println("Looks like you will be ordering only "+amounts+" "+coffee+" today!");

                }else {

                    System.out.print(amounts+" "+coffee+"s "+"have been ordered totalling $");
                    System.out.printf("%.2f", totalPrice);
                    System.out.println(" dollars!");

                }
                
            }// end of case.
            case "Thursday" -> {
                coffee = "Regular Joe";
                price = 2.95;
                System.out.println(specials + "'s coffee of the day is a " + coffee + " and the price will be $" + price);

                System.out.println("How many Lattes would you like to oder?");
                amounts = input.nextInt();
                totalPrice =amounts * price;

                if(amounts == 0) {
                    System.out.println("Looks like you don't like "+coffee+"s! "+"So sad!!!");

                } else if (amounts == 1) {
                    System.out.println("Looks like you will be ordering only "+amounts+" "+coffee+" today!");

                }else {

                    System.out.print(amounts+" "+coffee+"s "+"have been ordered totalling $");
                    System.out.printf("%.2f", totalPrice);
                    System.out.println(" dollars!");

                }

            }// end of case.
            case "Friday" -> {
                coffee = "Green Tea Latte";
                price = 6.95;
                System.out.println(specials + "'s coffee of the day is a " + coffee + " and the price will be $" + price);

                System.out.println("How many Lattes would you like to oder?");
                amounts = input.nextInt();
                totalPrice =amounts * price;

                if(amounts == 0) {
                    System.out.println("Looks like you don't like "+coffee+"s! "+"So sad!!!");

                } else if (amounts == 1) {
                    System.out.println("Looks like you will be ordering only "+amounts+" "+coffee+" today!");

                }else {

                    System.out.print(amounts+" "+coffee+"s "+"have been ordered totalling $");
                    System.out.printf("%.2f", totalPrice);
                    System.out.println(" dollars!");

                }

            }// end of case.
            default -> System.out.println("Please enter a valid day, or check your spelling!");
        }


    }

}
