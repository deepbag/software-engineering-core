package javas.ObjectOriented.Encapsulation.AadharCard;

public class AadharCard {
    private String name;
    private String aadharNumber;
    private String phone;
    private String address;
    private String dateOfBirth;

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getAadharNumber(){
        return this.aadharNumber;
    }

    public void setAadharNumber(String aadharNumber){
        this.aadharNumber = aadharNumber;
    }

    public String getPhone(){
        return this.phone;
    }

    public void setPhone(String phone){
        this.phone = phone;
    }

    public String getAddress(){
        return this.address;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public String getDateOfBirth(){
        return this.dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }

    public void display(){
        System.out.println("Name: "+this.name);
        System.out.println("Aadhar: "+this.aadharNumber);
        System.out.println("Phone: "+this.phone);
        System.out.println("Address: "+this.address);
        System.out.println("Date of Birth: "+this.dateOfBirth);
        System.out.println("Is Valid Aadhar: "+(this.isValidAadharCard()?"Yes":"No"));
    }



    public boolean isValidAadharCard(){
        return this.aadharNumber != null && this.aadharNumber.length() != 12 ? false:true;
    }
}
