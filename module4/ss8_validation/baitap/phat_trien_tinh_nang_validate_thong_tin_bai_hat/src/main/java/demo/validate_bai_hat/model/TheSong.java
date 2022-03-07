package demo.validate_bai_hat.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
public class TheSong {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotEmpty(message = "Khong duoc de trong")
    @Size(max = 800, message = "Do dai nho hon 800 ky tu")
    @Pattern(regexp = "^[a-zA-Z0-9 ]*$", message = "Ten bai hat khong chua cac ky tu dac biet")
    private String name;
    @NotEmpty(message = "Khong duoc de trong")
    @Size(max = 300, message = "Do dai nho hon 300 ky tu")
    @Pattern(regexp = "^[a-zA-Z0-9 ]*$", message = "Ten nghe sy khong chua cac ky tu dac biet")
    private String artist;
    @NotEmpty(message = "Khong duoc de trong")
    @Size(max = 1000, message = "Do dai nho hon 1000 ky tu")
    @Pattern(regexp = "^[a-zA-Z0-9, ]*$", message = "Ten the loai khong chua cac ky tu dac biet")
    private String type;

    public TheSong() {
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

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
