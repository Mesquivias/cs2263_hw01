package edu.isu.cs2263.hw01;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/***
 * Class used to evaluate user equation.
 * @author Michael Esquivias
 */

public class Equation_Evaluation implements Equation_Input {
    Scanner input = new Scanner(System.in);

    /***
     * Asks for user input into terminal and converts input into array of characters.
     * Parses through character array and adds element to one of two arraylists.
     * If the character is a number, it gets added into one array list, operators go into the other.
     * The 'operators' arraylist is parsed and based on the operator, the first two numbers in the 'numbers' list go through the appropriate arithmetic.
     * The result of the first operation is stored into 'tempResult' and used for further arithmetic as the 'numbers' array gets smaller.
     * @return A string showing the user equation plus the final answer.
     */

    public String getEquation() {

        System.out.println("Please type in an equation: ");
        String equation = input.nextLine();

        char[] array = equation.toCharArray();

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        ArrayList<String> operators = new ArrayList<String>();

        for (int i = 0; i < array.length; i++) {
            if (array[i] == '0') {
                numbers.add(0);
            }
            else if (array[i] == '1') {
                numbers.add(1);
            }
            else if (array[i] == '2') {
                numbers.add(2);
            }
            else if (array[i] == '3') {
                numbers.add(3);
            }
            else if (array[i] == '4') {
                numbers.add(4);
            }
            else if (array[i] == '5') {
                numbers.add(5);
            }
            else if (array[i] == '6') {
                numbers.add(6);
            }
            else if (array[i] == '7') {
                numbers.add(7);
            }
            else if (array[i] == '8') {
                numbers.add(8);
            }
            else if (array[i] == '9') {
                numbers.add(9);
            }
            else if (array[i] == '+') {
                operators.add("+");
            }
            else if (array[i] == '-') {
                operators.add("-");
            }
            else if (array[i] == '/') {
                operators.add("/");
            }
            else if (array[i] == '*') {
                operators.add("*");
            }

        }

        int firstIndex = 0;
        float firstNum;
        float secondNum;
        int endResult = 0;
        float tempResult = 0;

        for (var operator : operators) {

            if (operator == "+") {

                if(tempResult != 0) {
                    firstNum = tempResult;

                }

                else {
                    firstNum = numbers.remove(firstIndex);

                }
                secondNum = numbers.remove(firstIndex);
                tempResult = firstNum + secondNum;

            }

            else if (operator == "-") {

                if(tempResult != 0) {
                    firstNum = tempResult;

                }

                else {
                    firstNum = numbers.remove(firstIndex);

                }
                secondNum = numbers.remove(firstIndex);
                tempResult = firstNum - secondNum;
            }

            else if (operator == "/") {

                if(tempResult != 0) {
                    firstNum = tempResult;

                }

                else {
                    firstNum = numbers.remove(firstIndex);

                }
                secondNum = numbers.remove(firstIndex);
                tempResult = firstNum / secondNum;
            }

            else if (operator == "*") {

                if(tempResult != 0) {
                    firstNum = tempResult;

                }

                else {
                    firstNum = numbers.remove(firstIndex);

                }
                secondNum = numbers.remove(firstIndex);
                tempResult = firstNum * secondNum;
            }

            endResult = Math.round(tempResult);

        }

        System.out.println("Here is your equation and answer: ");
        System.out.println();
        return equation + " = " + endResult;
    }

    /***
     * Will go through test.txt and evaluate the given expressions.
     * @throws FileNotFoundException
     */

