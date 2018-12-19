package models;

import java.util.Objects;

public class Address {

    private long id;
    private String country;
    private String region;
    private String city;
    private String district;
    private String street;
    private String houseNumb;
    private String index;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouseNumb() {
        return houseNumb;
    }

    public void setHouseNumb(String houseNumb) {
        this.houseNumb = houseNumb;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public Address() {
    }

    public Address(String country, String region, String city, String district, String street, String houseNumb, String index) {
        this.country = country;
        this.region = region;
        this.city = city;
        this.district = district;
        this.street = street;
        this.houseNumb = houseNumb;
        this.index = index;
    }

    public Address(long id, String country, String region, String city, String district, String street, String houseNumb, String index) {
        this.id = id;
        this.country = country;
        this.region = region;
        this.city = city;
        this.district = district;
        this.street = street;
        this.houseNumb = houseNumb;
        this.index = index;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", country='" + country + '\'' +
                ", region='" + region + '\'' +
                ", city='" + city + '\'' +
                ", district='" + district + '\'' +
                ", street='" + street + '\'' +
                ", houseNumb='" + houseNumb + '\'' +
                ", index='" + index + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Address)) return false;
        Address address = (Address) o;
        return id == address.id &&
                Objects.equals(country, address.country) &&
                Objects.equals(region, address.region) &&
                Objects.equals(city, address.city) &&
                Objects.equals(district, address.district) &&
                Objects.equals(street, address.street) &&
                Objects.equals(houseNumb, address.houseNumb) &&
                Objects.equals(index, address.index);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, country, region, city, district, street, houseNumb, index);
    }
}