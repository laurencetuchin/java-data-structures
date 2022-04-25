package Library;

import java.util.Objects;

public class Book {
    private String name;
    private String content;
    private int published;

    public Book(String name, String content, int published) {
        this.name = name;
        this.content = content;
        this.published = published;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getPublished() {
        return published;
    }

    public void setPublished(int published) {
        this.published = published;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(name, book.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

//    public int hashCode() {
//        if(this.name ==null)
//
//    {
//        return this.published;
//    }
//        return this.published +this.name.hashCode();
//}


}
