package wyc.controller;

import java.io.File;
import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import wyc.pojo.Users;
import wyc.service.FilesService;

/**
 * 文件下载控制器
 * @author Yicheng Wang
 */
@Controller
public class FilesController {
	
	@Resource
	private FilesService filesServiceImpl;

	@RequestMapping("show")
	public String show(Model model) {
		model.addAttribute("list", filesServiceImpl.show());
		return "/main.jsp";
	}

	@RequestMapping("download")
	public void download(int id, String name, HttpServletResponse res, HttpServletRequest req) throws IOException {
		filesServiceImpl.updCount(id, (Users) req.getSession().getAttribute("user"), name);
		res.setHeader("Content-Disposition", "attachment;filename=" + name);
		ServletOutputStream os = res.getOutputStream();
		File file = new File(req.getServletContext().getRealPath("files"), name);
		os.write(FileUtils.readFileToByteArray(file));
		os.flush();
		os.close();
	}
	
}
