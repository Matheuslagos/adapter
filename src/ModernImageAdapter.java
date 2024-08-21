public class ModernImageAdapter implements LegacyImageLibrary {
    private ModernImageLibrary modernImageLibrary;

    public ModernImageAdapter() {
        this.modernImageLibrary = new ModernImageLibrary();
    }

    @Override
    public void loadFile(String filename) {
        
        modernImageLibrary.load(filename);
    }

    @Override
    public void displayImage() {
        
        modernImageLibrary.render();
    }
}
