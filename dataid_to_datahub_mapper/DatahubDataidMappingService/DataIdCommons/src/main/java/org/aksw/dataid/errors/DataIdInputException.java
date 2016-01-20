package org.aksw.dataid.errors;


public class DataIdInputException extends DataIdServiceException
{
	  public DataIdInputException() { super(); }
	  public DataIdInputException(String message) { super(message); }
	  public DataIdInputException(String message, Throwable cause) { super(message, cause); }
	  public DataIdInputException(Throwable cause) { super(cause); }
}
