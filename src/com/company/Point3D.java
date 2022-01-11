package com.company;

public class Point3D extends Point2D{
    private float z = 0.0f;

    public Point3D(){
    }

    public Point3D(float x, float y, float z){
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void SetXYZ(float x, float y, float z){
        super.setXY(x, y);
        setZ(z);
    }
    public float []getXYZ(){
        float[] xyz = {super.getX(), super.getY(), getZ()};
        return xyz;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "x & y = " + super.toString() +
                " and z =" + z +
                '}';
    }
}
