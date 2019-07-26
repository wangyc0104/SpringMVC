package wyc.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * 过滤器
 * @author Yicheng Wang
 */
public class DemoFilter implements Filter {

	@Override
	public void init(FilterConfig filterconfig) throws ServletException {}

	@Override
	public void doFilter(ServletRequest servletrequest, ServletResponse servletresponse, FilterChain filterchain) throws IOException, ServletException {}

	@Override
	public void destroy() {}

}
