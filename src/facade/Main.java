package facade;

import facade.client.Student;
import facade.facade.FundOperationOrg;
import facade.facade.impl.FundOperationOrgImpl;

public class Main {

	/**
	 * 外观模式
	 * 固定情况：访问子系统的接口
	 * 扩展情况：每个子系统的实现和子系统的总数目发生变化
	 * 例子：模拟学生请基金组织买股票
	 */
	public static void main(String[] args) {
		
		FundOperationOrg fundOperationOrg = new FundOperationOrgImpl();
		Student student = new Student(fundOperationOrg);
		
		student.fundOperation();
		
	}
}
