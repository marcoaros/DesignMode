package composite;

import composite.component.impl.leaf.FinanceDepartment;
import composite.component.impl.leaf.HRDepartment;
import composite.component.impl.root.CompanyRoot;


public class Main {

	/**
	 * 组合模式，将对象组合成树形结构以表示“部分-整体”的层次结构，组合模式使得用户对单个对象和组合对象的使用具有一致性
	 * 固定情况：树节点对象和树叶子对象有一致的接口
	 * 扩展情况：可以随意的组合各个节点与叶子的上下关系
	 * 例子：大公司的组织结构
	 */
	public static void main(String[] args) {
		
		System.out.println("***********************" + "公司机构组织" + "***********************");
		CompanyRoot headquarters = new CompanyRoot("公司总部");
		headquarters.add(new HRDepartment("公司人力资源总部"));
		headquarters.add(new FinanceDepartment("公司财务总部"));
		
		
		CompanyRoot subcompanyA = new CompanyRoot("公司成都子公司");
		subcompanyA.add(new HRDepartment("人力资源部"));
		subcompanyA.add(new FinanceDepartment("财务部"));
		
		headquarters.add(subcompanyA);
		
		CompanyRoot subcompanyB = new CompanyRoot("公司北京子公司");
		subcompanyB.add(new HRDepartment("人力资源部"));
		subcompanyB.add(new FinanceDepartment("财务部"));
		
		headquarters.add(subcompanyB);
		
		//展示整棵树
		headquarters.displayOrganization(1);
		System.out.println("***********************" + "公司职责分配" + "***********************");
		headquarters.displayDuty();
		
		//展示某个子树
		subcompanyA.displayOrganization(1);
	}

}
