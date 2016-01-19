
package com.syscredit.resource.base;

import java.sql.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

import com.syscredit.resource.base.editor.DateEditor;
import com.syscredit.resource.base.editor.DoubleEditor;
import com.syscredit.resource.base.editor.IntegerEditor;
import com.syscredit.resource.base.editor.LongEditor;

/**
 * @包名 ：com.minimaxhk.resourse.base<br>
 * @文件名 ：BaseController.java<br>
 * @类描述 ：Controller超类<br>
 * @作者 ：Gavin<br>
 * @创建时间 ：2015-1-26下午01:54:28<br>
 * @更改人 ：<br>
 * @更改时间 ：<br>
 */
public abstract class BaseController {

	@InitBinder
	protected void initBinder(HttpServletRequest request,
				ServletRequestDataBinder binder){
		binder.registerCustomEditor(Date.class, new DateEditor());
		binder.registerCustomEditor(Double.class, new DoubleEditor());
		binder.registerCustomEditor(int.class, new IntegerEditor());
		binder.registerCustomEditor(long.class, new LongEditor());
	}
	
	
	
	
}
