public class GallonsLiters {

    public static void main(String[] args) {

        double Gallon, Liter;
        int counter = 0;

        for (Gallon = 1; Gallon <= 100; Gallon = Gallon+5) {
            Liter = Gallon * 3.79;
            counter += 1;

            System.out.printf("%.2f",Liter);

            if(Gallon == 1) {
                System.out.println(" Liters = " +Gallon+ " Gallon");
            } else {
                System.out.println(" Liters = " +Gallon+ " Gallons");
            }

            if(counter == 5) {
                System.out.println();
                counter = 0;
            }

        } // for lop end
        System.out.println("We are done!!!");
    }

}
