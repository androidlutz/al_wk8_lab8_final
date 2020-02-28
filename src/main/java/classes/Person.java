package main.java.classes;

abstract class Person {

    //attributes
    protected int id;
    protected String firstName;
    protected String lastName;

    //Member Functions
    public int getId() {
        return id;
    }

    public void setId(int i) {
        id = i;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String fN) {
       firstName = fN;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lN) {
        lastName = lN;
    }

    
    
}