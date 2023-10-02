public class Captain extends Person {

    private int _registrationId;

    public Captain(String name, String lastName, int registration_id) {
        super(name, lastName);
        this._registrationId = registration_id;
    }

    public int getRegistrationId() {
        return this._registrationId;
    }

    
}
