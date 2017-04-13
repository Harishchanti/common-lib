package com.ailiens.optimusprime.autobots.rest.dto;

import java.util.ArrayList;
import java.util.List;

public class SortedReturnsDTO {

    public SortedReturnsDTO()
    {
        this.open = new ArrayList<String>();
        this.close = new ArrayList<String>();
        this.all = new ArrayList<String>();
    }

    private List<String> open;
    private List<String> close;
    private List<String> all;

    public List<String> getOpen() {
        return open;
    }

    public void setOpen(List<String> open) {
        this.open = open;
    }

    public List<String> getClose() {
        return close;
    }

    public void setClose(List<String> close) {
        this.close = close;
    }

    public List<String> getAll() {
        return all;
    }

    public void setAll(List<String> all) {
        this.all = all;
    }
}
