package me.armbrust.maptest;

import com.google.android.gms.maps.model.LatLng;
import com.google.maps.android.clustering.ClusterItem;

public class MarkerItem implements ClusterItem {

    private final LatLng position;
    private final String title;
    private final String description;

    public MarkerItem(LatLng position, String title, String description) {
        this.position = position;
        this.title = title;
        this.description = description;
    }

    @Override
    public LatLng getPosition() {
        return this.position;
    }

    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public String getSnippet() {
        return this.description;
    }
}
