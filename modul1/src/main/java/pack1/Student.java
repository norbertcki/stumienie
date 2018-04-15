package pack1;

public class Student{
   private String name;
   private int wiek;

    public Student(String name, int wiek) {
        this.name = name;
        this.wiek = wiek;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWiek() {
        return wiek;
    }

    @Override
    public String toString() {
        return "Student:" +
                "imie='" + name + '\'' +
                ", wiek=" + wiek +
                '}';
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }
}
