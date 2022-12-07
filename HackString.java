package org.example.reflections;

import java.lang.reflect.Field;

public class HackString {
    public void hackTheObject(Object obj) throws IllegalAccessException {
        Class<?> clazz = obj.getClass();

        Field[] fields = clazz.getDeclaredFields();
        Field[] fieldsSuperClass = clazz.getSuperclass().getDeclaredFields();
        Field.setAccessible(fieldsSuperClass, true);
        Field.setAccessible(fields, true);
        for (Field field :
                fields) {
            if (field.getType().getName().equals(String.class.getName())) {
                field.set(obj, "You're hacked. Send 10 btc to 34kNXokGAdmLvsJFFZdrkn27PPtvYLXDYS");
            }
        }
        for (Field field :
                fieldsSuperClass) {
            if (field.getType().getName().equals(String.class.getName())) {
                field.set(obj, "You're hacked. Send 10 btc to 34kNXokGAdmLvsJFFZdrkn27PPtvYLXDYS");
            }
        }
    }
}
