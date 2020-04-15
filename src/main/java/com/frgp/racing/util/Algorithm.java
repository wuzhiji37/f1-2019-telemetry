package com.frgp.racing.util;

import java.util.UUID;

public class Algorithm {
    public static String getUUID() {
        return UUID.randomUUID().toString().replace("-", "");
    }
}
