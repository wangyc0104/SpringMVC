package wyc.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * 拦截器的使用
 * @author Yicheng Wang
 */
public class DemoInterceptor implements HandlerInterceptor {

	// 在进入控制器之前执行
	// 如果返回值为false,阻止进入控制器
	// 控制代码
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object obj) throws Exception {
		System.out.println("obj:" + obj);
		System.out.println("preHandle");
		return true;
	}

	// 控制器执行完成,进入到jsp之前执行.
	// 日志记录.
	// 敏感词语过滤
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object obj, ModelAndView mav) throws Exception {
		System.out.println("往" + mav.getViewName() + "跳转");
		System.out.println("model的值" + mav.getModel().get("model"));
		String word = mav.getModel().get("model").toString();
		String newWord = word.replace("祖国", "**");
		mav.getModel().put("model", newWord);
		// mav.getModel().put("model", "修改后的内容");
		System.out.println("postHandle");
	}

	// jsp执行完成后执行
	// 记录执行过程中出现的异常.
	// 可以把异常记录到日志中
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object obj, Exception exception) throws Exception {
		System.out.println("exception:" + exception);
		System.out.println("afterCompletion" + exception.getMessage());
	}

}
