package com.did.notifsvc.controller;

import com.did.notifsvc.dto.EmailDto;
import com.did.notifsvc.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.mail.MessagingException;
import java.util.HashMap;
import java.util.Map;

@RestController
public class NotifController {

    @Autowired
    private EmailService emailService;

    @Value("${sendTo}")
    private String to;

    @Value("${subject}")
    private String subject;

    @Value("${deliveryManagerName}")
    private String deliveryManagerName;

    @PostMapping("/email")
    public String sendEmail(@RequestBody EmailDto dto) throws MessagingException {
        Map<String, Object> templateModel = new HashMap<>();
        templateModel.put("deliveryManagerName", deliveryManagerName);
        templateModel.put("moduleName", dto.getModuleName());
        templateModel.put("pageName", dto.getPageName());
        templateModel.put("description", dto.getDescription());
        emailService.send(to, subject, templateModel);
        return "message sent";
    }
}
