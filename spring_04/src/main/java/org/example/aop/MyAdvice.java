package org.example.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAdvice {
    @Pointcut("execution(* org.example.service.UserService.selectAll())")
    private void servicePt(){}
    @Around("servicePt()")
    public void runSpeed(ProceedingJoinPoint pjp) throws Throwable {
        Signature signature = pjp.getSignature();
        long l = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            Object proceed = pjp.proceed();
        }
        pjp.proceed();
        long l2 = System.currentTimeMillis();
        System.out.println(signature.getDeclaringTypeName());
        System.out.println(signature.getName());
        System.out.println("执行10000次的效率为："+(l2-l));


    }
}
