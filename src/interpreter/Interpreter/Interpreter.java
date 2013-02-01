package interpreter.Interpreter;

import interpreter.context.PlayContext;

public class Interpreter {
	
	protected String type;
	protected String content;
	
	private MusicalNote musicalNote = new MusicalNote();
	private MusicalScale musicalScale = new MusicalScale();
	
	/*
	 * 一次处理两个单元，第一个单元标识种类，第二个单元标识内容
	 */
	public void interpret(PlayContext playContext){
		
		String text = playContext.getText();
		String[] uint = text.split(" ");
		
		
		
		if(uint.length > 2){
			 type = uint[0];
			 content = uint[1];
			
			 //去掉最前两个单元
			text = text.substring(5);
			playContext.setText(text);
			
			if(type.equals("MN")){
				musicalNote.execute(content);
			}else if(type.equals("MS")){
				musicalScale.execute(content);
			}
			
		}else if(uint.length == 2){
			
			type = uint[0];
			content = uint[1];
			 
			playContext.setText("");
			
			if(type.equals("MN")){
				musicalNote.execute(content);
			}else if(type.equals("MS")){
				musicalScale.execute(content);
			}
		}else if(uint.length == 1){
			System.out.println("最后一个单元没有进行解释");
		}else{
			System.out.println("解释成功");
		}
	}
	
}
