package rocks.zipcode.assessment2.objectorientation;

/**
 * @author leon on 28/11/2018.
 * @ATTENTION_TO_STUDENTS - Ensure that you have completed the `Address` class before attempting this class
 */
public class Person {
    /**
     * @param id - id of person
     * @param name - name of person
     * @param address - address of person
     */

    Address ad = new Address();
    Long id=Long.MIN_VALUE;
    String name="";
    Address address;
    public Person(Long id, String name, Address address) {
     this.id=id;
     this.name=name;
     this.address=address;

    }

    public Person() {
        this.id=Long.MIN_VALUE;
        this.name="";
        this.address = new Address();

    }

    public Long getId() {

        return id;
    }

    public void setId(Long id) {

        this.id=id;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name=name;
    }

    public Address getAddress()
    {
        return address;
    }

    public void setAddress(Address address) {
        this.address=address;
    }

    @Override
    public boolean equals(Object o) {




        Boolean ans = true;

        if (o == this) {
            ans= true;
        }

       else if (o == null || getClass() != o.getClass()) {
            return false;



        }
 return ans;
    }

    @Override

    public String toString() {

        //"Address{addressLine1='', addressLine2='', city='', state='', zipcode=''}";

        String newString = "";
        Address ad = new Address();


        newString = String.format("Person{id=" + this.id +
                ", name='" + this.name + "', address=" + this.address + "}");


        return newString;
    }



    }