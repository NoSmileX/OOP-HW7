package org.example.reflections;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        ReflectionMethod reflectionMethod = new ReflectionMethod();
        System.out.println(reflectionMethod.restoreClassMetainf(ForExample.class));

        HackString hackString = new HackString();
        ForExample hack = new ForExample("Something", 11, true, "else");
        ForExample hack2 = new ForExample(null, 33, false, null);
        ForExample hack3 = new ForExample();
        System.out.println(hack);
        System.out.println(hack2);
        System.out.println(hack3);
        hackString.hackTheObject(hack);
        hackString.hackTheObject(hack2);
        hackString.hackTheObject(hack3);
        System.out.println(hack);
        System.out.println(hack2);
        System.out.println(hack3);
    }
}
