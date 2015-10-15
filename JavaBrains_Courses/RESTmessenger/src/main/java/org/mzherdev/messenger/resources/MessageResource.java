package org.mzherdev.messenger.resources;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.core.Response.Status;

import org.mzherdev.messenger.model.Link;
import org.mzherdev.messenger.model.Message;
import org.mzherdev.messenger.resources.beans.MessageFilterBean;
import org.mzherdev.messenger.service.MessageService;

@Path("/messages")
public class MessageResource {
	
	MessageService messageService = new MessageService();
	
	@GET //http-method type
//	@Produces(MediaType.TEXT_PLAIN) //  - provides what is return type?
//	@Produces(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_JSON)
	public List<Message> getMessages(@BeanParam MessageFilterBean filterBean
//			 							instead of
//									@QueryParam("year") int year,
//									@QueryParam("start") int start,
//									@QueryParam("size") int size
									) {
//		return "Hello world!";
//		if(year > 0)
//			return messageService.getAllMessagesForYear(year);
//		if(start >= 0 && size > 0)
//			return messageService.getAllMessagesPaginated(start, size);
		if(filterBean.getYear() > 0)
			return messageService.getAllMessagesForYear(filterBean.getYear());
		if(filterBean.getStart() >= 0 && filterBean.getSize() > 0)
			return messageService.getAllMessagesPaginated(filterBean.getStart(), filterBean.getSize());
		return messageService.getAllMessages();
	}
	
//	@POST
//	@Consumes(MediaType.APPLICATION_JSON)
//	@Produces(MediaType.APPLICATION_JSON)
//	public Message addMessage(Message message) {
//		return messageService.addMessage(message);
//	}
	
//	Sending Status Codes and Location Headers
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response addMessage(Message message, @Context UriInfo uriInfo) throws URISyntaxException {
		System.out.println(uriInfo.getAbsolutePath());
		Message newMessage = messageService.addMessage(message);
		String newId = String.valueOf(newMessage.getId());
		URI uri = uriInfo.getAbsolutePathBuilder().path(newId).build();
		return Response.created(uri)//.status(Status.CREATED)
			.entity(newMessage).build();
	}
	
	@PUT
	@Path("/{messageId}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Message updateMessage(@PathParam("messageId") long id, Message message) {
		message.setId(id);
		return messageService.updateMessage(message);
	}
	
	@DELETE
	@Path("/{messageId}")
	@Produces(MediaType.APPLICATION_JSON)
	public void deleteMessage(@PathParam("messageId") long id) {
		messageService.removeMessage(id);
	}
	
	@GET
	@Path("/{messageId}")
//	@Produces(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_JSON)
	public Message getMessage(@PathParam("messageId") long id,
			@Context UriInfo uriInfo) {
		Message message = messageService.getMessage(id);
		message.addLink(getUriForSelf(uriInfo, message), "self");
		message.addLink(getUriForProfile(uriInfo, message), "profile");
		message.addLink(getUriForComments(uriInfo, message), "comments");
		return message;
//		return "Got path param " + messageId;
	}
	
	public String getUriForSelf(UriInfo uriInfo, Message message) {
		String uri = uriInfo.getBaseUriBuilder().path(MessageResource.class)
				.path(Long.toString(message.getId())).build().toString();
		return uri;
	}
	
	public String getUriForProfile(UriInfo uriInfo, Message message) {
		String uri = uriInfo.getBaseUriBuilder().path(ProfileResource.class)
				.path(message.getAuthor()).build().toString();
		return uri;
	}
	
	public String getUriForComments(UriInfo uriInfo, Message message) {
		URI uri = uriInfo.getBaseUriBuilder().path(MessageResource.class)
				.path(MessageResource.class, "getCommentResource")
				.path(CommentResource.class)
				.resolveTemplate("messageId", message.getId()).build();
		return uri.toString();
	}

	@Path("/{messageId}/comments")
	public CommentResource getCommentResource() {
		return new CommentResource();
	}
	
}
