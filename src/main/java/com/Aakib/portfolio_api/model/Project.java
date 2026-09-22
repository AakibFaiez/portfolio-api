package com.Aakib.portfolio_api.model;

public class Project {
    private String title;
    private String description;
    private String techStack;
    private String link;

    public Project(String title,String description,String techStack,String link){
        this.title=title;
        this.description=description;
        this.techStack=techStack;
        this.link=link;
    }

    public String getTitle() {
        return title;
    }
    public String getDescription(){
        return description;
    }
    public String getTechStack(){
        return techStack;
    }
    public String getLink(){
        return link;
    }
}
