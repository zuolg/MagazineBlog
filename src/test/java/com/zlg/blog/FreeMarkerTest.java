package com.zlg.blog;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
 
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;

import freemarker.template.Template;

public class FreeMarkerTest extends Tester {
	
	@Autowired
	Configuration configuration; //freeMarker configuration  
	  
	@Test 
	public void sendHtmlMailUsingFreeMarker() throws Exception {  
	    Map<String, Object> model = new HashMap<String, Object>();  
	    model.put("time", new Date());  
	    model.put("message", "这是测试的内容。。。");  
	    model.put("toUserName", "张三");  
	    model.put("fromUserName", "老许");  
	     
	}  

}
