package August;
public class FindLargestWordOfString {
	public static void main(String[] args) {	
		String s="this is the test to check the logically";
		String[] words=s.split("");
		String LargestWords="";
		for(String word:words) {
			if(word.length()>LargestWords.length()) {
				LargestWords=word;
			}
		}
		System.out.println("Largest Word : "+LargestWords);	
		int[] charCount=new int[256];
		for(char c : s.toCharArray()) {
			if(c != ' ') {
				charCount[c]++;
			}
		}
		for(int i=0; i<charCount.length; i++) {
			if(charCount[i]>1) {
		System.out.println("Character '" + (char)i + "' repeats " + charCount[i] + " times");
			}		
		}
	}
}
