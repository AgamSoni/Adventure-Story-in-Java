/* Agam Soni
 * This program is a narrative story/game in which the user gets to make choices and depending on the choice there are different outcomes.*/

import java.util.Scanner; // import scanner

public class AdventureStoryyyyyyyyyyy { // title, open program
  public static void main(String[] args) {   
    Scanner in = new Scanner(System.in); // scanner in use
    System.out.println("**************************\n|    Welcome to Escape   |\n|                        |\n**************************");   // story intro
    System.out.println("Please enter a Single Word Username for Yourself:");     // information for user
    String name = in.next();  // the scanner saves input
    System.out.println("Loading....");   // story 
    System.out.println("Welcome " + name + " are you ready to escape fear?"); // the user is welcomed with their name
    System.out.println("In this game you can choose to escape a haunted house or a castle. \nTo choose haunted house enter 1 and if you want to choose castle enter 2."); // intro to game and info for user
    int op = in.nextInt(); // scanner will save users input on wether they want option 1 or 2
    if (op==1){ // if statement for option 1
      System.out.println("Welcome to The Devil's Crib"); // user welcomed in option 1
      System.out.println("Come on let's go explore!!!");
      System.out.println("SQUEAKKKK,what was that sound, where did it come from?");
      System.out.println("Enter 1 if you want to go explore it or 2 do move ahead.");
      int s1 = in.nextInt(); // scanner saves user input on wether to follow sound or not
      if(s1==1) { // statement for the optin of going behind sound
        System.out.println("You have walked in the direction where the sound came from and now in front of you are two doors. \nTo explore door 1 enter 1 and if door 2 then 2");
        int d = in.nextInt(); // more user input
        if(d==1){ // if statement depending on user input
          System.out.println("Oh, there are stairs that go down probably to the basement \nLets go downstairs and see where the sound came from.");
          System.out.println("OMG, it's so dark here, lets turn your phone tourch light on. \nOh no your battery's dead.\nWhere can you go where, where, where?\n Sadly, you BLACK OUT. Regret your decision of coming here:(");}
        else if(d==2){ // else if  statement to the d if statement
          System.out.println("Oh, there are stairs that go upstairs \nLets go upstairs and see where the sound came from.");
          System.out.println("It's so dark here and it really smells bad. \n Lets go see what's behind that door?\n Oh its just an old dusty bedroom.\n It feels like no one has came to this house for a long time.");  
          System.out.println("BOOO, what's that? It came from that room, lets go see it.");
          System.out.println("Door open and there's a man sitting on a rooking chair facing the wall.\n Do you want to go ask him what's he doing here or is it his home? \nEnter 1 to go talk to that man or enter 2 to mind your own buisness and get out of here.");
          
        int m = in.nextInt(); // user input on a certain action
          
        if(m==1){ // if statemnt depending on user input
            System.out.println("Who are you?\n Man: Im the DEVIL. \nYou are dead the devil took your soul. YOU LOST");}
       else if(m==2){ // else if statemnt to the if statement
            System.out.println("You turn back and suddenly trip over a crack in the floor and your head cracks open. YOU ARE DEAD:(");}
        else{System.out.println("Invalid code, please start the program again and follow strict instructions.");}}
        else{System.out.println("Invalid code, please start the program again and follow strict instructions.");}}
       else if(s1==2){ // else if statement to the going behind sound or not choice
        System.out.println("You ignored the sound and kept moving ahead in search of exit. BOOOO, you look back no one's there. \nYou get scared and take out your phone tourch, move ahead and see a window.\nYou take the dine-in table chair and break the glass of the window and set yourself free. \nCongratulations you have successfully escaped the Devil's Crib.");}
    else{System.out.println("Invalid code, please start the program again and follow strict instructions.");}} // this statemnt will inform usrr if they have enterd wrong input for the choices
    
    
    
    
    else if(op==2){ // else if statement for the main setting of the story
      System.out.println("Welcome to HELL LOMA \n" + name + " try to escape the castle before morning or be ready to DIE!!!! \nYou are at the highest tower in the castle, you have to find your way throughout. \nYou start to look around the room and find a door, you open it and head down stairs. The stairs are covered with blood, guts and wait is that a skull hanging on the wall with blood gushing out of it."); // user welcome and intro to this scenerio
      System.out.println("You come across two doors. One says *THE WAY TO FREEDOM FOREVER* and the other says *LOOPS TO FREEDOM* \nEnter 1 to go in *THE WAY TO FREEDOM FOREVER* or 2 to go in *LOOPS TO FREEDOM*");
      int cd = in.nextInt(); // system saves users entry
      if(cd==2){  // if statement to users choice
      System.out.println("You have arrived in the prison which is in the basement of the castle. There is blood on the floor and wait do you hear CRYING? \nIts coming from that cell right there. There's no one in this cell where did that sound come from. \nLOOK UP YOU FOOL. Wait who said that? \n When you look up you see a old man's skull. \nThe skull tells you about a door in the cell next to his which everyone used to run away. \nDo you trust him? If yes then enter 1 and if no enter 2.");
      int old = in.nextInt(); // system save input
      if(old==1){ // if statement to the users statement
      System.out.println("You will end up in a mysterious dark room. You will be trapped their and get mad mentaly and will remain there for the rest of your life");}
      else if (old==2){ // else if statement
      System.out.println("You didn't trust him for good and kept moving ahead eventually you will reach the door to FREEDOM. Congratulations you have escaped the HELL LOMA");}
      else{System.out.println("Invalid code, please start the program again and follow strict instructions.");}}
      else if (cd==1){ // else if statement
      System.out.println("You have came out of the castle, but you realize that you are on a island far from main land. There is aboat in site but it has a hole and can drown anytime. You can also swim to the other side but their are some sharks in the water. \nYou might lucky in both cases, so if you want to swim to mainland enter 1 or if you want to use the boat enter 2.");
      int s = in.nextInt(); // system save user input
      if(s==1){ // if statement to user input
      System.out.println("Congratulations,you will reach the other side safely because the sharks were asleep.");}
      else if(s==2){ // else if statement to users prevoius statement
      System.out.println("You're boat was filled up with water, you tried jumping out and save your life but the engine of the boat woke up the sharks and you were served as a LATE NIGHT SNACK:(");}
      else{System.out.println("Invalid code, please start the program again and follow strict instructions.");}} // this statemnt will inform usrr if they have enterd wrong input for the choices
      else{System.out.println("Invalid code, please start the program again and follow strict instructions given.");}} // this statemnt will inform usrr if they have enterd wrong input for the choices
    else{System.out.println("Invalid code, please start the program again and follow strict instructions.");} // this statemnt will inform usrr if they have enterd wrong input for the choices
  } // close function
} // close program






