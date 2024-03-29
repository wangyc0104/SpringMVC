package wyc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 加上@Controller这个小可爱，就不用繁琐地在springmvc.xml中配置控制器啦！
 * @author Yicheng Wang
 */
@Controller
public class DemoController {
	
	@RequestMapping("demo")
	public String demo() {
		System.out.println("执行demo");
		return "main.jsp";
	}

	@RequestMapping("demo2")
	public String demo2() {
		System.out.println("demo2");
		return "main1.jsp";
	}
	
}
