package day03;

import day02.Person;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 定义私有属性:
 * String name;
 * int age;
 * String gender;
 * int salary;
 * Date hiredate;//入职时间
 * 
 * 定义构造方法，以及属性get,set方法.
 * 定义toString方法，格式如:
 *    姓名:张三,年龄:25,性别:男,薪资:5000,入职时间:2006-02-15
 * 
 * 定义equals方法，要求只要名字相同，则认为内容一致。
 * @author Bonnie
 *
 */
public class Emp {
    private String name;
    private int age;
    private String gender;
    private int salary;
    private Date hiredate;


    @Override
    public String toString() {
        String hiredate=new SimpleDateFormat("yyyy-MM-dd").format(this.hiredate);
        return "姓名:"+name+",年龄:"+age+"," +
                "性别:"+gender+",薪资:"+salary+"," +
                "入职时间:"+hiredate;
    }

    public Emp(String name, int age, String gender, int salary, Date hiredate) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
        this.hiredate = hiredate;
    }

    @Override
    public boolean equals(Object o) {
        if(o instanceof Emp){
            Emp emp=(Emp) o;
            return this.name == emp.name;
        }
        return this == o;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Date getHiredate() {
        return hiredate;
    }

    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }
}