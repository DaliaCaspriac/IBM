package thinkinginjava.arrays.exercise18;

import thinkinginjava.arrays.exercise02.BerylliumSphere;

public class Main {
    public static BerylliumSphere[] createArray(int size){
        BerylliumSphere[] spheres = new BerylliumSphere[size];
        for(int i  = 0; i < size; i++){
            spheres[i] = new BerylliumSphere();
        }
        return spheres;
    }

    public static void main(String[] args) {
        int size = 5;
        BerylliumSphere[] spheres = new BerylliumSphere[size];
        BerylliumSphere[] copyOfSpheres = new BerylliumSphere[size];
        spheres = createArray(size);
        copyOfSpheres = spheres;
        System.out.println("S " + spheres[2] + " C " + copyOfSpheres[2]);
        spheres[2] = new BerylliumSphere();
        System.out.println("S " + spheres[2] + " C " + copyOfSpheres[2]);
    }
}
