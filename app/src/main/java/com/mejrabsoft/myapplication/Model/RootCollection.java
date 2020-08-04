package com.mejrabsoft.myapplication.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class RootCollection {

    @SerializedName("collections")
    @Expose
    private List<Collection> collections = null;
    @SerializedName("has_more")
    @Expose
    private Integer hasMore;
    @SerializedName("share_url")
    @Expose
    private String shareUrl;
    @SerializedName("display_text")
    @Expose
    private String displayText;
    @SerializedName("has_total")
    @Expose
    private Integer hasTotal;
    @SerializedName("user_has_addresses")
    @Expose
    private Boolean userHasAddresses;

    public List<Collection> getCollections() {
        return collections;
    }

    public void setCollections(List<Collection> collections) {
        this.collections = collections;
    }

    public Integer getHasMore() {
        return hasMore;
    }

    public void setHasMore(Integer hasMore) {
        this.hasMore = hasMore;
    }

    public String getShareUrl() {
        return shareUrl;
    }

    public void setShareUrl(String shareUrl) {
        this.shareUrl = shareUrl;
    }

    public String getDisplayText() {
        return displayText;
    }

    public void setDisplayText(String displayText) {
        this.displayText = displayText;
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





    public class Collection {

        @SerializedName("collection")
        @Expose
        private Collection_ collection;

        public Collection_ getCollection() {
            return collection;
        }

        public void setCollection(Collection_ collection) {
            this.collection = collection;
        }

    }


    public class Collection_ {

        @SerializedName("collection_id")
        @Expose
        private Integer collectionId;
        @SerializedName("res_count")
        @Expose
        private Integer resCount;
        @SerializedName("image_url")
        @Expose
        private String imageUrl;
        @SerializedName("url")
        @Expose
        private String url;
        @SerializedName("title")
        @Expose
        private String title;
        @SerializedName("description")
        @Expose
        private String description;
        @SerializedName("share_url")
        @Expose
        private String shareUrl;

        public Integer getCollectionId() {
            return collectionId;
        }

        public void setCollectionId(Integer collectionId) {
            this.collectionId = collectionId;
        }

        public Integer getResCount() {
            return resCount;
        }

        public void setResCount(Integer resCount) {
            this.resCount = resCount;
        }

        public String getImageUrl() {
            return imageUrl;
        }

        public void setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getShareUrl() {
            return shareUrl;
        }

        public void setShareUrl(String shareUrl) {
            this.shareUrl = shareUrl;
        }

    }


}
