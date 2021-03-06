package com.ailiens.optimusprime.autobots.web.rest.n3ow.dto.returnDetailsDTO;

public class ImageDTO {

    private String imageLink;
    private String fcId;

    public String getImageLink() {
        return imageLink;
    }

    public void setImageLink(String imageLink) {
        this.imageLink = imageLink;
    }

    public String getFcId() {
        return fcId;
    }

    public void setFcId(String fcId) {
        this.fcId = fcId;
    }

    @Override
    public String toString() {
        return "ImageDTO{" +
            "imageLink='" + imageLink + '\'' +
            ", fcId='" + fcId + '\'' +
            '}';
    }

    public ImageDTO() {
    }
}
