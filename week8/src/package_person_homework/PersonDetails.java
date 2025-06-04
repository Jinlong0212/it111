package package_person_homework;

public class PersonDetails {

    public static void main(String[] args) {

        Person firstPerson;
        Person secondPerson;

        firstPerson = new Person();
        secondPerson = new Person();


        firstPerson.name = "Andy";
        firstPerson.age = 21;
        firstPerson.carYear = 2025;
        firstPerson.violations = true;
        firstPerson.creditScore = 670;

        secondPerson.name = "Annie";
        secondPerson.age = 32;
        secondPerson.carYear = 2022;
        secondPerson.violations = false;
        secondPerson.creditScore = 690;

        double monthlyRate = 0;
        double adjustedRate = 0;




        firstPerson.display();
        System.out.print("Preliminary Rate for " + firstPerson.name+  ": $");
        System.out.printf("%.2f", firstPerson.getRate(monthlyRate));
        System.out.println(" dollars");

        System.out.print("Adjustments: $");
        System.out.printf("%.2f", firstPerson.assumeCarYear(adjustedRate));
        System.out.println(" dollars");

        System.out.print("Here is " +firstPerson.name+ "'s total monthly premium: $");
        System.out.printf("%.2f", firstPerson.assumeCarYear(adjustedRate) + firstPerson.getRate(monthlyRate));
        System.out.println(" dollars");

        System.out.println();

        secondPerson.display();
        System.out.print("Preliminary Rate for " + secondPerson.name+  ": $");
        System.out.printf("%.2f", secondPerson.getRate(monthlyRate));
        System.out.println(" dollars");

        System.out.print("Adjustments: $");
        System.out.printf("%.2f", secondPerson.assumeCarYear(adjustedRate));
        System.out.println(" dollars");

        System.out.print("Here is " +secondPerson.name+ "'s total monthly premium: $");
        System.out.printf("%.2f", secondPerson.assumeCarYear(adjustedRate) + secondPerson.getRate(monthlyRate));
        System.out.println(" dollars");
    }

}
