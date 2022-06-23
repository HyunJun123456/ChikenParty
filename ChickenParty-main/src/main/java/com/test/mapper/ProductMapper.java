package com.test.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.test.dto.ProductDto;

@Mapper
public interface ProductMapper {

	@Select(" SELECT USER_PRODUCT.PROKEY, USER_PRODUCT.PROPRICE, " + "USER_PRODUCT.PROCNT, USER_PRODUCT.PRONM "
			+ " FROM USER_PRODUCT INNER JOIN MYUSER " + " ON MYUSER.USERID = USER_PRODUCT.USERID "
			+ " WHERE MYUSER.USERID = #{userId} ORDER BY USER_PRODUCT.PROKEY")
	List<ProductDto> getStoredList(String userId);
	
	@Select("select userid as prokey"
			+ " , max(case when prokey = 'A1' then procnt End) as pronm "
			+ " , max(case when prokey = 'A2' then procnt End) as pronm1 "
			+ " , max(case when prokey = 'A3' then procnt End) as pronm2 "
			+ " , max(case when prokey = 'A4' then procnt End) as pronm3 "
			+ " , max(case when prokey = 'B1' then procnt End) as pronm4 "
			+ " , max(case when prokey = 'B2' then procnt End) as pronm5 "
			+ " , max(case when prokey = 'C1' then procnt End) as pronm6 "
			+ " , max(case when prokey = 'C2' then procnt End) as pronm7 "
			+ " , max(case when prokey = 'D1' then procnt End) as pronm8 "
			+ " from(select * from user_product)p group by userid")
	List<ProductDto> getStoredByUser();
	
}
