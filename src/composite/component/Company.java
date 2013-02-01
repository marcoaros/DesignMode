package composite.component;


public abstract class Company{

	protected String name = "";
	
	public Company(String name){
		this.name = name;
	}
	
	public abstract void add(Company company);
	
	public abstract void remove(Company company);
	
	public abstract void displayOrganization(int depth);
	
	public abstract void displayDuty();
	
	protected String drawDivisionLine(int depth){
		StringBuffer line = new StringBuffer("");
		
		for (int i = 0; i < depth; i++){
			line = line.append("--"); 
		}
		
		return new String(line);
	}
	
}
