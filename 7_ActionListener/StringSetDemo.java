package 7_ActionListener;
//StringSetDemo.java
public class StringSetDemo {

	public static void main(String[] args) {
		StringSet set1 = new StringSet();
		set1.add("ȣ����");
		set1.add("����");
		set1.add("�⸰");
		set1.add("ȣ����");
		
		StringSet set2 = new StringSet();
		set2.add("ȣ����");
		set2.add("����");
		set2.add("ǥ��");
		
		StringSet set3 = new StringSet();
		set3.add("�⸰");
		set3.add("ȣ����");
		set3.add("����");
		
		System.out.println("set1 : "+ set1);
		System.out.println("set2 : "+ set2);
		System.out.println("set3 : "+ set3);

		System.out.println("set1 vs set 2 : "+ set1.equals(set2));
		System.out.println("set1 vs set 3 : "+ set1.equals(set3));
		System.out.println("set2 vs set 3 : "+ set2.equals(set3));
	
	}

}
