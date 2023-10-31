/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tutorial.chatgptspringreactive.controller;

import com.tutorial.chatgptspringreactive.dto.MessageDto;
import com.tutorial.chatgptspringreactive.service.GPTChatService;
import org.mvnsearch.chatgpt.spring.service.ChatGPTService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@CrossOrigin
public class ChatController {
    
    @Autowired
    private ChatGPTService chatGPTService;
    
    @Autowired
    private GPTChatService gptChatService;
    
    @PostMapping("/chat")
    public Mono<MessageDto> chat (@RequestBody String prompt) {
        return gptChatService.getPrompt(prompt).map(r -> new MessageDto(r));
    }
    
    
    
}
