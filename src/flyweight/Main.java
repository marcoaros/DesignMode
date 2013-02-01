package flyweight;

import java.io.IOException;

import flyweight.client.User;
import flyweight.flyweight.WebSite;
import flyweight.flyweightfactory.WebSiteFactory;

public class Main {

	/**
	 * 享元模式，需要生成许多类实例时，如果发现这些实例除了某个参数，其余的基本相同，则把那些参数
	 *          移到实例外面去（作为外部状态），在生成实例的时候再传进来，减少生成实例个数（用时间换空间）
	 * 固定情况：要生成的实例类基本相同，除了一些可以分割除来的外部状态
	 * 扩展情况：暂无
	 * 例子：模拟不同用户登陆网站，这里用户是网站的外部状态
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		WebSiteFactory factory = new WebSiteFactory();
		
		WebSite website1 = factory.getWebSiteCategory("博客");
		website1.useBy(new User("小红"));
		
		WebSite website2 = factory.getWebSiteCategory("新闻");
		website2.useBy(new User("小黑"));
		
		WebSite website3 = factory.getWebSiteCategory("新闻");
		website3.useBy(new User("小黄"));
		
	}

}
