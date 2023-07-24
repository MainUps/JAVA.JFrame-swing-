package 5_RandomGame;

import java.util.Scanner;

public class GawiBawiBo {
	private int compsMove, yourMove;
	
public void playGame() {
	Scanner input = new Scanner(System.in);
	do {
		compsMove = (int) (Math.random() * 3);
		yourMove = -1;
		while(yourMove < 0 || yourMove > 2) {
			System.out.println("0:����, 1:����, 2:��");
			yourMove = input.nextInt();
		}
	} while (!findWinner());
}
private boolean findWinner() {
	if(compsMove == yourMove) {
		System.out.println("you=" + getMoveStr(yourMove) + ", com=" + getMoveStr(compsMove) + ": �����ϴ�. �ٽ� �Է��ϼ���!");
		return false;
	}
	else if((compsMove+1) % 3 == yourMove) {
		System.out.println("you=" + getMoveStr(yourMove) + ", com=" + getMoveStr(compsMove) + ": ���ϰ� �̰���ϴ�!!");
		return true;
	}
	else {
		System.out.println("you=" + getMoveStr(yourMove) + ", com=" + getMoveStr(compsMove) + ": ���ϰ� �����ϴ�!!");
		return true;
	}
}
private String getMoveStr(int move) {
	if(move == 0) return "����";
	else if (move == 1) return "����";
	else return "��";
}
	
	public static void main(String[] args) {
		GawiBawiBo game = new GawiBawiBo();
		game.playGame();
	}

}
