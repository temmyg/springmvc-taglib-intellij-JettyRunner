package com.southwind.entity;

import java.util.HashMap;
import java.util.Map;

public class Student {
    private int id;
    private String name;
    private int age;
    private String gender;
    private  String password;
    private String[] hobbies;
    private String[] selectedHobbies;
    private int selectedGrade;
    private Map<Integer, String> travelledCity;
    private int selectedCity;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public int getSelectedCity() {
        return selectedCity;
    }

    public void setSelectedCity(int selectedCity) {
        this.selectedCity = selectedCity;
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

    public Map<Integer, String> getGradeMap() {
        return gradeMap;
    }

    public void setGradeMap(Map<Integer, String> gradeMap) {
        this.gradeMap = gradeMap;
    }

    public Map<Integer, String> gradeMap;

    public Student(){
        super();
        this.selectedHobbies = new String[]{"hiking", "swimming", "running"};
    }
    public Student(int id, String name, int age, String gender) {
        this();
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.hobbies = new String[]{ "prod", "dev", "test", "designer", "artist"  };
        this.gradeMap = new HashMap<Integer, String>();
        gradeMap.put(1, "grade 1");
        gradeMap.put(2, "grade 2");
        gradeMap.put(3, "grade 3");
        gradeMap.put(4, "grade 4");
        gradeMap.put(5, "grade 5");
        gradeMap.put(6, "grade 6");
        this.selectedGrade = 2;

        this.travelledCity = new HashMap<Integer, String>();
        this.travelledCity.put(1, "NewYork");
        this.travelledCity.put(2, "Tokyo");
        this.travelledCity.put(3, "Sydney");
        this.travelledCity.put(4, "Paris");
        this.selectedCity = 2;
    }

    public String[] getHobbies() {
        return hobbies;
    }

    public void setHobbies(String[] hobbies) {
        this.hobbies = hobbies;
    }


    public String[] getSelectedHobbies() {
        return selectedHobbies;
    }

    public void setSelectedHobbies(String[] selectedHobbies) {
        this.selectedHobbies = selectedHobbies;
    }

    public int getSelectedGrade() {
        return selectedGrade;
    }

    public void setSelectedGrade(int selectedGrade) {
        this.selectedGrade = selectedGrade;
    }


    public Map<Integer, String> getTravelledCity() {
        return travelledCity;
    }

    public void setTravelledCity(Map<Integer, String> travelledCity) {
        this.travelledCity = travelledCity;
    }

}
