/*
 * The program obtains list of directions from the user,
 * It also allows to undo the last pribted direction
 * 
 */
package undofunction;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author CPP_Curriculum
 */
public class UndoFunction {
    private static Scanner in = new Scanner(System.in);
    private static String input;
    private static Stack<String> directionsList = new Stack();
 
    public static void main(String[] args) {
        //obtaining user input
        while (true){
            System.out.println("Press D to enter new direction, U to cancel last entry and E to quit the program");
            input = in.nextLine();
            if (input.equals("D")){
                getDirection();

            }
            else if (input.equals("U")){
                undoDirection();
            }
            else if (input.equals("E")){
                System.out.println("Bye...");
                System.exit(0);
            }
            else{
                System.out.println("The command is not recognised");
            }            
        }
    }
    
    //this method removes last element from the stack with list of directions 
    //if the stack is not empty
    public static void undoDirection(){
        if (directionsList.isEmpty()){
            System.out.println("The list of directions is empty.");
        }
        else{
            System.out.println(directionsList.peek() + " has been removed from the directions list");
            directionsList.pop();
            displayDirections();            
        }
    }
    //this method adds an element to the stack with list of directions 
    public static void getDirection(){
        System.out.println("Type in the direction\n");
        input = in.nextLine();
        directionsList.push(input);  
        displayDirections();
    }  
    //displays all the elements in the direction list
    public static void displayDirections(){
        System.out.println("LIST OF DIRECTIONS: ");
        for (String s: directionsList){
            System.out.println(s);
        }
    }   
}
