package prob1;

public class StringUtil {
	public static String concatenate(String[] str) {
		// 문자열을 결합하여 리턴하는 메소드 구현
		// String s = s.concat("456");//추가
		String result = "";
		int strLength = str.length;
		for (int i = 0; i < strLength; i++) {
			result = result.concat(str[i]);
		}
		return result;
	}

}
