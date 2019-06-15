package src;


public class Card
{
	public enum Rank 
	{
		S, // 7
		A, // 8 
		N,  // 9
		T,  // 10
		J,  // B
		Q,  // D
		K,  // K
		AS // As
	}

	enum TrafficLight 
	{
		RED,
		GREEN;
	
		@Override
		public String toString() 
		{
			switch(this) 
			{
			case RED: return "abc";
			case GREEN: return "def";
			default: throw new IllegalArgumentException();
			}
		}
	}	

	public enum Suit 
	{
		DIAMONDS, HEARTS, SPADES, CLUBS
	}
	
	@Override
	public String toString()
	{
		return "";
	}
	 
	public void equals()
	{
		
	}
	
	public Rank rank;
	public Suit suit;
	
}