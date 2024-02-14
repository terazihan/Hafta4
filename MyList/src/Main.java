public class Main {
    public static void main(String[] args) {
        // MyList sınıfını Integer tipi ile test etmek
        MyList<Integer> liste = new MyList<>();
        System.out.println("Liste Durumu (Boş mu?): " + (liste.isEmpty() ? "Evet" : "Hayır"));
        System.out.println("Başlangıç Kapasitesi: " + liste.getCapacity());

        // Eleman Ekleme
        liste.add(10);
        liste.add(20);
        liste.add(30);
        liste.add(40);
        liste.add(50);
        liste.add(60);
        liste.add(70);
        liste.add(80);
        liste.add(90);
        liste.add(100); // Bu noktada kapasite artacak

        System.out.println("Dizideki Eleman Sayısı: " + liste.size());
        System.out.println("Dizinin Kapasitesi: " + liste.getCapacity());
        System.out.println("Liste: " + liste.toString());

        // Eleman Çıkarma ve Güncelleme
        liste.remove(0); // 10'u siler
        liste.set(1, 200); // 30 yerine 200 koyar

        // Ara işlemler
        System.out.println("2. İndisteki Eleman: " + liste.get(2));
        System.out.println("20'nin İndeksi: " + liste.indexOf(20));
        System.out.println("200'nin Son İndeksi: " + liste.lastIndexOf(200));
        System.out.println("Liste: " + liste.toString());

        // Alt Liste Oluşturma
        MyList<Integer> altListe = liste.subList(2, 5);
        System.out.println("Alt Liste: " + altListe.toString());

        // Diziye Dönüştürme
        Integer[] dizi = liste.toArray();
        System.out.println("Dizinin ilk elemanı: " + dizi[0]);

        // Listeyi Temizleme
        liste.clear();
        System.out.println("Liste Temizlendi. Yeni Durum: " + liste.toString());
    }
}