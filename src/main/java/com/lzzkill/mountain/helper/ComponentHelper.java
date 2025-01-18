package com.lzzkill.mountain.helper;

import com.lzzkill.mountain.util.ReflectionUtil;
import jdk.nashorn.internal.ir.Block;
import net.minecraft.item.Item;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ComponentHelper {
     private final Map<String, Object> instances = new HashMap<>();
     private final Set<Class<?>> classes;
     private final String basePackage;

     private final Map<String, Item> items = new HashMap<>();
     private final Map<String, Block> blocks = new HashMap<>();

     public ComponentHelper(String basePackage) {
         this.basePackage = basePackage;
         classes = ReflectionUtil.getClasses(basePackage);
         for (Class<?> clazz : classes) {

             if (clazz.getPackage().getName().equals(basePackage + ".item") && clazz.getSuperclass() == Item.class) {}
         }
     }

}
