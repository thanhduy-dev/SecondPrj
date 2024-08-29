/*
 * @ (#) Rectangle.java       1.0 29/08/2024
 *
 * Copyright (c) 2024 IUH All rights reserved.
*/
package iuh.fit.se;


/*
 * @description: This class is used to ...
 * @author: Thanh Duy
 * @date:   29/08/2024
 * @version:  1.0
*/
public class Rectangle {
    private double length;
    private double width;
    /*
     * mo ta dien tich
     * @param: chieu dai nhan voi chieu rong
     */
    public double getArea (){
        return length * width;
    }

    /**
     * mo ta chu vi hinh chu nhat
     * tra ve chieu dai cong chieu rong nhan hai
     *
     */
    public double getPerimeter(){
        return (length + width) * 2;
    }

    /**
     * description: xuat do dai

     */

    public double getLength() {
        return length;
    }
    /**
     * mo ta dua chieu rong ra man hinh
     * tra ve do rong cua hinh chu nhat
     */
    public double getWidth() {
        return width;
    }
    /**
     * mo ta constructor co hai tham so
     *
     */
    public Rectangle(double length, double width) {
        if (length < 0 || width < 0)
            throw new IllegalArgumentException("Length and width must be grater than 0");
        this.length = length;
        this.width = width;
    }
    /**
     * mo ta constructor co mot tham so
     *
     */
    public Rectangle (){
        this.length = 0;
        this.width = 0;
    }
    /**
     *  thay doi do dai
     *
     */
    public void setLength(double length) {
        if (length < 0)
            throw new IllegalArgumentException("Length must be grater than 0");
        this.length = length;
    }
    /**
     *  thay doi chieu rong
     *
     */
    public void setWidth(double width) {
        if (width < 0)
            throw new IllegalArgumentException("Width must be grater than 0");
        this.width = width;
    }

    public String toString() {
        return String.format("Rectangle[length=%.2f, width=%.2f, area=%.2f, perimeter=%.2f]", length, width,getArea(),getPerimeter());
    }


}
