package me.dougmoreira.rest.models;

import javax.persistence.*;

@Entity
public class User {
//    @ SYNTAX IS USED TO TELL MYSQL HOW THIS DB SHOULD BE
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String firstName;
    @Column
    private String lastName;
    @Column
    private int age;
    @Column
    private String occupation;

//    constructor
    public User(){

    }
    public User(String firstName, String lastName, int age, String occupation){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.occupation = occupation;
    }

//    ID
    public long getId(){
        return id;
    }
    public  void setId (){
        this.id = id;
    }
//     FIRST NAME
    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
//    LAST NAME
    public String getLastName(){
        return lastName;
    }
    public  void setLastName(String lastName){
        this.lastName = lastName;
    }
//    AGE
    public int getAge(){
        return age;
    }
    public  void setAge(int age){
        this.age = age;
    }
//    OCCUPATION
    public String getOccupation(){
        return occupation;
    }
    public  void setOccupation(String occupation){
        this.occupation = occupation;
    }
}
