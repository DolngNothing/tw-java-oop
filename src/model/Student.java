package model;

public class Student {
    private String name;
    private String idNo;
    private Integer age;
    private String gender;

    public Student() {
    }

    public Student(String name, String idNo, Integer age, String gender) {
        this.name = name;
        this.idNo = idNo;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", idNo='" + idNo + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
