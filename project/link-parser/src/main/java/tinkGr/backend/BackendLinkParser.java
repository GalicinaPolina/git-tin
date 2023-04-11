package tinkGr.backend;
import dto.*;
import reactor.core.publisher.Mono;

import java.net.URISyntaxException;
public record BackendLinkParser(String URL) {
    public String getData(){
        if (!(URL.contains("https://github.com/") || URL.contains("https://stackoverflow.com/questions/"))){
            return "null";
        }
        else {
            Links[] links = {new StackOverflowURL(), new GitHubURL()};
            int link_type = URL.contains("https://github.com/") ? 1:0;
            return links[link_type].getData(URL);
        }
    }
    private int countSymbols(String a, String b) {
        int i = a.length() - a.replace(b, "").length();
        return i;
    }
}
