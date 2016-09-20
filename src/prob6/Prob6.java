package prob6;//오버라이드(베이스, 프로브 건들 x)

public class Prob6 {
	public static void main(String args[]){
		Base base = new MyBase();
		
		base.service("낮");
		base.service("밤");
		base.service("오후");
	}
}
