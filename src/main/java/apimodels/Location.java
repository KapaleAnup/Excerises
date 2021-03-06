package apimodels;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Location {

    private String postcode;
    private String country;
    private String countryAbbreviation;
    List<Place> places;

    @JsonProperty("post code")
    public String getPostcode() {
        return postcode;
    }
    @JsonProperty("post code")
    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @JsonProperty("country abbreviation")
    public String getCountryAbbreviation() {
        return countryAbbreviation;
    }

    @JsonProperty("country abbreviation")
    public void setCountryAbbreviation(String countryAbbreviation) {
        this.countryAbbreviation = countryAbbreviation;
    }

    public List<Place> getPlaces() {
        return places;
    }

    public void setPlaces(List<Place> places) {
        this.places = places;
    }
}
