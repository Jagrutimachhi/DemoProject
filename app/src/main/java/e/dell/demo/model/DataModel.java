package e.dell.demo.model;

public class DataModel {

    private String Imagetext;
    private int imageview;

    public DataModel(String imagetext, int imageview) {
        Imagetext = imagetext;
        this.imageview = imageview;
    }
    public String getImagetext() {
        return Imagetext;
    }
    public int getImageview() {
        return imageview;
    }
    public void setImagetext(String imagetext) {
        Imagetext = imagetext;
    }
    public void setImageview(int imageview) {
        this.imageview = imageview;
    }

}
