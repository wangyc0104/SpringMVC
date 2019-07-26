package wyc.controller;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 文件下载控制器
 * @author Yicheng Wang
 */
@Controller
public class DemoController {
	
	@RequestMapping("download")
	public void download(String fileName, HttpServletResponse res, HttpServletRequest req) throws IOException {
		// 设置Content-Disposition响应头
		res.setHeader("Content-Disposition", "attachment;filename=" + fileName);
		// 把二进制流放入到响应体中.
		ServletOutputStream os = res.getOutputStream();
		String path = req.getServletContext().getRealPath("files");
		System.out.println(path);
		File file = new File(path, fileName);
		byte[] bytes = FileUtils.readFileToByteArray(file);
		os.write(bytes);
		os.flush();
		os.close();
	}
	
}
