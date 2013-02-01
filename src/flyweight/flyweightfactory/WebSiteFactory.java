package flyweight.flyweightfactory;

import java.util.HashMap;
import java.util.Map;

import flyweight.flyweight.WebSite;

public class WebSiteFactory {
	
	Map<String,WebSite> webSiteMap = new HashMap<String,WebSite>();
	
	public WebSite getWebSiteCategory(String webSiteName){
		if(webSiteMap.containsKey(webSiteName)){
			return webSiteMap.get(webSiteName);
		}else{
			WebSite webSite =  new WebSite(webSiteName);
			webSiteMap.put(webSiteName, webSite);
			return webSite;
		}
	}

}
