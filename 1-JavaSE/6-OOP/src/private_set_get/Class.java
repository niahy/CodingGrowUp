package private_set_get;

public class Class {
    private String name;
    private String type;
    private int ID;
    private int studentNum;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(int studentNum) {
        this.studentNum = studentNum;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
