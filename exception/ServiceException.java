package com.syscredit.resource.exception;

/**
 * @包名 ：com.minimaxhk.resourse.exection<br>
 * @文件名 ：ServiceException.java<br>
 * @类描述 ：异常类<br>
 * @作者 ：Gavin<br>
 * @创建时间 ：2015-1-26下午01:32:38<br>
 * @更改人 ：<br>
 * @更改时间 ：<br>
 */
public class ServiceException extends Exception {

	private static final long serialVersionUID = -6148260101182948851L;

	public ServiceException() {
		super();
	}

	/**
	 * @param message
	 * @param cause
	 */
	public ServiceException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * @param message
	 */
	public ServiceException(String message) {
		super(message);
	}

	/**
	 * @param cause
	 */
	public ServiceException(Throwable cause) {
		super(cause);
	}
	
	public Throwable fillInStackTrace() {
		return this;
	}
	
}
