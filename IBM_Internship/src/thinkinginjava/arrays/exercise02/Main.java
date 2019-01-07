package thinkinginjava.arrays.exercise02;

public class Main {
    public static BerylliumSphere[] getSphereArray(int length){
        BerylliumSphere[] spheres = new BerylliumSphere[length];
        for(int i = 0; i < length; i++){
            spheres[i] = new BerylliumSphere();
        }
        return spheres;
    }
    public static void main(String[] args) {
        BerylliumSphere[] array = getSphereArray(4);
        for(BerylliumSphere sphere : array){
            System.out.println(sphere.toString());
        }
    }
}
