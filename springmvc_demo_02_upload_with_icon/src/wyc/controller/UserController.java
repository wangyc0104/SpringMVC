package wyc.controller;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import wyc.pojo.User;
import wyc.service.UserService;

/**
 * 用户操作控制器
 * @author Yicheng Wang
 */
@Controller
public class UserController {

	@Resource
	UserService userServiceImpl;

	@RequestMapping("register")
	public String register(User user, MultipartFile file, HttpServletRequest req) throws IOException {
		String fileName = UUID.randomUUID().toString().replaceAll("-", "") + (file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf(".")));
		String filePath = req.getServletContext().getRealPath("icons");
		FileUtils.copyInputStreamToFile(file.getInputStream(), new File(filePath, fileName));
		System.out.println("fileName: " + fileName);
		System.out.println("filePath: " + filePath);
		user.setIcon(fileName);
		int index = userServiceImpl.register(user);
		System.out.println(index);
		if (index > 0) {
			HttpSession session = req.getSession();
			session.setAttribute("user", user);
			return "redirect:showFile";
		} else {
			return "redirect:/index.jsp";
		}
	}

}
