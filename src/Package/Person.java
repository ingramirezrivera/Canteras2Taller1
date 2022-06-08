package Package;

import java.util.Date;

public class Person {
    /**
     * PERSON ATRIBUTES
     *
     */
    public String name;
    public String lastName1;
    public String lastName2;
    public Date dateBirth;
    public Float height;

    /**
     * PERSON CONSTRUCTOR
     * @param name { String } this is the name of
     * @param lastName1 { String } this is ther first last name
     * @param lastName2 { String } this is the second las name
     * @param dateBirth { Date } this is the birthdate
     * @param height { float } this is the person height
     */
    public Person(String name, String lastName1, String lastName2, Date dateBirth, Float height){
        this.name = name;
        this.lastName1 = lastName1;
        this.lastName2 =lastName2;
        this.dateBirth = dateBirth;
        this.height = height;
    }

    /**
     * Get the person name
     * @return name the name of the person
     * */
    public String getName() {
        return name;
    }

    /**
     * Set the person name
     * @param name the name of the person
     * */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * Get the person lastName1
     * @return the firts last name of the person
     * */
    public String getLastName1() {
        return lastName1;
    }
    /**
     * Set the person lastName1
     * @param lastName1 the firts last name of the person
     * */
    public void setLastName1(String lastName1) {
        this.lastName1 = lastName1;
    }
    /**
     * Get the person lastName2
     * @return the firts last name of the person
     * */
    public String getLastName2() {
        return lastName2;
    }
    /**
     * Set the person lastName2
     * @param lastName2 the firts last name of the person
     * */
    public void setLastName2(String lastName2) {
        this.lastName2 = lastName2;
    }
    /**
     * Get the person birthdate
     * @return the person birthdate
     * */
    public Date getDateBirth() {
        return dateBirth;
    }
    /**
     * Set the person birthdate
     * @param dateBirth the firts last name of the person
     * */
    public void setDateBirth(Date dateBirth) {
        this.dateBirth = dateBirth;
    }
    /**
     * Get the person height
     * @return the height of the person
     * */
    public Float getHeight() {
        return height;
    }
    /**
     * Set the person height
     * @param height the firts last name of the person
     * */
    public void setHeight(Float height) {
        this.height = height;
    }
}

