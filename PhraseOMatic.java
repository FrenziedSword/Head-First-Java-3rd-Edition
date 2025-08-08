import java.util.*;

public class PhraseOMatic	{
	public static void main(String[] args)	{
		String[] wordListOne = {"I am", "YOu are", "We are", "ShineRay", "Without you", "I'mma", "We'll", "Strong", "I can", "You will", "Persuasive"};
		String[] wordListTwo = {"Intelligent", "Manipulative", "Godly", "Sunshine", "Tantrum creater", "Impenetratable", "Weirdest of weird", "The junkies", "Inevitable", "Bowlers", "Champions", "Cruel"};
		String[] wordListThree = {"In the coffin", "Player of no reason", "Black Panther", "BEnder", "Master of the mist", "Avatar", "The GOat", "Warriors hope", "Ethics thinker", "Without a degree", "Charging forward"};

		int oneLength = wordListOne.length;
		int twoLength = wordListTwo.length;
		int threeLength = wordListThree.length;

		int rand1 = (int) (Math.random() * oneLength);
		int rand2 = (int) (Math.random() * twoLength);
		int rand3 = (int) (Math.random() * threeLength);

		String phrase = wordListOne[rand1]+" "+wordListTwo[rand2]+" "+wordListThree[rand3];
		System.out.println(phrase);
	}
}