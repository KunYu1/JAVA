import java.util.Scanner;
class Hw1_5{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Radius: ");
		int r = input.nextInt();
		System.out.println("Diameter: " + r*2);
		System.out.println("Circumference: " + r*2*Math.PI);
		System.out.println("Area: " + r*r*Math.PI);
	}
}