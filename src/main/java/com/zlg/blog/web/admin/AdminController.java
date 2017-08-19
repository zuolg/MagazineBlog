package com.zlg.blog.web.admin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 
 * @author ZuoLG
 *
 */
@Controller 
public class AdminController {
	
	@RequestMapping("/admin")
	public String index(Model model) throws Exception {
		
		System.out.println("00000000000000000000000000000000");
		
		return "index";
	}
	 
 
}
