package August;
import java.util.HashSet;
import java.util.Set;
public class Fragment1 {

	public static void main(String[] args) {
		String s1=new String("ABC");
		String s2=new String("ABC");
		
		Set<String> s=new HashSet<>();
		s.add(s1);
		s.add(s2);
		System.out.println(s.size());

	}

}
