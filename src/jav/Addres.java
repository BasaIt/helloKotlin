package jav;

import java.util.Objects;

public class Addres {
    private String city;
    private String street ;
    private String numberOfHouse;

    public Addres(String city, String street, String numberOfHouse) {
        this.city = city;
        this.street = street;
        this.numberOfHouse = numberOfHouse;
    }
    private String getCity(){
        return city;
    }
    private String getStreet(){
        return street;
    }
    private String getNumberOfHouse(){
        return numberOfHouse;
    }
    private void setCity(String city){
        this.city = city;
    }
    private void setStreet(String street){
        this.street = street;
    }
    private void setNumberOfHouse(String numberOfHouse){
        this.numberOfHouse = numberOfHouse;
    }

//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj){
//            return true;
//        }
//        if (hashCode() != obj.hashCode()){
//            return false;
//        }
//        if (obj instanceof Addres){
//        Addres addres = (Addres)obj;
//        return (this.city == addres.city) && (this.street == addres.street) && (this.numberOfHouse == addres.numberOfHouse);
//        }else {
//            return false;
//        }
//    }

//    @Override
//    public int hashCode() {
//        return city.hashCode()+street.hashCode()+numberOfHouse.hashCode();
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Addres addres = (Addres) o;
        return Objects.equals(city, addres.city) && Objects.equals(street, addres.street) && Objects.equals(numberOfHouse, addres.numberOfHouse);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, street, numberOfHouse);
    }
}
