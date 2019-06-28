package com.chenhz.common.util.valid.strategy;

import com.chenhz.common.util.valid.annotation.NotNullValid;
import org.springframework.util.StringUtils;

public class NotNullValidStrategy implements ValidStrategy {

    @Override
    public void doOperation(Object target, Object targetAnnotaions) {
        NotNullValid notNull = (NotNullValid) targetAnnotaions;
        if (target instanceof Object[]) {
            if (((Object[]) target).length == 0) {
                throw new IllegalArgumentException(notNull.message());
            }
        }else if (StringUtils.isEmpty(target)) {
            throw new IllegalArgumentException(notNull.message());
        }
    }
}