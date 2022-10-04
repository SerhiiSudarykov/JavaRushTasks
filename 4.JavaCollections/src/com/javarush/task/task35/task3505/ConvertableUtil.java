package com.javarush.task.task35.task3505;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ConvertableUtil {

    public static Map convert(List<? extends Convertable> list) {
        Map result = new HashMap();
        for (Convertable convertable:list){
            result.put(convertable.getKey(),convertable);
        }
        return result;
    }
}
