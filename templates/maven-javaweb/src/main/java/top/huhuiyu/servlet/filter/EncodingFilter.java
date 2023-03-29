package top.huhuiyu.servlet.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(displayName = "EncodingFilter", urlPatterns = "*")
public class EncodingFilter implements Filter {

  private static final String ENCODING_UTF_8 = "UTF-8";

  @Override
  public void destroy() {

  }

  @Override
  public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
    System.out.println(String.format("编码过滤器:%s", ENCODING_UTF_8));
    request.setCharacterEncoding(ENCODING_UTF_8);
    response.setCharacterEncoding(ENCODING_UTF_8);
    chain.doFilter(request, response);
  }

  @Override
  public void init(FilterConfig filterConfig) throws ServletException {
  }

}
