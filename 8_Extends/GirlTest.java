package 8_Extends;

public class GirlTest {

	public static void main(String[] args) {
		Girl[] girls = { new Girl("����"), new GoodGirl("����"), new BestGirl("����")  };
		
		for(Girl g : girls)
			System.out.println(g.show());
	}




}
