package com.company.iterator;

import java.util.ArrayList;
import java.util.List;

public class BrowseHistory {

    private List<String> urls = new ArrayList<>();

    public void push(String url){
        urls.add(url);
    }

    public String pop(){
        var lastIndex = urls.size() - 1;
        var lastItem = urls.get(lastIndex);
        urls.remove(lastItem);

        return lastItem;
    }

    public Iterator<String> createIterator(){
        return new ListIterator(this);
    }

//    public void setUrls(List<String> urls) {
//        this.urls = urls;
//    }

    public class ListIterator implements Iterator<String>{
        private BrowseHistory history;
        int lastIndex;

        public ListIterator(BrowseHistory history){
            this.history = history;
        }

        @Override
        public Boolean hasNext() {
            return lastIndex < urls.size();
        }

        @Override
        public String current() {
            return urls.get(lastIndex);
        }

        @Override
        public void next() {
            lastIndex++;
        }
    }
}
