/*
 * Adds two given integers and prints the result in a fancy way.
 */
public class AddTwo {
	public static void main(String[] args) {
		if (args.length == 2) {
					try {
						
						int num1 = Integer.parseInt(args[0]);
						int num2 = Integer.parseInt(args[1]);
		
						
						int sum = num1 + num2;
		
						
						System.out.println(num1 + " + " + num2 + " = " + sum);
					} catch (NumberFormatException e) {
						System.out.println("Error: Please provide valid integers as command-line arguments.");
					}
				} else {
					System.out.println("Error: Please provide exactly two integers as command-line arguments.");
				}
			}
		}
	