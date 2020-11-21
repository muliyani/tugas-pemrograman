package simple.example.hewanpedia;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import simple.example.hewanpedia.model.Anjing;
import simple.example.hewanpedia.model.Hewan;
import simple.example.hewanpedia.model.Kucing;
import simple.example.hewanpedia.model.Burung;


public class DataProvider {
    private static List<Hewan> hewans = new ArrayList<>();

    private static List<Kucing> initDataKucing(Context ctx) {
        List<Kucing> kucings = new ArrayList<>();
        kucings.add(new Kucing("Angora", "Turki",
                "Aslinya berasal dari Ankara, Turki dengan ciri khas berbulu panjang dan lembut", R.drawable.cat_angora));
        kucings.add(new Kucing("Bengal", "Inggris",
                "Merupakan hasil persilangan antara Kucing Leopard Asia dengan kucing domestik Inggris", R.drawable.cat_bengal));
        kucings.add(new Kucing("Birmani", "Birma/Myanmar",
                "Konon awalnya merupakan ras kucing yand biasa menemani para biksu yang menetap pada kuil di Birma", R.drawable.cat_birman));
        kucings.add(new Kucing("Persia", "Iran",
                "Kucing berbulu panjang dengan wajah bundar dan hidung pesek. Awalnya berasal dari Iran kemudian diimpor ke Italia", R.drawable.cat_persia));
        kucings.add(new Kucing("Siam", "Thailand",
                "Kucing hasil turunan dari Wichian Maat (Kucing Thailand) dengan ciri khas berbadan panjang dan langsing, wajah lonjong, telinga lebar, dan mata kebiruan", R.drawable.cat_siam));
        kucings.add(new Kucing("Siberia", "Rusia",
                "Kucing domestik Rusia dengan bulu lebat dan badan besar tapi sangat lincah dan terkenal dengan kemampuan melompatnya ", R.drawable.cat_siberian));
        return kucings;
    }

    private static List<Anjing> initDataAnjing(Context ctx) {
        List<Anjing> anjings = new ArrayList<>();
        anjings.add(new Anjing("Bulldog", "Inggris",
                "Anjing populer yang dikenal dengan badan yang gemuk berotot, wajah seperti kain kusut, dan hidung yang pesek", R.drawable.dog_bulldog));
        anjings.add(new Anjing("Husky", "Alaska,Siberia,Finlandia (daerah bersalju) ",
                "Anjing jenis khusus yang awalnya digunakan untuk menarik kereta salju", R.drawable.dog_husky));
        anjings.add(new Anjing("Kintamani", "Indonesia",
                "Ras anjing asli pulau Bali ", R.drawable.dog_kintamani));
        anjings.add(new Anjing("Samoyed", "Rusia",
                "Anjing yang berasal dari Siberia yang awalnya biasa digunakan untuk menjaga ternak oleh suku Samoyed", R.drawable.dog_samoyed));
        anjings.add(new Anjing("Shepherd", "Jerman",
                "Anjing pintar dan kuat, sekarang banyak digunakan sebagai anjing penjaga, pengawal, dan anjing polisi (K9)", R.drawable.dog_shepherd));
        anjings.add(new Anjing("Shiba", "Jepang",
                "Anjing dari daerah Shiba ini gesit dan lincah sehingga awalnya banyak digunakan untuk berburu ", R.drawable.dog_shiba));
        return anjings;
    }
    private static List<Burung> initDataBurung(Context ctx) {
        List<Burung> burungs = new ArrayList<>();
        burungs.add(new Burung("branjangan", "asia tenggara",
                " burung pengicau (passeriformes) yang termasuk kedalam famili alaudidae, burung ini mendiami padang rumput di sebagian besar Australia dan sebagian besar Asia Tenggara. Burung branjangan berwarna coklat dengan garis-garis abu-abu dan bintik-bintik.", R.drawable.burungbranjangan));
        burungs.add(new Burung("decu", "Indonesia ",
                "Burung ini berukuran 13 cm, berwarna hitam dan putih. Jantan berwarna hitam seluruhnya kecuali garis putih mencolok pada sayap, tungging, perut bagian bawah, dan tunggir yang berwarna putih", R.drawable.burung_decu));
        burungs.add(new Burung("tledekan", "Indonesia",
                "Burung ini berukuran 14 sampai 15 cm dengan berat sekitar 12,5 sampai 18 gram namun untuk ras filipina memiliki berat sekitar 16,8 sampai 22 gram., berwarna biru, jingga, dan putih", R.drawable.burung_tledekan));
        burungs.add(new Burung("trucuk", "indonesia",
                "Mahkota cokelat gelap kehitaman, alis dan sekitar mata putih, dengan kekang (garis di depan mata) hitam. Sisi atas tubuh (punggung, ekor) berwarna coklat, sisi bawah (tenggorokan, dada dan perut) putih.", R.drawable.burung_trucuk));
        burungs.add(new Burung("wiwik", "bali/sumatra",
                "Burung muda berwarna burik; kecoklatan dengan garis-garis hitam di sisi atas tubuh, dan keputihan dengan garis-garis hitam yang lebih halus", R.drawable.burung_wiwik));
        burungs.add(new Burung("kutilang", "indonesia",
                "Burung yang berukuran sedang, panjang tubuh total (diukur dari ujung paruh hingga ujung ekor) sekitar 20 cm.\n" +
                        "\n" +
                        "Sisi atas tubuh (punggung, ekor) berwarna coklat kelabu, sisi bawah (tenggorokan, leher, dada dan perut) putih keabu-abuan. Bagian atas kepala, mulai dari dahi, topi dan jambul, berwarna hitam. Tungging (di muka ekor) tampak jelas berwarna putih, serta penutup pantat berwarna jingga", R.drawable.burung_kutilang));
        return burungs;
    }

    private static void initAllHewans(Context ctx) {
        hewans.addAll(initDataKucing(ctx));
        hewans.addAll(initDataAnjing(ctx));
        hewans.addAll(initDataBurung(ctx));
    }

    public static List<Hewan> getAllHewan(Context ctx) {
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        return  hewans;
    }

    public static List<Hewan> getHewansByTipe(Context ctx, String jenis) {
        List<Hewan> hewansByType = new ArrayList<>();
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        for (Hewan h : hewans) {
            if (h.getJenis().equals(jenis)) {
                hewansByType.add(h);
            }
        }
        return hewansByType;
    }

}
