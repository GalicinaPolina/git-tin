package tinkGr.backend;

public final class GitHubURL implements Links {
    public String getData(String URL){
        String[] splitedURL = URL.split("/");
        String fback = "Name: "+splitedURL[3]+" Repo: "+splitedURL[4];
        return fback;
    }
}