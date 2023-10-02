public class Person {
    
    private String _name;
    private String _lastName;


    public Person(String name, String lastName){
        this._name = name;
        this._lastName = lastName;
    }


    public String getName() {
        return this._name;
    }

    public void setName(String _name) {
        this._name = _name;
    }

    public String getLastName() {
        return this._lastName;
    }

    public void setLastName(String _lastName) {
        this._lastName = _lastName;
    }


}
