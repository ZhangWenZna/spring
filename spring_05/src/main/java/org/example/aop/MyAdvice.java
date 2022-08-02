package org.example.aop;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAdvice {
    @Pointcut("execution(void org.example.dao.BookDao.update())")
    private void pt(){}
    @Pointcut("execution(void org.example.dao.BookDao.save())")
    private void px(){}

    @Around(value = "px()")
    public void method(ProceedingJoinPoint pjp){
        System.out.println(System.currentTimeMillis());

    }
}
