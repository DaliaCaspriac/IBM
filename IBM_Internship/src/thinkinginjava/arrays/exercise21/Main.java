package thinkinginjava.arrays.exercise21;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        CompBerylliumSphere[] compSphere = new CompBerylliumSphere[5];
        compSphere[0] = new CompBerylliumSphere();
        compSphere[1] = new CompBerylliumSphere();
        compSphere[2] = new CompBerylliumSphere();
        compSphere[3] = new CompBerylliumSphere();
        compSphere[4] = new CompBerylliumSphere();
        Arrays.sort(compSphere);
        for(int i = 0 ; i < compSphere.length; i++){
            System.out.println(compSphere[i].toString());
        }
        System.out.println("---REVERSE---");
        Arrays.sort(compSphere,new CompBerylliumSphereComparator());
        for(int i = 0 ; i < compSphere.length; i++){
            System.out.println(compSphere[i].toString());
        }
    }
}
