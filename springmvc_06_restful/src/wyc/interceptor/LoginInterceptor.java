package wyc.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * 登录拦截器
 * @author Yicheng Wang
 */
public class LoginInterceptor implements HandlerInterceptor {

	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3) throws Exception {}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3) throws Exception {}

	@Override
	public boolean preHandle(HttpServletRequest req, HttpServletResponse res, Object arg2) throws Exception {
		String uri = req.getRequestURI();
		if (uri.equals("/springmvc_06_restful/login")) {
			return true;
		} else {
			Object obj = req.getSession().getAttribute("users");
			if (obj != null) {
				return true;
			}
			res.sendRedirect("/springmvc_06_restful/login.jsp");
			return false;
		}
	}

}
