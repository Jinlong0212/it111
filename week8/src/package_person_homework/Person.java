package package_person_homework;

public class Person {
    String name;
    int age;
    int carYear;
    boolean violations;
    double creditScore;

    public void display() {

        System.out.println("Customer name: "+ name);
        System.out.println("Age: "+ age);
        System.out.println("Car Year: "+ carYear);
        System.out.println("Violations: "+ violations);
        System.out.println("Credit Score: "+ creditScore);

    }

    public double getRate (double monthlyRate) {
        if(violations == true  && creditScore <= 700) {
            monthlyRate = 550;

        } else {
            monthlyRate = 150;

        }
        return monthlyRate;

    }

    public double assumeCarYear(double adjustedRate) {
        if(carYear <= 2025 && carYear >= 2023) {
            adjustedRate = 250;
        } else {
            adjustedRate = 0;
        }
        return  adjustedRate;
    }

}
