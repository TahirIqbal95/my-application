package com.mejrabsoft.myapplication.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GetCities {


    @SerializedName("location_suggestions")
    @Expose
    private List<LocationSuggestion> locationSuggestions = null;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("has_more")
    @Expose
    private Integer hasMore;
    @SerializedName("has_total")
    @Expose
    private Integer hasTotal;
    @SerializedName("user_has_addresses")
    @Expose
    private Boolean userHasAddresses;

    public List<LocationSuggestion> getLocationSuggestions() {
        return locationSuggestions;
    }

    public void setLocationSuggestions(List<LocationSuggestion> locationSuggestions) {
        this.locationSuggestions = locationSuggestions;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getHasMore() {
        return hasMore;
    }

    public void setHasMore(Integer hasMore) {
        this.hasMore = hasMore;
    }

    public Integer getHasTotal() {
        return hasTotal;
    }

    public void setHasTotal(Integer hasTotal) {
        this.hasTotal = hasTotal;
    }

    public Boolean getUserHasAddresses() {
        return userHasAddresses;
    }

    public void setUserHasAddresses(Boolean userHasAddresses) {
        this.userHasAddresses = userHasAddresses;
    }


    public class LocationSuggestion {

        @SerializedName("id")
        @Expose
        private Integer id;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("country_id")
        @Expose
        private Integer countryId;
        @SerializedName("country_name")
        @Expose
        private String countryName;
        @SerializedName("country_flag_url")
        @Expose
        private String countryFlagUrl;
        @SerializedName("should_experiment_with")
        @Expose
        private Integer shouldExperimentWith;
        @SerializedName("has_go_out_tab")
        @Expose
        private Integer hasGoOutTab;
        @SerializedName("discovery_enabled")
        @Expose
        private Integer discoveryEnabled;
        @SerializedName("has_new_ad_format")
        @Expose
        private Integer hasNewAdFormat;
        @SerializedName("is_state")
        @Expose
        private Integer isState;
        @SerializedName("state_id")
        @Expose
        private Integer stateId;
        @SerializedName("state_name")
        @Expose
        private String stateName;
        @SerializedName("state_code")
        @Expose
        private String stateCode;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getCountryId() {
            return countryId;
        }

        public void setCountryId(Integer countryId) {
            this.countryId = countryId;
        }

        public String getCountryName() {
            return countryName;
        }

        public void setCountryName(String countryName) {
            this.countryName = countryName;
        }

        public String getCountryFlagUrl() {
            return countryFlagUrl;
        }

        public void setCountryFlagUrl(String countryFlagUrl) {
            this.countryFlagUrl = countryFlagUrl;
        }

        public Integer getShouldExperimentWith() {
            return shouldExperimentWith;
        }

        public void setShouldExperimentWith(Integer shouldExperimentWith) {
            this.shouldExperimentWith = shouldExperimentWith;
        }

        public Integer getHasGoOutTab() {
            return hasGoOutTab;
        }

        public void setHasGoOutTab(Integer hasGoOutTab) {
            this.hasGoOutTab = hasGoOutTab;
        }

        public Integer getDiscoveryEnabled() {
            return discoveryEnabled;
        }

        public void setDiscoveryEnabled(Integer discoveryEnabled) {
            this.discoveryEnabled = discoveryEnabled;
        }

        public Integer getHasNewAdFormat() {
            return hasNewAdFormat;
        }

        public void setHasNewAdFormat(Integer hasNewAdFormat) {
            this.hasNewAdFormat = hasNewAdFormat;
        }

        public Integer getIsState() {
            return isState;
        }

        public void setIsState(Integer isState) {
            this.isState = isState;
        }

        public Integer getStateId() {
            return stateId;
        }

        public void setStateId(Integer stateId) {
            this.stateId = stateId;
        }

        public String getStateName() {
            return stateName;
        }

        public void setStateName(String stateName) {
            this.stateName = stateName;
        }

        public String getStateCode() {
            return stateCode;
        }

        public void setStateCode(String stateCode) {
            this.stateCode = stateCode;
        }


    }
}
