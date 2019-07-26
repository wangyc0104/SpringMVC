package wyc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 测试控制器
 * @author Yicheng Wang
 */
@Controller
public class DemoController {
	
	@RequestMapping("demo")
	public String demo(Model model) {
		System.out.println("执行demo");
		// int i = 5/0;
		model.addAttribute("model", "祖国万岁.");
		return "index.jsp";
	}
	
}
