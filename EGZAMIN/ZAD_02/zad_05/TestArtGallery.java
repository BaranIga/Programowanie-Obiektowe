package zad_05;

public class TestArtGallery {
    public static void main(String[] args) {
        ArtGallery gallery1 = ArtGallery.getInstance("Galeria Sztuki A");
        ArtGallery gallery2 = ArtGallery.getInstance("Galeria Sztuki B");

        System.out.println("Czy oba obiekty są tą samą instancją? " + (gallery1 == gallery2));

        System.out.println("Nazwa galerii: " + gallery1.getName());
    }
}
