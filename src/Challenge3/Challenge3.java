package Challenge3;

public class Challenge3 {
    private String firstName = "Sonia";
    private String lastName = "Rahman";
    private char firstInitial = 'S';
    private char middleInitial = 'N';
    private char lastInitial = 'A';

    public Challenge3(char firstInitial, char middleInitial, char lastInitial) {
        this.firstInitial = firstInitial;
        this.middleInitial = middleInitial;
        this.lastInitial = lastInitial;
    }
    public Challenge3 (String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Challenge3 (String firstName, String lastName, char firstInitial, char middleInitial, char lastInitial){
        this.firstName = firstName;
        this.lastName = lastName;
        this.firstInitial = firstInitial;
        this.middleInitial = middleInitial;
        this.lastInitial = lastInitial;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName (String firstName){
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName (String lastName){
        this.lastName = lastName;
    }
    public char getFirstInitial() {
        return firstInitial;
    }

    public void setFirstInitial(char firstInitial) {
        this.firstInitial = firstInitial;
    }
    public char getMiddleName(){
        return middleInitial;
    }
    public void setMiddleInitial(char middleInitial){
        this.middleInitial = middleInitial;
    }

    public char getLastInitial (){
        return lastInitial;
    }
    public void setLastInitial (char lastInitial){
        this.lastInitial = lastInitial;
    }


}
