package builder;


import builder.builder.Builder;
import builder.builder.impl.BuilderAnotherImpl;
import builder.builder.impl.BuilderImpl;
import builder.director.Directer;

public class Main {

	/**
	 * 建造者模式
	 * 固定情况：每个Builder里面要做哪些动作是设定好的。
	 * 扩展情况：某个Builder中的每步如何操作和操作顺序可以有不同的实现
	 * 例子：模拟按固定顺序画一个小人的不同实现
	 */
	public static void main(String[] args) {

		Builder buider = new BuilderImpl();
		Builder buiderAnotherImpl = new BuilderAnotherImpl();
		
		Directer director = new Directer(buider);
		director.drawPerson();
		
		director = new Directer(buiderAnotherImpl);
		director.drawPerson();
		
//		StringBuffer node = new StringBuffer();
//                StringBuffer nodeBuffer = new StringBuffer();
//                nodeBuffer.append("<node id=\"");
//                nodeBuffer.append(1);
//                nodeBuffer.append("\" ");
//                nodeBuffer.append("isLeaf=\"");
//                nodeBuffer.append(true);
//                nodeBuffer.append("\" ");
//                nodeBuffer.append("isBranch=\"");
//                nodeBuffer.append(false);
//                nodeBuffer.append("\" ");
//                node.append(nodeBuffer);
//                
//                System.out.println(node);
	}
}
