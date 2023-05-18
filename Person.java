public class Person {
    String Name;
    int Id;

    public Person(String Name, int Id) {
        this.Name = Name;
        this.Id = Id;
    }

    public String getName() {
        return Name;
    }

    public int getId() {
        return Id;
    }

    @Override
    public String toString() {
        return "Person{" + "Name='" + Name + '\'' + ", Id=" + Id + '}';
    }
}
