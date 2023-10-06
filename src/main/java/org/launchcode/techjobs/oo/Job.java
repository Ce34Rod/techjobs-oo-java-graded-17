package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job{

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
    public String toString(){
        String W = System.lineSeparator();
        if (name.isEmpty()) {
            this.name = "Data not available";
        }
        if (this.employer.getValue().isEmpty()) {
            this.employer.setValue("Data not available");
        }
        if (this.location.getValue().isEmpty()) {
            this.location.setValue("Data not available");
        }
        if (this.positionType.getValue().isEmpty()) {
            this.positionType.setValue("Data not available");
        }
        if (this.coreCompetency.getValue().isEmpty()) {
            this.coreCompetency.setValue("Data not available");
        }

        return W + "ID: "+id + W + "Name: "+name + W + "Employer: "+this.employer + W + "Location: " +location + W + "Position Type: "+positionType + W + "Core Competency: "+coreCompetency + W;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public Location getLocation() {
        return location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public CoreCompetency getCoreCompetency() {

        return coreCompetency;
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
