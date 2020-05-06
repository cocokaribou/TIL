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

		//class variables (static)
		//doesn't need any class instances

		System.out.println("The width of the card is "+Card.width+" and the height is "+Card.height);
	}
}