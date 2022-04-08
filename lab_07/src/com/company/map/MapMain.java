package com.company.map;

import java.util.HashMap;
import java.util.Map;

public class MapMain {
    public static void main(String[] args) {
        Map<String, Integer> gradesByName = new HashMap<>();

        gradesByName.put("Diana", 5);
        gradesByName.put("Tony", 7);
        gradesByName.put("Diana", 8);
        gradesByName.put("diana", 3);

        gradesByName.replace("Tony", 3);
        gradesByName.replace("Wendy", 5);

        System.out.println(gradesByName);
        gradesByName.forEach((key, value) -> {
            System.out.println(key);
            System.out.println(value);
        });

        for (Map.Entry<String, Integer> entry : gradesByName.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        for (String key : gradesByName.keySet()) {
            System.out.println(key);
        }

        System.out.println(gradesByName.getOrDefault("Tony", 5));
        System.out.println(gradesByName.getOrDefault("Wendy", 8));

    }
}
