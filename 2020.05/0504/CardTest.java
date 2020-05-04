class CardTest
{
	public static void main(String[] args) 
	{
		Card c1 = new Card("HEART", 9);
		Card c2 = new Card("CLUB", 1);
		Card c3 = new Card("SPADE", "QUEEN");
		Card c4 = new Card("DIAMOND", "KING");
		Card c5 = new Card("JOKER");

		c1.tellcard();
		c2.tellcard();
		c3.tellcard();
		c4.tellcard();
		c5.tellcard();

		
	}
}

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