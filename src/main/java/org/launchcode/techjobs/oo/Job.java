package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;
    public Job() {
        id = nextId;
        nextId++;
    }

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;
    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location= location;
        this.positionType= positionType;
        this.coreCompetency= coreCompetency;


    }

    @Override
    public boolean equals(Object o) {  // Two objects are equal if they have the same id.
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job job = (Job) o;
        return getId() == job.getId(); //returns true or false
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmployer() {
        return employer.getValue();
    }

    public String getLocation() {
        return location.getValue();
    }

    public String getPositionType() {
        return positionType.getValue();
    }

    public String getCoreCompetency() {
        return coreCompetency.getValue();
    }

    public void setName(String value) {
        this.name = value;
    }
    public void setEmployer(Employer value) {
        this.employer = value;
    }
    public void setLocation(Location value){ this.location = value;}
    public void setPositionType(PositionType value){this.positionType = value;}
    public void setCoreCompetency(CoreCompetency value){ this.coreCompetency = value;}


    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.
}
