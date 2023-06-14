package top.huhuiyu.template.maven.springboot2.test;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import top.huhuiyu.template.maven.springboot2.dao.TbDeptMapper;
import top.huhuiyu.template.maven.springboot2.entity.TbDept;

import java.util.List;

@SpringBootTest
public class TestTbDeptDAO {
  private static Logger logger = LoggerFactory.getLogger(TestTbDeptDAO.class);
  @Autowired
  private TbDeptMapper tbDeptMapper;

  @Test
  public void query() throws Exception {
    TbDept dept = new TbDept();
    List<TbDept> list = tbDeptMapper.queryAll(dept);
    logger.info("查询结果：{}", list);
    dept.setDeptName(String.format("%%%s%%", "人"));
    list = tbDeptMapper.queryAll(dept);
    logger.info("参数查询结果：{}", list);
  }
}
