package via.sdj3.websocketspringbootp2pdemo.server;

import org.springframework.stereotype.Component;

import javax.websocket.OnMessage;
import javax.websocket.server.ServerEndpoint;

@Component
@ServerEndpoint("/websocket/chat")
public class ChatServer
{
    //Once a message is received
    @OnMessage
    public String echo(String clientMessage)
    {
        return String.format("New message: %s\n", clientMessage);
    }
}
