package flyweight.flyweight;

import flyweight.client.User;

public class WebSite {
	
	public String name;
	
	public WebSite(String name){
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public  void useBy(User user){
		System.out.println(user.getName() + " 使用 " + this.name);
	}

}
