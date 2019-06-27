package com.chenhz.util.valid.strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName StrategyFactory
 * @Description 策略工厂
 * @Author huangzl
 * @Date 2018/12/13 18:40
 * @Version 1.0
 **/
public class StrategyFactory {

    private static StrategyFactory factory = null;

    private StrategyFactory() {
    }

    private static Map<String, ValidStrategy> strategyMap = new HashMap<>();

    static {
        strategyMap.put("MultipartFileValid", new MultipartFileValidStrategy());
        strategyMap.put("NotNullValid", new NotNullValidStrategy());
    }

    public ValidStrategy creator(String type) {
        return strategyMap.get(type);
    }

    public static StrategyFactory getInstance() {
        if (factory == null) {
            factory = new StrategyFactory();
        }
        return factory;
    }
}