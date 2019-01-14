package models;

import dao.DaoProduct;

import java.util.ArrayList;
import java.util.Objects;

public class PointOfSale {

    private long id;
    private long addressId;
    private String name;
    private ArrayList<Product> products;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getAddressId() {
        return addressId;
    }

    public void setAddressId(long addressId) {
        this.addressId = addressId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Product> getProducts() {
        return DaoProduct.getProdByPointId(this.getId());
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public PointOfSale(long addressId, String name) {
        this.addressId = addressId;
        this.name = name;
    }

    public PointOfSale(long id, long addressId, String name) {
        this.id = id;
        this.addressId = addressId;
        this.name = name;
    }

    public PointOfSale() {
    }

    @Override
    public String toString() {
        return "PointOfSale{" +
                "id=" + id +
                ", addressId=" + addressId +
                ", name='" + name + '\'' +
                ", products=" + getProducts() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PointOfSale)) return false;
        PointOfSale that = (PointOfSale) o;
        return getId() == that.getId() &&
                getAddressId() == that.getAddressId() &&
                Objects.equals(getName(), that.getName()) &&
                Objects.equals(getProducts(), that.getProducts());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getAddressId(), getName(), getProducts());
    }
}
