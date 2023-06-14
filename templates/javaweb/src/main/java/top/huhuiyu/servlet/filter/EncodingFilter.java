package top.huhuiyu.servlet.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter(displayName = "EncodingFilter", urlPatterns = "*")
public class EncodingFilter implements Filter {

  private static Logger logger = LoggerFactory.getLogger(EncodingFilter.class);
  private static final String ENCODING_UTF_8 = "UTF-8";

  @Override
  public void destroy() {
  }

  @Override
  public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
    logger.debug("编码过滤器:{}", ENCODING_UTF_8);
    HttpServletRequest req = (HttpServletRequest) request;
    HttpServletResponse resp = (HttpServletResponse) response;
    // 处理编码
    req.setCharacterEncoding(ENCODING_UTF_8);
    resp.setCharacterEncoding(ENCODING_UTF_8);
    // 处理跨越
    resp.setHeader("Access-Control-Allow-Origin", "*");
    resp.setHeader("Access-Control-Allow-Methods", "*");
    resp.setHeader("Access-Control-Allow-Headers", "*");
    resp.setHeader("Access-Control-Expose-Headers", "*");
    chain.doFilter(request, response);
  }

  @Override
  public void init(FilterConfig filterConfig) throws ServletException {
  }

}
