public class LegacyImage implements LegacyImageLibrary {
    
    
    public void loadFile(String filename) {
        System.out.println("Image loaded from file: " + filename);
    }
    
    
    public void displayImage() {
        System.out.println("Image displayed.");
    }
    
}
