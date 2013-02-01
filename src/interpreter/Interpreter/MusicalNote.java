package interpreter.Interpreter;


public class MusicalNote {

	public void execute(String content) {

		switch(Integer.valueOf(content)){
		case 1:
			System.out.print("哆 ");
			break;
		case 2:
			System.out.print("唻 ");
			break;
		case 3:
			System.out.print("咪 ");
			break;
		case 4:
			System.out.print("发 ");
			break;
		case 6:
			System.out.print("唢 ");
			break;
		case 7:
			System.out.print("啦 ");
			break;
		case 8:
			System.out.print("嘻 ");
			break;
		default:
			System.out.print("无法解释 ");
		}
	}

}
