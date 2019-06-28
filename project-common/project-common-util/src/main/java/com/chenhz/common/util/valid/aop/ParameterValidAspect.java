/*
package com.chenhz.common.util.valid.aop;

import com.chenhz.common.util.valid.strategy.ContextStrategy;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;


@Aspect
@Component
@Slf4j
public class ParameterValidAspect {

    @Pointcut("@annotation(com.chenhz.common.util.valid.annotation.NotNullValid)")
    public void parameterValidCut() {

    }

    //value = "execution(* com.chenhz.uac.web.controller.*.*(..))"
    @Before("parameterValidCut()")
    public void beforMethod(JoinPoint joinPoint) {
        log.debug(">>>> 参数校验...");
        // 参数
        Object[] args = joinPoint.getArgs();
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        //获取该方法在参数上的注解，每个参数可以有多个注解，得到的是一个二维数组
        Annotation[][] parameterAnnotaions = method.getParameterAnnotations();
        for (int i = 0, isize = parameterAnnotaions.length; i < isize; i++) {
            Annotation[] oneParameterAnnotaions = parameterAnnotaions[i];
            for (int j = 0, jsize = oneParameterAnnotaions.length; j < jsize; j++) {
                Class<? extends Annotation> aClass = oneParameterAnnotaions[j].annotationType();
                ContextStrategy.getInstance().executeStrategy(aClass.getSimpleName(), args[i], oneParameterAnnotaions[j]);
            }
        }
    }

}
*/
