package com.zlg.blog.web; 
 
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping; 

/**
* Created by ZuoLG on 2017/08/18.
*/
@Controller
public class IndexController { 
	
	@RequestMapping("/")
	public String index(Model model) throws Exception {
		
		System.out.println("00000000000000000000000000000000");
		
		return "blog/index";
	}
  
}
