package kz.narxoz.middle02.middle02websocket.config;

import kz.narxoz.middle02.middle02websocket.handler.MyWebSocketHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;

@Configuration
@EnableWebSocket
@RequiredArgsConstructor
public class WebSocketConfig implements WebSocketConfigurer {
    private final MyWebSocketHandler myWebSocketHandler;

    @Override
    public void registerWebSocketHandlers(org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry registry) {
        registry.addHandler(myWebSocketHandler, "/chat").setAllowedOrigins("*");
    }
}
