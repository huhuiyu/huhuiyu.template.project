package top.huhuiyu.template.maven.springboot2.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.huhuiyu.template.maven.springboot2.base.BaseResult;
import top.huhuiyu.template.maven.springboot2.entity.TbDept;
import top.huhuiyu.template.maven.springboot2.service.TbDeptService;

import java.util.List;

@RestController
@RequestMapping("/dept")
public class TbDeptController {
  private final TbDeptService tbDeptService;

  public TbDeptController(TbDeptService tbDeptService) {
    this.tbDeptService = tbDeptService;
  }

  @PostMapping("/queryAll")
  public BaseResult<List<TbDept>> queryAll(TbDept dept) throws Exception {
    return tbDeptService.queryAll(dept);
  }
}
