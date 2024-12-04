package com.chat.App.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.chat.App.model.ChatMessage;

@Controller
public class ChatController 
{
	
	@MessageMapping("/sendMessage")  //for clients to send messages to a particular end-point
	@SendTo("/topic/messages")  //Tells to broadcast the output of the sendMessage method
	public ChatMessage sendMessage(ChatMessage message)
	{
		return message;
	}

	
	@GetMapping("/chat")
	public String chat() 
	{
		return "chat";
	}
}
