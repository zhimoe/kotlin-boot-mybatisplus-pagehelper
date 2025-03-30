package com.example.demo

import org.mybatis.spring.annotation.MapperScan
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication(scanBasePackages = ["com.example.demo"])
@MapperScan(basePackages = ["com.example.demo"])
class DemoApplication

fun main(args: Array<String>) {

    runApplication<DemoApplication>(*args)

}
