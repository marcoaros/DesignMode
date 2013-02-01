package interpreter.Interpreter;


public class MusicalScale{

	public void execute(String content) {

		switch (Integer.valueOf(content)) {
		case 1:
			System.out.print("低音阶 ");
			break;
		case 2:
			System.out.print("中音阶 ");
			break;
		case 3:
			System.out.print("高音阶 ");
			break;
		default:
			System.out.print("无法解释 ");
		}
	}

}
