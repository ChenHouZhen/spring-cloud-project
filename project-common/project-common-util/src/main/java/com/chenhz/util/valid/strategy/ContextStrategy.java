package com.chenhz.util.valid.strategy;


public class ContextStrategy {

    private static ContextStrategy factory = null;

    public static ContextStrategy getInstance() {
        if (factory == null) {
            factory = new ContextStrategy();
        }
        return factory;
    }

    public void executeStrategy(String type, Object target, Object targetAnnotaions) {
        ValidStrategy strategy = StrategyFactory.getInstance().creator(type);
        if(strategy!=null){
            strategy.doOperation(target, targetAnnotaions);
        }
    }

}