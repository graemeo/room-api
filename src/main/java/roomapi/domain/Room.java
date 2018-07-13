package roomapi.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;

public class Room
{
    private RoomType roomType;
    private String description;
    private int minimumPax;
    private int maximumPax;

    @JsonIgnore
    private List<Feature> features;


    public RoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getMinimumPax() {
        return minimumPax;
    }

    public void setMinimumPax(int minimumPax) {
        this.minimumPax = minimumPax;
    }

    public int getMaximumPax() {
        return maximumPax;
    }

    public void setMaximumPax(int maximumPax) {
        this.maximumPax = maximumPax;
    }

    public List<Feature> getFeatures() {
        return features;
    }

    public void setFeatures(List<Feature> features) {
        this.features = features;
    }

}
