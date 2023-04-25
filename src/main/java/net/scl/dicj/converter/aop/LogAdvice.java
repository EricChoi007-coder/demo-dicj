package net.scl.dicj.converter.aop;

import net.scl.dicj.converter.customException.CustomException;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogAdvice {

    @Pointcut("execution(* net.scl.dicj.converter.service.impl.VideoServiceImpl.*(..))")
    public void aspect(){

    }

    @Before("aspect()")
    public void beforeLog(JoinPoint joinPoint)
    {
        System.out.println("LogAdvice beforeLog");
    }

    @After("aspect()")
    public void afterLog(JoinPoint joinPoint){
        System.out.println("LogAdvice afterLog");
    }

    @AfterThrowing(pointcut = "aspect()",throwing = "ex")
    public void afterThrowing(JoinPoint joinPoint,Throwable ex){
        if (ex instanceof CustomException) {
            System.out.println("客制化获到异常了..............");
            //纪录错误信息
            System.out.println("客制化错误:"+ ((CustomException) ex).getErrorInfo());
        }else{
            System.out.println("全局捕获到异常了..............");
            //纪录错误信息
            System.out.println("系统错误:{}"+ ex.getMessage());
            // todo 想要执行的操作
        }

    }
}
