package com.modernjava.var;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class VarTypeExample {


    //var in the class properties are not allowed.
    //private var x = "abc";



    public static void main(String[] args) {
        var names = List.of("bheem", "shekhar");
        System.out.println("names :" + names);

        for(var name : names){
            System.out.println("name :" +name);
        }

        var map =Map.ofEntries(Map.entry("name", List.of("bheem", "shekhar")));
        System.out.println("map :" + map);

        map.forEach((s, strings) -> {
            System.out.println(s + ":" +strings);
        });

        var transformedName = transform("shekhar");
        System.out.println("transformedName :" + transformedName);

        //limitations of LVTI - Local Variable Type Inference
        //var x = null;
        var y = "abc";
        //y = 1; not possible to change type.
        var var = "xyz";//this is valid and compiler won't complain b/c var is not a reserved keyword
    }

    static String transform(String name) { // var in the function argument is not allowed

        return name.toUpperCase();

    }

}

