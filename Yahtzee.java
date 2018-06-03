/*
Author: Horatio Wilson
*/
package yahtzee;

import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class Yahtzee {
    
    // Main handles all of the UI aspects, asking if they want to play again, 
    // displaying the rolls, and getting the number of dice.   
    public static void main(String[] args) {
        YahtzeeGameEngine.rollDiceFirstThrow();
        System.out.println("Select which dice you don't wish to reroll.");
        System.out.println("For example typing: \"1 4 5\" followed by the");
        System.out.println("Enter key will only reroll dice 2 and 3.");
        System.out.println("To keep all dice, simply press Enter");
        System.out.print("Select:     ");
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        String input = scan.nextLine();    // get the entire line after the prompt 
        String[] numbers = input.split(" "); // split by spaces
        //System.out.println(numbers.length);
        
        // Convert strings to integers and add to arraylist.
        if (input.isEmpty()){
            // Give user list of possible out and ask user to choose one.
            // Once a out is chosen
            
            //YahtzeeGameEngine.selectScore();
        }
        else {
            for (int i = 0; i < numbers.length; i++){
                list.add(Integer.parseInt(numbers[i]));              
            }
            YahtzeeGameEngine.selectDice(list);
        }
        
        
        //System.out.println("Hello2");
        System.out.println("Dice selected: " +list);
        
    }
}

// Handles all the game logic.
// First throw => throw all dice.
// After that => throw only dice which were not selected by user.
// After three rolls => Ask player what to store 5 dice as and store in array.
// When the array is filled, the game ends and scores will be evaluated to
// determine the final score. 

// If your method does something that doesn't depend on the individual 
// characteristics of its class, make it static (it will make the program's 
// footprint smaller). Otherwise, it should be non-static.
class YahtzeeGameEngine {
    static int[] diceArray = new int[5];
    static int[] selectedDiceArray = new int[5];    
    static public int[] rollDiceFirstThrow() {
        Random random1 = new Random();
        int answer1 = random1.nextInt(6 - 1 + 1) + 1;
        int answer2 = random1.nextInt(6 - 1 + 1) + 1;
        int answer3 = random1.nextInt(6 - 1 + 1) + 1;
        int answer4 = random1.nextInt(6 - 1 + 1) + 1;
        int answer5 = random1.nextInt(6 - 1 + 1) + 1;
        diceArray[0] = answer1;
        diceArray[1] = answer2;
        diceArray[2] = answer3;
        diceArray[3] = answer4;
        diceArray[4] = answer5;
        System.out.println("First throw:");
        System.out.println(diceArray[0]);
        System.out.println(diceArray[1]);
        System.out.println(diceArray[2]);
        System.out.println(diceArray[3]);
        System.out.println(diceArray[4]);
        return diceArray;
    }
    static public int rerollDice(){
        return 1;
    }
    static public int[] selectDice(ArrayList<Integer> arrayList1) {
        // No dice selected.
        if (arrayList1.isEmpty()) {
            System.out.println("Number of dice selected: " + arrayList1.size());
        }
        // One dice selected.
        else if (arrayList1.size() == 1){
            System.out.println("Number of dice selected: " + arrayList1.size());
        }
        // Two dice selected.
        else if (arrayList1.size() == 2){
            System.out.println("Number of dice selected: " + arrayList1.size());
        }
        // Four dice selected.
        else if (arrayList1.size() == 3){
            System.out.println("Number of dice selected: " + arrayList1.size());
        }
        // Vijf dice selected.
        else if (arrayList1.size() == 4){
            System.out.println("Number of dice selected: " + arrayList1.size());
        }
        // Something went wrong with selection.
        else {
            System.out.println("Something went wrong with selection.");
        }
        return selectedDiceArray;
    }
    public static void selectScore(String scoreChoiceFromUser) {
        String chosenScore = scoreChoiceFromUser;
        int pointsAdded = 0;
        
        System.out.println("You chose: " + chosenScore + " worth: " + pointsAdded);
    }
}