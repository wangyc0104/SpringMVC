package wyc.controller;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import wyc.pojo.File;
import wyc.pojo.User;
import wyc.service.FileService;

/**
 * 文件上传控制器
 * @author Yicheng Wang
 */
@Controller
public class FileController {

	@Resource
	FileService fileServiceImpl;

	@RequestMapping("showFile")
	public String showFile(Model model) {
		// 从数据库中查出文件列表，作为参数返回页面
		List<File> fileList = fileServiceImpl.showFiles();
		System.out.println(fileList);
		model.addAttribute("fileList", fileList);
		return "main";
	}

	@RequestMapping("downloadFile")
	public void downloadFile(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		String fileName = req.getParameter("fileName");
		User user = (User) req.getSession().getAttribute("user");
		String userName = user.getUsername();
		// 把文件的下载数加一
		fileServiceImpl.addDownloadCounts(userName, id, 1);
		// 把文件输出给浏览器
		resp.setHeader("Content-Disposition", "attachment;filename=" + fileName);
		ServletOutputStream outputStream = resp.getOutputStream();
		java.io.File file = new java.io.File(req.getServletContext().getRealPath("files"), fileName);
		outputStream.write(FileUtils.readFileToByteArray(file));
		outputStream.flush();
		outputStream.close();
	}
	
}
