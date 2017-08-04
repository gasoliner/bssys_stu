package cn.bssys_stu.mapper;

import cn.bssys_stu.po.BsStudent;
import cn.bssys_stu.po.BsStudentExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BsStudentMapper {
    long countByExample(BsStudentExample example);

    int deleteByExample(BsStudentExample example);

    int deleteByPrimaryKey(Integer sid);

    int insert(BsStudent record);

    int insertSelective(BsStudent record);

    List<BsStudent> selectByExample(BsStudentExample example);

    BsStudent selectByPrimaryKey(Integer sid);

    int updateByExampleSelective(@Param("record") BsStudent record, @Param("example") BsStudentExample example);

    int updateByExample(@Param("record") BsStudent record, @Param("example") BsStudentExample example);

    int updateByPrimaryKeySelective(BsStudent record);

    int updateByPrimaryKey(BsStudent record);
}