package interpreter;

import interpreter.Interpreter.Interpreter;
import interpreter.context.PlayContext;

import java.io.IOException;

public class Main {

	/**
	 * 解释器模式,当有一个语言需要解释执行，而你可以将该语言的句子表示成一个抽象的语法树时，使用该模式
	 * 固定情况：一个类解释一个规则
	 * 扩展情况：增加新的解释器
	 * 例子：模拟解释音符，音阶
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		PlayContext playContext = new PlayContext();
		String text = "MN 1 MS 3 MN 3";
		playContext.setText(text);
		
		Interpreter interpreter = new Interpreter();
		
		while(playContext.getText().length() >= 3){
			interpreter.interpret(playContext);
		}
		
	}
	

}
