package com.WebProject.SPACEbar.service;

import lombok.Getter;

@Getter
public class BbsParamService {

    private String choice;
    private String search;

    public BbsParamService(){
    }

    public BbsParamService(String choice, String search){
        this.choice = choice;
        this.search = search;
    }

    public void setChoice(String choice){
        this.choice = choice;
    }

    public void setSearch(String search){
        this.search = search;
    }

    @Override
    public String toString(){
        return "BbsParam{" +
                "choice='" + choice + '\'' +
                ", search='" + search + '\'' +
                '}';
    }
}
