package com.changqin.fast.config;

import com.changqin.fast.domain.message.DomainMessage;
import com.changqin.fast.event.EventFirer;
import com.changqin.fast.model.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @ProjectName: spring-boot-starter-disruptor
 * @Package: com.changqin.fast.config
 * @ClassName: FireEventHanlder
 * @Description: java类作用描述
 * @Author: dongjigong
 * @CreateDate: 2019/10/24 11:19
 * @UpdateUser:
 * @UpdateDate: 2019/10/24 11:19
 * @UpdateRemark:
 * @Version: 1.0
 * @Copyright: 河南昱荣教育科技有限公司
 */
@Component
public class FireEventHandler {

    @Autowired
    private EventFirer eventFirer;

    public DomainMessage getSchoolUser(UserInfo user,String topic){
        DomainMessage message = new DomainMessage(user);
        eventFirer.fire(message,topic);
        return message;
    }
}
