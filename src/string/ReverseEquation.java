package string;

import java.util.Stack;

public class ReverseEquation {
	public static void main(String[] args) {
		String str = "20-3+5*2";
		StringBuilder sb = new StringBuilder();
		StringBuilder ans = new StringBuilder();
		Stack<String> stk = new Stack<>();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == '*' || ch == '-' || ch == '+' || ch == '/') {
				stk.push(sb.toString());
				stk.push(ch + "");

				sb = sb.delete(0, sb.length());
			} else {
				sb = sb.append(ch + "");
			}
		}
		stk.push(sb + "");
		while (!stk.isEmpty()) {
			ans = ans.append(stk.pop());
		}

		System.out.println(ans);
	}
}
