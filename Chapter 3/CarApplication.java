import java.util.Scanner;

public class CarApplication{

	public static void main(String[]args){

	Car car1 = new Car("Honda",1000,"2020");
	Car car2 = new Car("Toyota",500,"2019");


	double car1Price = car1.getPrice();
	double car2Price = car2.getPrice();

	double discount1 = car1Price * 0.05;
	double discount2 = car2Price * 0.07;

	System.out.printf("The discount price on the first car is %.2f%n",car1Price - discount1);
	System.out.printf("The discount price on the second car is %.2f",car2Price -discount2);									



}
}