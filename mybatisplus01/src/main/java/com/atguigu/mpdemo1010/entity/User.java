package com.atguigu.mpdemo1010.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;


@Data
public class User {


    private Long id;

    private String name;
    private Integer age;
    private String email;

}
