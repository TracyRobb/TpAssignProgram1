/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tracy.test1.config;

import com.tracy.test1.service.CalcService;
import com.tracy.test1.service.Impl.CalcServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author student
 */
@Configuration
public class AppConfig {
    @Bean (name = "cals")
    public CalcService getService()
    {
        return new CalcServiceImpl();
    }
}
