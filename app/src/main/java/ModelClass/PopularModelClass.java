package ModelClass;

/**
 * Created by wolfsoft5 on 23/1/19.
 */

public class PopularModelClass {

    Integer image;
    String title;

    public PopularModelClass(Integer image, String title) {
        this.image = image;
        this.title = title;
    }

    public Integer getImage() {
        return image;
    }

    public void setImage(Integer image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
