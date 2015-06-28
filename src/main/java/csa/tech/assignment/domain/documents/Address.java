package csa.tech.assignment.domain.documents;

public class Address {

    private String aptNumber;

    private String street;

    private String city;

    private String postCode;

    public String getAptNumber() {
        return aptNumber;
    }

    public void setAptNumber(String aptNumber) {
        this.aptNumber = aptNumber;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((aptNumber == null) ? 0 : aptNumber.hashCode());
        result = prime * result + ((city == null) ? 0 : city.hashCode());
        result = prime * result + ((postCode == null) ? 0 : postCode.hashCode());
        result = prime * result + ((street == null) ? 0 : street.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        Address other = (Address) obj;
        if (aptNumber == null) {
            if (other.aptNumber != null) return false;
        } else if (!aptNumber.equals(other.aptNumber)) return false;
        if (city == null) {
            if (other.city != null) return false;
        } else if (!city.equals(other.city)) return false;
        if (postCode == null) {
            if (other.postCode != null) return false;
        } else if (!postCode.equals(other.postCode)) return false;
        if (street == null) {
            if (other.street != null) return false;
        } else if (!street.equals(other.street)) return false;
        return true;
    }

    @Override
    public String toString() {
        return String.format("Address [aptNumber=%s, street=%s, city=%s, postCode=%s]", aptNumber, street, city,
                postCode);
    }
    
}
