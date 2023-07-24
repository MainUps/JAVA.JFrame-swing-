package 8_Extends;

class Girl {
	protected String name;
	
	public Girl(String name) {
		this.name = name;
	}
	public String show() {
		return name + "는 " + "자바 초보야";
	}
}

class GoodGirl extends Girl{
	public GoodGirl(String name) {
		super(name);
	}
	public String show() {
		return name + "는 " + "자바 잘 해";
}
}

class BestGirl extends Girl{
	public BestGirl(String name) {
		super(name);
	}
	public String show() {
		return name + "는 " + "자바 엄청 잘 해";
}
}