package com.mejrabsoft.myapplication.Model;

import java.util.List;

public class GetCategory {
    List<MainCategory> categories;

    public List<MainCategory> getCategories() {
        return categories;
    }

    public void setCategories(List<MainCategory> categories) {
        this.categories = categories;
    }

    public class MainCategory {
        public categories categories;

    }


    public class categories {
        public String id;
        public String name;
    }
}
