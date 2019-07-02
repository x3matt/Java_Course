import java.util.function.Function;
import java.util.function.Predicate;
public class Main  {
	public static void main(String[] args) {
	    
		Predicate<String> p1 = (input) -> input.length()==3;
		Predicate<String> p2 = (input) -> input.length()==4;
		Predicate<String> p3 = (input) -> input.length()==5;
		
		Function<String,String> f1 = (input) -> input.toUpperCase();
		Function<String,String> f2 = (input) -> input.toLowerCase();
		Function<String,String> f3 = (input) -> "*****";
		
		System.out.println(transformer("aaa bbbb ccccc", p1, f3));
		System.out.println(transformer("aaa bbbb ccccc", p2, f1));
		System.out.println(transformer("aaa bbbb CCCCC", p3, f2));
		
	}
	
	public static String transformer(String input ,Predicate<String> c,Function<String,String> f){
		String[] words = input.split(" ");
		for (int i = 0; i < words.length; i++) {
			if(c.test(words[i])) {
				words[i] = f.apply(words[i]);
			}
		 }
		return String.join(" ", words);
     	}
}