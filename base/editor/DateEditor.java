package com.syscredit.resource.base.editor;

import java.beans.PropertyEditorSupport;

import org.springframework.util.StringUtils;

import com.syscredit.resource.common.utils.DateUtils;



/**
 * @包名 ：com.minimaxhk.resourse.base.editor<br>
 * @文件名 ：DateEditor.java<br>
 * @类描述 ：spring日期绑定转换类<br>
 * @作者 ：Gavin<br>
 * @创建时间 ：2015-1-26下午01:16:49<br>
 * @更改人 ：<br>
 * @更改时间 ：<br>
 */
public class DateEditor extends PropertyEditorSupport{

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		if(!StringUtils.hasText(text)){
			setValue(null);
		}
		else {
			setValue(DateUtils.stringToDate(text, "yyyy-MM-dd"));
		}
	}
	
	@Override
	public String getAsText() {
		return getValue().toString();
	}
	
	
	
}
