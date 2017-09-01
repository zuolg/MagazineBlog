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
		 return home(model);
	}
	
	@RequestMapping("/home.html")
	public String home(Model model) throws Exception {
		return "blog/index";
	}
	

	@RequestMapping("/detail.html")
	public String detail(Model model) throws Exception {
		return "blog/detail";
	}

	@RequestMapping("/article.html")
	public String article(Model model) throws Exception {
		return "blog/article";
	}

	@RequestMapping("/resource.html")
	public String resource(Model model) throws Exception {
		return "blog/resource";
	}

	@RequestMapping("/timeline.html")
	public String timeline(Model model) throws Exception {
		return "blog/timeline";
	}

	@RequestMapping("/about.html")
	public String about(Model model) throws Exception {
		return "blog/about";
	}
 

}
