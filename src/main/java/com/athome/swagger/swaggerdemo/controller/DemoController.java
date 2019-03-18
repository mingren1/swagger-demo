package com.athome.swagger.swaggerdemo.controller;

import com.athome.swagger.swaggerdemo.beans.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Api(description = "swggerDemo")
@RestController
@RequestMapping("/demoController")
public class DemoController {

    @ApiOperation(value = "新增用户",notes = "注册用户")
    @RequestMapping(value = "/createUser",method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE)
//    public ResObject createUser(@RequestBody User user) {
    public String createUser(@RequestBody User user) {
        System.out.println("createUser:"+user.toString());
//        return new ResObject(HttpStatus.OK.value(), "新增成功");
        return "新增成功";
    }


}
