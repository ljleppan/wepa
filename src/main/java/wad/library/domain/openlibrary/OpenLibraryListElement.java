package wad.library.domain.openlibrary;


public class OpenLibraryListElement {
    private String name;
    private String url;
    
    @Override
    public String toString(){
       return "[name: "+this.name+" | "+"url: "+this.url+"]";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
