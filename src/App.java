public class App {
    public static void main(String[] args) {
        LegacyImageLibrary adapter = new ModernImageAdapter();
        adapter.loadFile("example.jpg");
        adapter.displayImage();
    }
}
