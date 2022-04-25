package entity;

import javax.persistence.*;

@Entity
@Table(name = "images")
public class Image {

    @Id
    //to auto generate and make unique
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    // each variable makes a column
    @Column(nullable = false, unique = false, length = 45, name = "name")
    private String name;

    @Column(nullable = false, unique = false, length = 45, name = "url")
    private String url;


    public Image() {
    }

    public Image(Integer id, String name, String url) {
        this.id = id;
        this.name = name;
        this.url = url;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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





