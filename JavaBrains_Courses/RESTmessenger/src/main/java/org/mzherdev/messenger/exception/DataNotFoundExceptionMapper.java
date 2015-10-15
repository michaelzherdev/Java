package org.mzherdev.messenger.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import org.mzherdev.messenger.model.ErrorMessage;

@Provider
public class DataNotFoundExceptionMapper implements ExceptionMapper<DataNotFoundException>{

	@Override
	public Response toResponse(DataNotFoundException e) {
		ErrorMessage errorMessage = new ErrorMessage(e.getMessage(), 404, "http://javabrains.com");
		return Response.status(Status.NOT_FOUND).build();
	}

	
}
