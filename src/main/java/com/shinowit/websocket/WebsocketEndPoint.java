package com.shinowit.websocket;

import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

/**
 * Created by Administrator on 2015/1/8.
 */
public class WebsocketEndPoint  extends TextWebSocketHandler {

    @Override
    protected void handleTextMessage(WebSocketSession WebSocketSession,
                                     TextMessage message) throws Exception {
        super.handleTextMessage(WebSocketSession, message);
        TextMessage returnMessage = new TextMessage(message.getPayload()+" received at server");
        WebSocketSession.sendMessage(returnMessage);
    }
}
