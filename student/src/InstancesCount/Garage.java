package InstancesCount;

public class Garage {
    static int count=0;
    public Garage(){
       count++;
    }
    public static int noOfInstances(){
        return count;
    }
}
