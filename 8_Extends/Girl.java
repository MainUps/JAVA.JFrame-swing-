package 8_Extends;

class Girl {
	protected String name;
	
	public Girl(String name) {
		this.name = name;
	}
	public String show() {
		return name + "�� " + "�ڹ� �ʺ���";
	}
}

class GoodGirl extends Girl{
	public GoodGirl(String name) {
		super(name);
	}
	public String show() {
		return name + "�� " + "�ڹ� �� ��";
}
}

class BestGirl extends Girl{
	public BestGirl(String name) {
		super(name);
	}
	public String show() {
		return name + "�� " + "�ڹ� ��û �� ��";
}
}