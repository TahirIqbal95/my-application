package com.mejrabsoft.myapplication.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.mejrabsoft.myapplication.Model.GetCategory;

import java.util.List;

public class CollectionNew {

    //Test Collection class not use// only test purpose;

    List<CollectionList> collections;

    public List<CollectionList> getCollections() {
        return collections;
    }

    public void setCollections(List<CollectionList> collections) {
        this.collections = collections;
    }

    public class CollectionList {
        public CollectionObject collection;

    }


    public class CollectionObject {

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

