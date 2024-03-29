package wyc.controller;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

/**
 * 文件上传控制器
 * @author Yicheng Wang
 */
@Controller
public class DemoController {
	
	@RequestMapping("upload")
	public String upload(MultipartFile file, String name) throws IOException {
		String fileName = file.getOriginalFilename();
		String suffix = fileName.substring(fileName.lastIndexOf("."));
		// 只上传.png类型的文件
		if (suffix.equalsIgnoreCase(".png")) {
			String uuid = UUID.randomUUID().toString();
			FileUtils.copyInputStreamToFile(file.getInputStream(), new File("E:/" + uuid + suffix));
			return "/index.jsp";
		} else {
			return "/error.jsp";
		}
	}
	
}
