package MapFlatMap;

import java.util.List;

public class Employee {
    private int id;
    private String name;
    private List<String> citiesPreference;

    public Employee(int id, String name, List<String> citiesPreference) {
        this.id = id;
        this.name = name;
        this.citiesPreference = citiesPreference;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getCitiesPreference() {
        return citiesPreference;
    }

    public void setCitiesPreference(List<String> citiesPreference) {
        this.citiesPreference = citiesPreference;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", citiesPreference=" + citiesPreference + "]";
    }

}
