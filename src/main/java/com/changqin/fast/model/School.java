package com.changqin.fast.model;

/**
 * @ProjectName: spring-boot-starter-disruptor
 * @Package: com.changqin.fast.model
 * @ClassName: School
 * @Description: java类作用描述
 * @Author: dongjigong
 * @CreateDate: 2019/10/24 11:15
 * @UpdateUser:
 * @UpdateDate: 2019/10/24 11:15
 * @UpdateRemark:
 * @Version: 1.0
 * @Copyright: 河南昱荣教育科技有限公司
 */
public class School {

    private String address;

    private String schoolName;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }
}
