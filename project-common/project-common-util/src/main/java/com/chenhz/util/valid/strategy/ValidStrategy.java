package com.chenhz.util.valid.strategy;

/**
 * @ClassName ValidStrategy
 * @Description 验证策略
 * @Author huangzl
 * @Date 2018/12/13 18:06
 * @Version 1.0
 **/
public interface ValidStrategy {
    void doOperation(Object target, Object targetAnnotaions);
}
