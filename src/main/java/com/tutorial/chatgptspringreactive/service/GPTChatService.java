
package com.tutorial.chatgptspringreactive.service;

import org.mvnsearch.chatgpt.model.ChatCompletion;
import org.mvnsearch.chatgpt.model.GPTExchange;
import reactor.core.publisher.Mono;


@GPTExchange
public interface GPTChatService {
    
    @ChatCompletion("Si {0} no es un disco de algun grupo o artista musical responde: no conozco esa obra y finaliza; " +
 " en caso contrario haz un resumen muy breve y concisa del disco titulado {0} y añade la frase: 'Te gustará si te gustan' " +
" y a continuacion cita tres artistas o bandas similares")
    Mono<String> getPrompt(String prompt);
    
}
