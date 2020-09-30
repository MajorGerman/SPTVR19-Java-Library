package entity;

public class Book {
    private String name;
    private String aut;
    private Integer year;

    public Book(String name, String aut, Integer year) {
        this.name = name;
        this.aut = aut;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAut() {
        return aut;
    }

    public void setAut(String aut) {
        this.aut = aut;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return ("- " + this.name + "(" + this.aut + ", " + this.year + ")");
    }
    
}

