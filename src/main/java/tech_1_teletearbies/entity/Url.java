package tech_1_teletearbies.entity;

import javax.persistence.*;

@Entity
@Table(name = "url")
public class Url {

    @Id
    //to auto generate and make unique
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    // each variable makes a column
    @Column(nullable = false, unique = false, length = 255, name = "description")
    private String description;
    @Column(nullable = false, unique = false, length = 255, name = "url_path")
    private String url;

 public Url(){}

    public Url(String description, String url) {
        this.description = description;
        this.url = url;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}





