package Encapsulation;

public class Categories {
    // menggunakan acces modidier private pada field atau attribute
    private int id;
    private String name;
    private boolean expensive;

    public Categories(int id, String name, boolean expensive){
        super();
        this.id = id;
        this.name = name;
        this.expensive = expensive;

    }

    public Categories(){
        super();
    }

    // contoh Getter dan Setter tipe data boolean
    // Getter
    public  boolean isExpensive(){
        return expensive;
    }
    // Setter
    public void setExpensive(boolean expensive){
        this.expensive = expensive;
    }

    // tipe data object
    // Getter
    public String getName(){
        return name;
    }
    // setter
    public void setName(String name){
        this.name = name;
    }

    // tipe data primitive (int)
    // Getter
    public int getId(){
        return id;
    }
    // Setter
    public void setId(int id){
        this.id = id;
    }
}
