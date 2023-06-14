package top.huhuiyu.template.maven.springboot2.dao;

import org.apache.ibatis.annotations.Mapper;
import top.huhuiyu.template.maven.springboot2.entity.TbDept;

import java.util.List;

@Mapper
public interface TbDeptMapper {
  List<TbDept> queryAll(TbDept dept) throws Exception;
}
