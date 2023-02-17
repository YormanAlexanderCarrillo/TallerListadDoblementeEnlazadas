package co.edu.uptc.Model;

public class VideoBeam {
    private int id;
    private String brand;
    private String model;
    private int Size;
    private boolean ambientLight;
    private boolean autoFocus;

    public VideoBeam(int id,String brand, String model, int size,  boolean ambientLight, boolean autoFocus) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.Size = size;
        this.ambientLight = ambientLight;
        this.autoFocus = autoFocus;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSize() {
        return Size;
    }

    public void setSize(int size) {
        Size = size;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isAmbientLight() {
        return ambientLight;
    }

    public void setAmbientLight(boolean ambientLight) {
        this.ambientLight = ambientLight;
    }

    public boolean isAutoFocus() {
        return autoFocus;
    }

    public void setAutoFocus(boolean autoFocus) {
        this.autoFocus = autoFocus;
    }

    @Override
    public String toString() {
        return "VideoBeam{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", Size=" + Size +
                ", ambientLight=" + ambientLight +
                ", autoFocus=" + autoFocus +
                '}';
    }
}
