package com.shengtao.manager.data;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.shengtao.manager.data.model.StudentEntity;

@Repository
@Transactional
public interface StudentMapper {

	/** 新建学生 */
	public void createStudent(StudentEntity entity);

	/** 修改学生 根据id 更新不为null的属性 */
	public int updateStudentById(StudentEntity entity);

	/** 获取学生 基本信息 根据id */
	public StudentEntity getStudentBaseById(@Param("studentId") String studentId);

	/** 获取学生 列表 全部 分页 过滤*/
	public List<StudentEntity> getStudentBaseAllList(@Param("start") int start, @Param("limit") int limit, @Param("query")String query);
	public int countStudentBaseAllList(@Param("query")String query);

}
