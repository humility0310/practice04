package prob4;

public class PhoneApp {// 건들 X, 스마트폰 리팩토링

	public static void main(String[] args) {

		Phone phone = new SmartPhone();

		phone.execute("음악");
		phone.execute("통화");
		phone.execute("앱");

	}
}
