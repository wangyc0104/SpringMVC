package wyc.controller;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import wyc.pojo.Demo1;

/**
 * 测试日期转换
 * @author Yicheng Wang
 */
@Controller
public class DemoController {

	/**
	 * 从表单提交的数据会经过日期转换
	 * @param demo
	 * @return
	 */
	@RequestMapping("demo")
	public String demo(@DateTimeFormat(pattern = "yyyy-MM-dd") Date time) {
		System.out.println(time);
		return "/index.jsp";
	}

	/**
	 * 实体类的日期转换
	 * @param demo
	 * @return
	 */
	@RequestMapping("demo1")
	public String demo(Demo1 demo) {
		System.out.println(demo);
		return "/index.jsp";
	}

}
