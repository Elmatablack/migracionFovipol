package com.vivsoft.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.mapping.StatementType;

import com.vivsoft.model.Employee;

public interface MyMapper {
	@Select("SELECT 1 from dual")
	public int getUnoFromDual();

	@Select("select 1 id,"+
		     "  t.c_t_nombre name,"+
		     "  round(dbms_random.value(1000, 2800), 2) salary"+
		     " from SAB.S01USR t")
	public List<Employee> getEmployees4();
	
	@Select("{ call SAB.mypackage.my_procedure(#{my_cursor, jdbcType=CURSOR,mode=OUT,javaType=java.sql.ResultSet,resultMap=employeeMap}) }")
	@Options(statementType = StatementType.CALLABLE)
	public Object getEmployees(Map<String,Object> params);
}
