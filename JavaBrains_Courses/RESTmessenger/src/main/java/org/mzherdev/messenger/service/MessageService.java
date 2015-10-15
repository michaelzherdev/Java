package org.mzherdev.messenger.service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mzherdev.messenger.db.DatabaseClass;
import org.mzherdev.messenger.exception.DataNotFoundException;
import org.mzherdev.messenger.model.Message;

public class MessageService {
	
	private Map<Long, Message> messages = DatabaseClass.getMessages();
	
	public MessageService() {
		messages.put(1L, new Message(1, "Hello, world!", "Mike"));
		messages.put(2L, new Message(2, "Hallo, die Welt!", "John"));
	}

	public List<Message> getAllMessages() {
//		Message m1 = new Message(1l, "Hello World!", "Michael");
//		Message m2 = new Message(1l, "Hello World!", "John");
//		List<Message> list = new ArrayList<Message>();
//		list.add(m1);
//		list.add(m2);
//		return list;
		return new ArrayList<Message>(messages.values());
	}
	
	public Message getMessage(long id) {
		Message message = messages.get(id);
		if(message == null) {
			throw new DataNotFoundException("Message with id " + id + " not found");
		}
//		return messages.get(id);
		return message;
	}
	
	public Message addMessage(Message message) {
		message.setId(messages.size()+1);
		messages.put(message.getId(), message);
		return message;
	}
	
	public Message updateMessage(Message message) {
		if(message.getId() <= 0) {
			return null;
		}
		messages.put(message.getId(), message);
		return message;
	}

	public Message removeMessage(long id) {
		return messages.remove(id);
	}
	
	
	public List<Message> getAllMessagesForYear(int year) {
		List<Message> messagesForYear = new ArrayList<Message>();
		Calendar cal = Calendar.getInstance();
		for(Message message : messages.values()) {
			cal.setTime(message.getCreated());
			if(cal.get(Calendar.YEAR) == year) {
				messagesForYear.add(message);
			}
		}
		return messagesForYear;
	}
	
	public List<Message> getAllMessagesPaginated(int start, int size) {
		ArrayList<Message> list = new ArrayList<Message>(messages.values());
		if(start + size > list.size()) 
			return new ArrayList<Message>();
		return list.subList(start, start+size);
	}
}
