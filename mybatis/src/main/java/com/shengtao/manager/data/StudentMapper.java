package com.shengtao.manager.data;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.shengtao.manager.data.model.StudentEntity;

@Repository
@Transactional
public interface StudentMapper {

	/** �½�ѧ�� */
	public void createStudent(StudentEntity entity);

	/** �޸�ѧ�� ����id ���²�Ϊnull������ */
	public int updateStudentById(StudentEntity entity);

	/** ��ȡѧ�� ������Ϣ ����id */
	public StudentEntity getStudentBaseById(@Param("studentId") String studentId);

	/** ��ȡѧ�� �б� ȫ�� ��ҳ ����*/
	public List<StudentEntity> getStudentBaseAllList(@Param("start") int start, @Param("limit") int limit, @Param("query")String query);
	public int countStudentBaseAllList(@Param("query")String query);

}
