package com.chat.App.configuration;


import java.util.List;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.converter.MappingJackson2MessageConverter;
import org.springframework.messaging.converter.MessageConverter;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;


//Message broking is a concept of message routing to its right destination
@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer
{

	
	
	@Override
	public void registerStompEndpoints(StompEndpointRegistry registry) {
		
		registry.addEndpoint("/chat")
		.setAllowedOrigins("http://localhost:8080") //security feature to allow only authorize access
		.withSockJS(); //add compatibility for clients who don't use web sockets.
	}

	
	
	@Override
	public void configureMessageBroker(MessageBrokerRegistry registry) {
		//set a message broker
		registry.enableSimpleBroker("/topic");   //eg. /topic/chatroom1
		//expect message with/app/sendmessage
		registry.setApplicationDestinationPrefixes("/app");
	}
	
	
	@Override
    public boolean configureMessageConverters(List<MessageConverter> messageConverters) {
        messageConverters.add(new MappingJackson2MessageConverter());
        return true;
    }
}