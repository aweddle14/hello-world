import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;


public class goof {
	
	public static void main(String[] args) 
	{
		
		ArrayList<String> PlayerDeck = new ArrayList<String>();
		
		PlayerDeck.add("ace");
		PlayerDeck.add("2");
		PlayerDeck.add("3");
		PlayerDeck.add("4");
		PlayerDeck.add("5");
		PlayerDeck.add("6");
		PlayerDeck.add("7");
		PlayerDeck.add("8");
		PlayerDeck.add("9");
		PlayerDeck.add("10");
		PlayerDeck.add("jack");
		PlayerDeck.add("queen");
		PlayerDeck.add("king");

ArrayList<String> AIDeck = new ArrayList<String>();
		
		AIDeck.add("ace");
		AIDeck.add("2");
		AIDeck.add("3");
		AIDeck.add("4");
		AIDeck.add("5");
		AIDeck.add("6");
		AIDeck.add("7");
		AIDeck.add("8");
		AIDeck.add("9");
		AIDeck.add("10");
		AIDeck.add("jack");
		AIDeck.add("queen");
		AIDeck.add("king");
		
ArrayList<String> Deck = new ArrayList<String>();
		
		Deck.add("ace");
		Deck.add("2");
		Deck.add("3");
		Deck.add("4");
		Deck.add("5");
		Deck.add("6");
		Deck.add("7");
		Deck.add("8");
		Deck.add("9");
		Deck.add("10");
		Deck.add("jack");
		Deck.add("queen");
		Deck.add("king");
		
ArrayList<String> AIwin = new ArrayList<String>();
ArrayList<String> Pwin = new ArrayList<String>();

System.out.println ("Welcome to Goofspiel");
System.out.println ();	

	for(int i = 0; i < 13 ;i++){	


		//Chooses random card from Deck
		
		Random Deckgen = new Random();
		int RandDeck = Deckgen.nextInt(13-i);
		System.out.println ("Deck card is " + (Deck.get(RandDeck)));
		System.out.println ();
		
		
		//Player Turn
	Scanner PInput = new Scanner(System.in);
	System.out.println ("Choose a card to bid from the your deck below to play: ");	
	System.out.println (PlayerDeck);
	String PCard = PInput.next();
    System.out.println("You played: " + PCard);
    int PLocation = PlayerDeck.indexOf (PCard);
	PlayerDeck.remove (PLocation);
	//PlayerDeck.add (PLocation, "_");
	int PcompareValue = 0;
	if (PCard.equals("ace"))
		PcompareValue = 1;
	else if (PCard.equals("2"))
		PcompareValue = 2;
	else if (PCard.equals("3"))
		PcompareValue = 3;
	else if (PCard.equals("4"))
		PcompareValue = 4;
	else if (PCard.equals("5"))
		PcompareValue = 5;
	else if (PCard.equals("6"))
		PcompareValue = 6;
	else if (PCard.equals("7"))
		PcompareValue = 7;
	else if (PCard.equals("8"))
		PcompareValue = 8;
	else if (PCard.equals("9"))
		PcompareValue = 9;
	else if (PCard.equals("10"))
		PcompareValue = 10;
	else if (PCard.equals("jack"))
		PcompareValue = 11;
	else if (PCard.equals("queen"))
		PcompareValue = 12;
	else if (PCard.equals("king"))
		PcompareValue = 13;
	
	//System.out.println (PlayerDeck);

	//Computer Turn (Random Strategy)
	Random AIgen = new Random();
	int RandAI = 0;
	if (i<=6)
		  RandAI = RandDeck;
	if (i>6)
		 RandAI = AIgen.nextInt (13-i);
	String AIplay = AIDeck.get(RandAI);
	System.out.println ("Your oppenent played: " + AIplay);
	AIDeck.remove (RandAI);
	
	int AIcompareValue = 0;
	if (AIplay.equals("ace"))
		AIcompareValue = 1;
	else if (AIplay.equals("2"))
		AIcompareValue = 2;
	else if (AIplay.equals("3"))
		AIcompareValue = 3;
	else if (AIplay.equals("4"))
		AIcompareValue = 4;
	else if (AIplay.equals("5"))
		AIcompareValue = 5;
	else if (AIplay.equals("6"))
		AIcompareValue = 6;
	else if (AIplay.equals("7"))
		AIcompareValue = 7;
	else if (AIplay.equals("8"))
		AIcompareValue = 8;
	else if (AIplay.equals("9"))
		AIcompareValue = 9;
	else if (AIplay.equals("10"))
		AIcompareValue = 10;
	else if (AIplay.equals("jack"))
		AIcompareValue = 11;
	else if (AIplay.equals("queen"))
		AIcompareValue = 12;
	else if (AIplay.equals("king"))
		AIcompareValue = 13;
	
	
	//Hand Win Scenarios
	if (AIcompareValue > PcompareValue)
	{System.out.println ("Computer wins this hand.");
		AIwin.add (Deck.get(RandDeck));}
		 //removes randomly chosen Deck card
	
	if (PcompareValue > AIcompareValue){
			System.out.println ("You win this hand.");
			Pwin.add (Deck.get(RandDeck));}

	if (AIcompareValue == PcompareValue) 
		System.out.println ("This hand is a tie. Deck card is discarded.");
	//removed used card from deck
	Deck.remove (RandDeck);
System.out.println ();
System.out.println ("----------------------------------------------------------------");

	}
	// Tallying up the scores
	int Pscore = 0;
	int AIscore = 0;
	
	for(int index = 0; index < Pwin.size(); index++){
		if(Pwin.get(index).equals("ace"))
			Pscore += 1;
		if(Pwin.get(index).equals("2"))
			Pscore += 2;
		if(Pwin.get(index).equals("3"))
			Pscore += 3;
		if(Pwin.get(index).equals("4"))
			Pscore += 4;
		if(Pwin.get(index).equals("5"))
			Pscore += 5;
		if(Pwin.get(index).equals("6"))
			Pscore += 6;
		if(Pwin.get(index).equals("7"))
			Pscore += 7;
		if(Pwin.get(index).equals("8"))
			Pscore += 8;
		if(Pwin.get(index).equals("9"))
			Pscore += 9;
		if(Pwin.get(index).equals("10"))
			Pscore += 10;
		if(Pwin.get(index).equals("jack"))
			Pscore += 11;
		if(Pwin.get(index).equals("queen"))
			Pscore += 12;
		if(Pwin.get(index).equals("king"))
			Pscore += 13;
	}
	
	for(int index = 0; index < AIwin.size(); index++){
		if(AIwin.get(index).equals("ace"))
			AIscore += 1;
		if(AIwin.get(index).equals("2"))
			AIscore += 2;
		if(AIwin.get(index).equals("3"))
			AIscore += 3;
		if(AIwin.get(index).equals("4"))
			AIscore += 4;
		if(AIwin.get(index).equals("5"))
			AIscore += 5;
		if(AIwin.get(index).equals("6"))
			AIscore += 6;
		if(AIwin.get(index).equals("7"))
			AIscore += 7;
		if(AIwin.get(index).equals("8"))
			AIscore += 8;
		if(AIwin.get(index).equals("9"))
			AIscore += 9;
		if(AIwin.get(index).equals("10"))
			AIscore += 10;
		if(AIwin.get(index).equals("jack"))
			AIscore += 11;
		if(AIwin.get(index).equals("queen"))
			AIscore += 12;
		if(AIwin.get(index).equals("king"))
			AIscore += 13;
	}
	//Printing the scores
	System.out.println("The AI's score is: " + AIscore);
	System.out.println("Your score is: " + Pscore);
	//Comparing the scores
	if (AIscore > Pscore)
		System.out.println("You lose");
	
	if (Pscore > AIscore)
		System.out.println("You win");
	
	if (Pscore == AIscore)
		System.out.println("It is a tie");
	}

}
