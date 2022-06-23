package com.test.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.test.dto.OrderDto;

@Mapper
public interface OrderMapper {
	
	@Insert(" INSERT INTO ORDERS VALUES(#{userId}, #{proKey}, #{proCnt}, #{userNm}) ")
	int getOrder(OrderDto dto);
	
	@Select("select usernm as usernm"
			+ " , max(case when prokey = 'A1' then procnt End) as pronm "
			+ " , max(case when prokey = 'A2' then procnt End) as pronm1 "
			+ " , max(case when prokey = 'A3' then procnt End) as pronm2 "
			+ " , max(case when prokey = 'A4' then procnt End) as pronm3 "
			+ " , max(case when prokey = 'B1' then procnt End) as pronm4 "
			+ " , max(case when prokey = 'B2' then procnt End) as pronm5 "
			+ " , max(case when prokey = 'C1' then procnt End) as pronm6 "
			+ " , max(case when prokey = 'C2' then procnt End) as pronm7 "
			+ " , max(case when prokey = 'D1' then procnt End) as pronm8 "
			+ " from(select * from orders)o group by usernm")
	List<OrderDto> OrderInfo();
 
}
