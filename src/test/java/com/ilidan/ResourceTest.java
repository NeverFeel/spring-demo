package com.ilidan;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;

public class ResourceTest {
    public static void main(String[] args) {
        Resource resource = new ClassPathResource("application.properties");
        Properties properties = new Properties();
        try(InputStream inputStream = resource.getInputStream()){
            properties.load(new InputStreamReader(inputStream, "UTF-8"));
            System.out.println(properties.getProperty("user.name"));
        }catch (Exception e){
            //TODO 异常处理
            e.printStackTrace();
        }
    }
}
