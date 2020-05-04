class Card 
{

	String suit;
	int rank;
	String face;

	static int width = 100;
	static int height = 250;


	Card(String suit, int rank){
		this.suit = suit;
		this.rank = rank;
	}

	Card(String suit, String face){
		this.suit = suit;
		this.face = face;
	}

	Card(String face){
		this.face = face;
	}

	void tellcard(){
		if (rank == 0 && suit != null)
			System.out.println(face+" of "+suit);

		else if (rank == 1 && suit != null)
			System.out.println("ACE of "+suit);

		else if (suit != null)
			System.out.println(suit + " " + rank);

		else
			System.out.println("JOKER");
	}

}

