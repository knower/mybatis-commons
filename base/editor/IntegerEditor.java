package com.syscredit.resource.base.editor;

import java.beans.PropertyEditorSupport;

import org.springframework.util.StringUtils;

/**
 * @包名 ：com.minimaxhk.resourse.base.editor<br>
 * @文件名 ：IntegerEditor.java<br>
 * @类描述 ：Integer转化类<br>
 * @作者 ：Gavin<br>
 * @创建时间 ：2015-1-26下午02:04:54<br>
 * @更改人 ：<br>
 * @更改时间 ：<br>
 */
public class IntegerEditor extends PropertyEditorSupport {

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		if(text == null || text.equals("")){
			text = "0";
		}
		if(!StringUtils.hasText(text)){
			setValue(null);
		}
		else{
			setValue(Integer.parseInt(text));
		}
	}
	
	@Override
	public String getAsText() {
		return getValue().toString();
	}
}
