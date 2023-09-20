package HouseClone;

import java.util.Date;

public class House implements Cloneable, Comparable<House>{
    private int id;
    private double area;
    private Date whenBuilt;

    public House(int id, double area, Date whenBuilt) {
        this.id = id;
        this.area = area;
        this.whenBuilt = whenBuilt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public Date getWhenBuilt() {
        return whenBuilt;
    }

    public void setWhenBuilt(Date whenBuilt) {
        this.whenBuilt = whenBuilt;
    }

    @Override
    public String toString() {
        return "House{" +
                "id=" + id +
                ", area=" + area +
                ", whenBuilt=" + whenBuilt +
                '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        House houseClone = (House)super.clone(); //shallow copy . only copy the primative or built in type clone

        houseClone.whenBuilt = (Date)whenBuilt.clone(); //i think it manually assigns the whenBuilt value of the house clone by cloninng the value of whenBuild specifically
        return houseClone;
    }

    public Object deepCloneWithoutImplementing(){
        House houseClone = new House(id, area, whenBuilt);

    }
}