    public void getEquation2() throws FileNotFoundException {
        Scanner scanner;
        scanner = new Scanner(new File("src/main/java/edu/isu/cs2263/hw01/test.txt"));

        while(scanner.hasNext()) {
            String str = scanner.nextLine();
            char[] array = str.toCharArray();

            ArrayList<Integer> numbers = new ArrayList<Integer>();
            ArrayList<String> operators = new ArrayList<String>();

            for (int i = 0; i < array.length; i++) {
                if (array[i] == '0') {
                    numbers.add(0);
                } else if (array[i] == '1') {
                    numbers.add(1);
                } else if (array[i] == '2') {
                    numbers.add(2);
                } else if (array[i] == '3') {
                    numbers.add(3);
                } else if (array[i] == '4') {
                    numbers.add(4);
                } else if (array[i] == '5') {
                    numbers.add(5);
                } else if (array[i] == '6') {
                    numbers.add(6);
                } else if (array[i] == '7') {
                    numbers.add(7);
                } else if (array[i] == '8') {
                    numbers.add(8);
                } else if (array[i] == '9') {
                    numbers.add(9);
                } else if (array[i] == '+') {
                    operators.add("+");
                } else if (array[i] == '-') {
                    operators.add("-");
                } else if (array[i] == '/') {
                    operators.add("/");
                } else if (array[i] == '*') {
                    operators.add("*");
                }

            }

            int firstIndex = 0;
            float firstNum;
            float secondNum;
            int endResult = 0;
            float tempResult = 0;

            for (var operator : operators) {

                if (operator == "+") {

                    if (tempResult != 0) {
                        firstNum = tempResult;

                    } else {
                        firstNum = numbers.remove(firstIndex);

                    }
                    secondNum = numbers.remove(firstIndex);
                    tempResult = firstNum + secondNum;

                } else if (operator == "-") {

                    if (tempResult != 0) {
                        firstNum = tempResult;

                    } else {
                        firstNum = numbers.remove(firstIndex);

                    }
                    secondNum = numbers.remove(firstIndex);
                    tempResult = firstNum - secondNum;
                } else if (operator == "/") {

                    if (tempResult != 0) {
                        firstNum = tempResult;

                    } else {
                        firstNum = numbers.remove(firstIndex);

                    }
                    secondNum = numbers.remove(firstIndex);
                    tempResult = firstNum / secondNum;
                } else if (operator == "*") {

                    if (tempResult != 0) {
                        firstNum = tempResult;

                    } else {
                        firstNum = numbers.remove(firstIndex);

                    }
                    secondNum = numbers.remove(firstIndex);
                    tempResult = firstNum * secondNum;
                }

                endResult = Math.round(tempResult);

            }

            System.out.println();
            System.out.println("Here is your equation and answer: ");
            System.out.println();
            System.out.println(str + " = " + endResult);
        }

    }

    /***
     * Will prompt user to input equation and then write the result to the console and output.txt
     * @throws IOException
     */

    public void getEquation3() throws IOException {
        boolean end = true;
        PrintWriter out = new PrintWriter("output.txt");

        while(end) {

            System.out.println("Please type in an equation: ");
            String equation = input.nextLine();

            char[] array = equation.toCharArray();

            ArrayList<Integer> numbers = new ArrayList<Integer>();
            ArrayList<String> operators = new ArrayList<String>();

            for (int i = 0; i < array.length; i++) {
                if (array[i] == '0') {
                    numbers.add(0);
                } else if (array[i] == '1') {
                    numbers.add(1);
                } else if (array[i] == '2') {
                    numbers.add(2);
                } else if (array[i] == '3') {
                    numbers.add(3);
                } else if (array[i] == '4') {
                    numbers.add(4);
                } else if (array[i] == '5') {
                    numbers.add(5);
                } else if (array[i] == '6') {
                    numbers.add(6);
                } else if (array[i] == '7') {
                    numbers.add(7);
                } else if (array[i] == '8') {
                    numbers.add(8);
                } else if (array[i] == '9') {
                    numbers.add(9);
                } else if (array[i] == '+') {
                    operators.add("+");
                } else if (array[i] == '-') {
                    operators.add("-");
                } else if (array[i] == '/') {
                    operators.add("/");
                } else if (array[i] == '*') {
                    operators.add("*");
                }

            }

            int firstIndex = 0;
            float firstNum;
            float secondNum;
            int endResult = 0;
            float tempResult = 0;

            for (var operator : operators) {

                if (operator == "+") {

                    if (tempResult != 0) {
                        firstNum = tempResult;

                    } else {
                        firstNum = numbers.remove(firstIndex);

                    }
                    secondNum = numbers.remove(firstIndex);
                    tempResult = firstNum + secondNum;

                } else if (operator == "-") {

                    if (tempResult != 0) {
                        firstNum = tempResult;

                    } else {
                        firstNum = numbers.remove(firstIndex);

                    }
                    secondNum = numbers.remove(firstIndex);
                    tempResult = firstNum - secondNum;
                } else if (operator == "/") {

                    if (tempResult != 0) {
                        firstNum = tempResult;

                    } else {
                        firstNum = numbers.remove(firstIndex);

                    }
                    secondNum = numbers.remove(firstIndex);
                    tempResult = firstNum / secondNum;
                } else if (operator == "*") {

                    if (tempResult != 0) {
                        firstNum = tempResult;

                    } else {
                        firstNum = numbers.remove(firstIndex);

                    }
                    secondNum = numbers.remove(firstIndex);
                    tempResult = firstNum * secondNum;
                }

                endResult = Math.round(tempResult);

            }

            System.out.println();
            System.out.println("Here is your equation and answer: ");
            System.out.println();
            System.out.println(equation + " = " + endResult);

            System.out.println();
            out.println(equation + " = " + endResult);


            Scanner question = new Scanner(System.in);
            System.out.println("Would you like to enter another equation? (1 = Yes) (0 = No) ");
            int answer = question.nextInt();

            if (answer == 1) {
            }

            else if (answer == 0) {
                System.out.println();
                System.out.println("Thank you for using the program!");
                end = false;
            }

            else {
                System.out.println("That is not a valid input.");
                end = false;
            }
        }
        out.close();
    }


}
