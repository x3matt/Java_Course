import java.util.Arrays;
import java.util.Comparator;

public class Main {
	
	private static String text ="Hello";
	
    public static void main(String[] args) {
	Comparator<String> c = new Comparator<String>() {
		
		public int compare(String o1, String o2) {
			if(o1.length()>o2.length()) {
				return 1;
			}
			if(o1.length()<o2.length()) {
				return -1;
			}
				return 0;
		}
	  };
	  String[] strings = {"1","22","55555","4444","333"};
	    Arrays.sort(strings,/*new StringComparator()*/c);
	    for(String w:strings) {
	    	System.out.println(w);
	    }
	    String someText = "some text";
	    Person p = new Person() {
	    	@Override
	    	public void sayHello() {
	    		System.out.println(someText);
	    	}
	    };
	    p.sayHello();
	   // Comparator<String> s = new InnerClassDemo.StringByLengthComparator();
	}
    /*public static class StringComparator implements Comparator<String> {


	public int compare(String o1, String o2) {
		if(o1.length()>o2.length()) {
			return 1;
		}
		if(o1.length()<o2.length()) {
			return -1;
		}
		return 0;
	}

}
*/
}
