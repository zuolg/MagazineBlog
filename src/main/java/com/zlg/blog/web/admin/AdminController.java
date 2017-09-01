package com.zlg.blog.web.admin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * @author ZuoLG
 *
 */
@Controller
public class AdminController {

	@RequestMapping("/admin")
	public String index(Model model) throws Exception {
		return "admin/index";
	}
	
	@RequestMapping("/admin/login")
	public String adminLogin(Model model) throws Exception {

		return "admin/login";
	}
	

	@RequestMapping("/admin/goUrl")
	public String goUrl(String path) throws Exception {
		System.out.println("path:"+path);
		return "admin/"+path;
	}
	
	 

}
