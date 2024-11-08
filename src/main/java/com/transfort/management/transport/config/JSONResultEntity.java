package com.transfort.management.transport.config;

import org.springframework.http.HttpStatus;

public class JSONResultEntity<T> {

	private HttpStatus status;
    private String message;
    private Object error;
    private Object errorMessage;
    private Object result;
    private int pageNumber;
    private int pageSize;
    private long totalSize;
   
    public JSONResultEntity(HttpStatus status,String message,Object error,Object result, Object errorMessage) {
    	this.status = status;
    	this.message = message;
    	this.error =error;
    	this.errorMessage=errorMessage;
    	this.result = result;
    }
    
    public JSONResultEntity(HttpStatus status,String message,Object error,Object result, Object errorMessage,int pageNumber,int pageSize,long totalSize) {
    	this.status = status;
    	this.message = message;
    	this.error =error;
    	this.errorMessage=errorMessage;
    	this.result = result;
    	this.pageNumber = pageNumber;
    	this.pageSize = pageSize;
    	this.totalSize = totalSize;
    }
    
	public HttpStatus getStatus() {
		return status;
	}
	public void setStatus(HttpStatus status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Object getError() {
		return error;
	}
	public void setError(Object error) {
		this.error = error;
	}
	public Object getResult() {
		return result;
	}
	public void setResult(Object result) {
		this.result = result;
	}

	public Object getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(Object errorMessage) {
		this.errorMessage = errorMessage;
	}

	public int getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public long getTotalSize() {
		return totalSize;
	}

	public void setTotalSize(long totalSize) {
		this.totalSize = totalSize;
	}
}
