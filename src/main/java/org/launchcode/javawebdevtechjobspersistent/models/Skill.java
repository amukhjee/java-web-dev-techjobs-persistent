package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {
    @NotBlank(message = "description can not be blank")
    @Size(min = 5, max=500, message="description should be 5 to 500 characters long")
    private String description;

    @ManyToMany(mappedBy="skills")
    private List<Job> jobs= new ArrayList<>();

    public List<Job> getJobs() {
        return jobs;
    }


    public Skill() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}