package 7_ActionListener;
//StringSetDemo.java
public class StringSetDemo {

	public static void main(String[] args) {
		StringSet set1 = new StringSet();
		set1.add("호랑이");
		set1.add("사자");
		set1.add("기린");
		set1.add("호랑이");
		
		StringSet set2 = new StringSet();
		set2.add("호랑이");
		set2.add("사자");
		set2.add("표범");
		
		StringSet set3 = new StringSet();
		set3.add("기린");
		set3.add("호랑이");
		set3.add("사자");
		
		System.out.println("set1 : "+ set1);
		System.out.println("set2 : "+ set2);
		System.out.println("set3 : "+ set3);

		System.out.println("set1 vs set 2 : "+ set1.equals(set2));
		System.out.println("set1 vs set 3 : "+ set1.equals(set3));
		System.out.println("set2 vs set 3 : "+ set2.equals(set3));
	
	}

}
