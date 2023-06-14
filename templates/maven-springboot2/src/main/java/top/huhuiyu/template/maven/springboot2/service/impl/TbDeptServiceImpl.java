package top.huhuiyu.template.maven.springboot2.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;
import top.huhuiyu.template.maven.springboot2.base.BaseResult;
import top.huhuiyu.template.maven.springboot2.dao.TbDeptMapper;
import top.huhuiyu.template.maven.springboot2.entity.TbDept;
import top.huhuiyu.template.maven.springboot2.service.TbDeptService;

import java.util.List;
import java.util.Optional;

@Service
@Transactional(rollbackFor = Exception.class)
public class TbDeptServiceImpl implements TbDeptService {
  private static final Logger logger = LoggerFactory.getLogger(TbDeptService.class);
  private final TbDeptMapper tbDeptMapper;

  public TbDeptServiceImpl(TbDeptMapper tbDeptMapper) {
    this.tbDeptMapper = tbDeptMapper;
  }

  @Override
  public BaseResult<List<TbDept>> queryAll(TbDept dept) throws Exception {
    BaseResult<List<TbDept>> result = new BaseResult<>();
    TbDept tbDept = Optional.ofNullable(dept).orElse(new TbDept());
    logger.debug("参数：{}", tbDept);
    if (StringUtils.hasText(tbDept.getDeptName())) {
      tbDept.setDeptName(String.format("%%%s%%", tbDept.getDeptName()));
    }
    List<TbDept> list = tbDeptMapper.queryAll(tbDept);
    logger.debug("查询结果：{}", list);
    result.setData(list);
    result.setSuccess(true);
    result.setCode(200);
    return result;
  }
}
