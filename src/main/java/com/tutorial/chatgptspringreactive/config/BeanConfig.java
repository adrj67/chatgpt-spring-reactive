
package com.tutorial.chatgptspringreactive.config;

import com.tutorial.chatgptspringreactive.service.GPTChatService;
import org.mvnsearch.chatgpt.spring.client.ChatGPTServiceProxyFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//https://www.youtube.com/watch?v=nL-_BYHnoyQ&list=PL4bT56Uw3S4wwT5MJy_Z5ysHKncx-ZK2M&index=4
//8:17

@Configuration
public class BeanConfig {
    
    @Bean
    public GPTChatService gptChatService(ChatGPTServiceProxyFactory proxyFactory) {
        return proxyFactory.createClient(GPTChatService.class);
        
    }
}
