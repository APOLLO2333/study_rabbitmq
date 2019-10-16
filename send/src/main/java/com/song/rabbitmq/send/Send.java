package com.song.rabbitmq.send;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Send {

    @Autowired
    private SendMessage sendMessage;

    @GetMapping("/send")
    @ResponseBody
    public String send() {
        sendMessage.send("test");
        return "success";
    }
}