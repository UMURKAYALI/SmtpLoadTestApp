package org.umur.messagesend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.umur.messagesend.service.MessageService;
import org.umur.messagesend.dto.SubmitRequestDTO;

@RestController
@RequestMapping(path = "message/send")
public class MessageController {

    @Autowired
    private MessageService messagingService;

    @PostMapping
    public void submit(@RequestBody SubmitRequestDTO request) throws Exception {
        messagingService.sendMessage(
                request.getUsername(),
                request.getPassword(),
                request.getMessage().getFrom().getAddress(),
                request.getMessage().getTo().get(0).getAddress().getAddress());
    }
}
