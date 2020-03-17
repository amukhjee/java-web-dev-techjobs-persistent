package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.util.List;

@Entity
public class Job extends AbstractEntity{


    @ManyToOne
    private Employer employers;
    @ManyToMany
    private List<Skill> skills;



    public Job() {
    }

    public Job(Employer anEmployer, Skill someSkills) {
        super();
        this.employers = anEmployer;
        this.skills = (List<Skill>) someSkills;
    }



    // Getters and setters.



    public Employer getEmployer() {
        return employers;
    }

    public void setEmployer(Employer employer) {
        this.employers = employer;
    }

    public Skill getSkills() {
        return (Skill) skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }
}
