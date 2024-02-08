package August;
import java.util.Map;
import java.util.HashMap;
public class UniqueCharacterOfString {
	public static void main(String[] args) {
		String str1="Alive swumal";
		char firstUnique=findFirstUnique(str1);
		System.out.println("First unique character "+ firstUnique);
	}
public static char findFirstUnique(String str) {
		Map<Character, Integer>charFreq=new HashMap<>();	
		for(char c: str.toCharArray()) {
			charFreq.put(c, charFreq.getOrDefault(c, 0)+1);
		}
		for(char c:str.toCharArray()) {
			if(charFreq.get(c)==1) {
				return c;
			}
		}
		return '\0';
	}
}

//String str1 = “Alive swumal”
//Finding the first unique character from a string
