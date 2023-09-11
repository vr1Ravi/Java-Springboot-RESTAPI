package vr1.ravi.springcourseapi.topic;

public class Topic {
    private String id;
    private String name;
    private String descriptaion;

    
    public Topic(String id, String name, String descriptaion) {
        super();
        this.id = id;
        this.name = name;
        this.descriptaion = descriptaion;
    }
     public Topic() {

    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescriptaion() {
        return descriptaion;
    }
    public void setDescriptaion(String descriptaion) {
        this.descriptaion = descriptaion;
    }
   



}
