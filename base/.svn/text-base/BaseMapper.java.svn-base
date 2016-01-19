package com.syscredit.resource.base;

import java.io.Serializable;
import java.util.List;

/**
 * @包名 ：com.minimaxhk.resourse.base<br>
 * @文件名 ：BaseMapper.java<br>
 * @类描述 ：mapper超类<br>
 * @作者 ：Gavin<br>
 * @创建时间 ：2015-1-26下午02:51:36<br>
 * @更改人 ：<br>
 * @更改时间 ：<br>
 */
public interface BaseMapper<T extends BaseBean,PK extends Serializable> {

	PK insert(T model);
	
	void update(T model);
	
	T selectByPrimaryKey(T key);
	
	T selectById(String byId);
	
	List<T> findAll();
	
	int updateByPrimaryKey(T t);
	
	
	
}
