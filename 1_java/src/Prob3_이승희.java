
public class Prob3_이승희 {

	public static void main(String[] args) {

		String sourceString = "everyday we have is one more than we deserve";
		String encodedString = "";

		// 프로그램을 구현부 시작.
		// 참고 : 문자 'a'의 정수값은 97이며, 'z'는 122입니다.

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < sourceString.length(); i++) {

			if (sourceString.charAt(i) >= 'a' && sourceString.charAt(i) <= 'w') {
				sb.append((char) (sourceString.charAt(i) + 3));
				encodedString = sb.toString();
			} else if (sourceString.charAt(i) >= 'x' && sourceString.charAt(i) <= 'z') {
				sb.append((char) (sourceString.charAt(i) - 23));
				encodedString = sb.toString();
			} else {
				sb.append((char) (sourceString.charAt(i)));
				encodedString = sb.toString();
			}
		}
		//2번째 방법
		for(int i=0;i<sourceString.length();i++) {
			char c = sourceString.charAt(i);
			c=c>='a'&&c<='w'?(char)(c+3):
				(c>='x'&&c<='z')?(char)(c-23):c;
				//encodedString+=c;
				sb.append(c);				
		}
		encodedString=sb.toString();
		//c=c>='a'&&c<='z'?(char)('a'+((c-'a')+3)%26):c;
		// 프로그램 구현부 끝.

		System.out.println("암호화할 문자열 : " + sourceString);
		System.out.println("암호화된 문자열 : " + encodedString);

	}
}
