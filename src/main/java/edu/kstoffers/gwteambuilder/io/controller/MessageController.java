package edu.kstoffers.gwteambuilder.io.controller;

import edu.kstoffers.gwteambuilder.io.messages.MessageReceiver;
import edu.kstoffers.gwteambuilder.io.messages.MessageSender;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

@Controller
public class MessageController {

    @MessageMapping("/message")
    @SendTo("/subscribers/group")
    public MessageReceiver message(MessageSender message) {
        return new MessageReceiver(
            HtmlUtils.htmlEscape(message.getUsername())
        );
    }
}
