package org.example.reflections;

import java.lang.reflect.*;

public class ReflectionMethod {
    public String restoreClassMetainf(Class<?> clazz) {
        StringBuilder sb = new StringBuilder();
        System.out.println("Class metainfo: ");
        getPackageOfClassInfo(sb, clazz);
        getClassInfo(sb, clazz);
        getClassFieldsInfo(sb, clazz);
        getClassConstructionsInfo(sb, clazz);
        getClassMethodsInfo(sb, clazz);
        return sb.toString();
    }

    private void getPackageOfClassInfo(StringBuilder sb, Class<?> clazz) {
        sb.append("Package name: \n\t").append(clazz.getPackageName()).append("\n");
    }

    private void getClassInfo(StringBuilder sb, Class<?> clazz) {
        sb.append("Class name: \n\t").append(clazz.getName()).append("\nClass extend: \n\t")
                .append(clazz.getSuperclass().getName()).append("\n");
        Class<?>[] interfaces = clazz.getInterfaces();
        if (interfaces.length > 0) {
            sb.append("Class implements \n\t");
            for (Class<?> anInterface : interfaces) {
                sb.append(anInterface.getName()).append("\n");
            }
        }
    }

    private void getClassFieldsInfo(StringBuilder sb, Class<?> clazz) {
        sb.append("Class fields: ");
        Field[] fields = clazz.getDeclaredFields();
        for (Field field :
                fields) {
            sb.append("\n\t[ ").append(Modifier.toString(field.getModifiers()))
                    .append(" ").append(field.getType()).append(" ").append(field.getName())
                    .append(" ]");
        }
    }

    private void getClassConstructionsInfo(StringBuilder sb, Class<?> clazz) {
        sb.append("\nClass constructions: ");
        Constructor<?>[] constructors = clazz.getDeclaredConstructors();
        for (Constructor<?> constructor :
                constructors) {
            sb.append("\n\t[ ").append(Modifier.toString(constructor.getModifiers()))
                    .append(" ").append(constructor.getName()).append(" (");
            Parameter[] parameters = constructor.getParameters();
            for (int i = 0; i < parameters.length; i++) {
                if (i != 0) {
                    sb.append(", ");
                }
                sb.append(parameters[i].getType().getName()).append(" ")
                        .append(parameters[i].getName());
            }
            sb.append(") ]");
        }
    }

    private void getClassMethodsInfo(StringBuilder sb, Class<?> clazz) {
        sb.append("\nClass methods: ");
        Method[] methods = clazz.getDeclaredMethods();
        if (methods.length != 0) {
            for (Method method :
                    methods) {
                sb.append("\n\t[ ").append(Modifier.toString(method.getModifiers())).append(" ")
                        .append(method.getReturnType().getName()).append(" ").append(method.getName())
                        .append(" (");
                Parameter[] parameters = method.getParameters();
                for (int i = 0; i < parameters.length; i++) {
                    if (i != 0) {
                        sb.append(", ");
                    }
                    sb.append(parameters[i].getType().getName()).append(" ")
                            .append(parameters[i].getName());
                }
                sb.append(") ]");
            }
        } else
            sb.append("no methods in this class.");
    }
}
