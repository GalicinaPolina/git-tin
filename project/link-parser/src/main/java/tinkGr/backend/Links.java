package tinkGr.backend;

public sealed interface Links permits GitHubURL, StackOverflowURL {
    default String getData(String URL){
        return "null";
    }
}