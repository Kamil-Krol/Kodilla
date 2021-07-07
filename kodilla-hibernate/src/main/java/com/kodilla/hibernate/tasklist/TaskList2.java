package com.kodilla.hibernate.tasklist;


import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "TASKSLIST2")
public class TaskList2 {

    private int id;
    private String listName;
    private String descryption;

    public TaskList2() {
    }

    public TaskList2(int id, String listName, String descryption) {
        this.id = id;
        this.listName = listName;
        this.descryption = descryption;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name="ID", unique = true)
    public int getId() {
        return id;
    }

    @Column(name="LISTNAME")
    public String getListName() {
        return listName;
    }

    @Column(name="DESCRYPTION")
    public String getDescryption() {
        return descryption;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setListName(String listName) {
        this.listName = listName;
    }

    public void setDescryption(String descryption) {
        this.descryption = descryption;
    }
}
