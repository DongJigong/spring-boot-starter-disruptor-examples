package com.changqin.fast.service;

import com.changqin.fast.disruptor.Consumer;
import com.changqin.fast.disruptor.OnEvent;
import com.changqin.fast.model.School;
import com.changqin.fast.model.UserInfo;
import org.springframework.stereotype.Service;

@Service
@Consumer
public class SchoolService {

    @OnEvent("getUserSchool")
    public School getSchool(UserInfo userInfo){

        School school = new School();
        school.setAddress("nansanhuan");
        return school;
    }
}
