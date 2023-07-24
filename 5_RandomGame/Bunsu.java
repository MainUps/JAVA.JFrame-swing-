package 5_RandomGame;

public class Bunsu {
	private int bunja;
	private int bunmo;
	public Bunsu(int bunja, int bunmo) {
		this.bunja = bunja;
		this.bunmo = bunmo;
	}
	
	
	public String toString() {
		return bunja + "/" + bunmo;
	}
	
	private int gcd(int x, int y) {
		return (y!=0) ? gcd(y, x%y) : x ;
	}
	private void reduce() {
		int d = gcd(bunja, bunmo);
		bunja /= d;
		bunmo /= d;
	}
	
	public Bunsu times(Bunsu bb) {
		Bunsu result = new Bunsu(0, 0);
		result.bunja = this.bunja * bb.bunja;
		result.bunmo = this.bunmo * bb.bunmo;
		result.reduce();
		return result;
	}
	public Bunsu plus(Bunsu bb) {
		Bunsu result = new Bunsu(0, 0);
		result.bunja = (this.bunja * bb.bunmo) + (bb.bunja * this.bunmo);
		result.bunmo = this.bunmo * bb.bunmo;
		result.reduce();
		return result;
	}
	public Bunsu minus(Bunsu bb) {
		Bunsu result = new Bunsu(0, 0);
		result.bunja = (this.bunja * bb.bunmo) - (bb.bunja * this.bunmo);
		result.bunmo = this.bunmo * bb.bunmo;
		result.reduce();
		return result;
	}
	
}
