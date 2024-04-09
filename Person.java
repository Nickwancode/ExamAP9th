package one;

public abstract class Person {

    private Size size;
    protected String name;
    public int id;
    public static int uniqueID = 0;

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getUniqueID() {
        return uniqueID;
    }

    public static void setUniqueID(int uniqueID) {
        Person.uniqueID = uniqueID;
    }

    public Person(String name, Size size){
        this.name = name;
        this.size = size;
        uniqueID++;
        id = uniqueID;

    }
    public void printInfo(){
        System.out.println(" ");
    }
    public void printPriceAfterDiscount(Cloth cloth){

    }
    public void printUniqueStudentID(){

    }


}
