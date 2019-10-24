package com.changqin.fast.service;

import com.changqin.fast.config.FireEventHandler;
import com.changqin.fast.domain.message.DomainMessage;
import com.changqin.fast.model.School;
import com.changqin.fast.model.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private FireEventHandler fireEventHandler;

    public School findUser() {

        UserInfo userInfo = new UserInfo();
        userInfo.setUsername("feiji");
        userInfo.setPassword("tianxia");
        DomainMessage message = fireEventHandler.getSchoolUser(userInfo,"getUserSchool");
        School school =(School) message.getEventResult();
        return school;
    }
}
