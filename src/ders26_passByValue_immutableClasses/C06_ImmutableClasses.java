package ders26_passByValue_immutableClasses;

import java.util.ArrayList;
import java.util.List;

public  class C06_ImmutableClasses {
    public static void main(String[] args) {

        String str="Java guzeldir";

        System.out.println(str.toUpperCase()); // JAVA GUZELDİR

        System.out.println(str); // Java guzeldir

        str.toLowerCase();

        System.out.println(str); // Java guzeldir

        // String immutable oldugundan method ile yapilan degisiklislerStrin gi kalici degistirmez

        List<String> harfler=new ArrayList<>();

        harfler.add("A");
        harfler.add("B");

        harfler.remove(0);

        System.out.println(harfler); // [B]
        // array ve list mutable oldugundan yapılan degisiklikler kalıcı olur

    }
}
