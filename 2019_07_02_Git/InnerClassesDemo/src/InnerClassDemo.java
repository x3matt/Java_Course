import java.util.Comparator;

public class InnerClassDemo {
	private static String someField;
	public InnerClassDemo(String someField) {
		this.someField=someField;
	}
    public static void main(String[] args) {
    	StringByLengthComparator tmp = new StringByLengthComparator();
    	SomeClass s = new SomeClass("value");
    	System.out.println(s.getValue());
    	s.doSomething();
    	
    	InnerClassDemo m = new InnerClassDemo("some text");
    	m.innerClassMethod();
    	
    	s.printSomeValue();
    }
    public void innerClassMethod() {
    	SomeClass s = new SomeClass("text");
    	System.out.println(s.value);
    }
    private static class StringByLengthComparator implements Comparator<String>{

	@Override
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
    private static class SomeClass implements Doable{
    	private String value;
    	public SomeClass(String value) {
    		this.value=value;
    	}
    	public String getValue() {
    		return value;
    	}
		@Override
		public void doSomething() {
			System.out.println("*doing something*");
		}
		public void printSomeValue() {
			System.out.println(someField);
		}
    }
    public static interface Doable{
    	void doSomething();
    }
}
