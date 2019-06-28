package com.chenhz.common.util;

import java.util.UUID;

public class UUIDGenerateUtil {

    public static String create(){
        return UUID.randomUUID().toString().replace("-","");
    }

}
