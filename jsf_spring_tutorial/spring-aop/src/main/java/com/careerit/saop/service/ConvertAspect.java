package com.careerit.saop.service;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
@Aspect
@Slf4j
public class ConvertAspect {


    @Around("@annotation(com.careerit.saop.service.ConvertToUpper)")
    public Object convertToUpper(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        log.info("Before calling method : {}", proceedingJoinPoint.getSignature().getName());
        Object obj = proceedingJoinPoint.proceed();
        if (obj instanceof List) {
            List<String> list = new ArrayList<>((List<String>)obj);
            for (int i = 0; i < list.size(); i++) {
                list.set(i, list.get(i).toUpperCase());
            }
            log.info("After calling method : {}", proceedingJoinPoint.getSignature().getName());
            return list;
        }
        log.info("After calling method : {}", proceedingJoinPoint.getSignature().getName());
        return obj;
    }

}
