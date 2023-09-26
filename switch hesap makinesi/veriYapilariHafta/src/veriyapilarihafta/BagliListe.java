package veriyapilarihafta;

class Dugum {

    int no;
    String isim;
    Dugum ileri;

    public Dugum(int no, String isim) {
        this.no = no;
        this.isim = isim;
        ileri = null;
    }
}

public class BagliListe {

    Dugum bas, son;

    public BagliListe() {
        bas = null;
    }

    void basaEkle(Dugum yeni) {
        if (bas == null) {
            bas = yeni;
        } else {
            yeni.ileri = bas;
            bas = yeni;
        }
    }

    void sonaEkle(Dugum yeni) {
        if (bas == null) {
            bas = yeni;
        } else {
            Dugum tmp = bas;
            while (tmp.ileri != null) {
                tmp = tmp.ileri;
            }
            tmp.ileri = yeni;
        }
    }

    void siraliEkleme(Dugum yeni) {
        Dugum tmp = null;
        if (bas == null || bas.no >= yeni.no) {
            bas = yeni;
        } else {
            tmp = bas;
            while (tmp.ileri != null && tmp.ileri.no < yeni.no) {
                tmp = tmp.ileri;
            }

            yeni.ileri = tmp.ileri;
            tmp.ileri = yeni;
        }
    }

    void BastanSil() {
        if (bas != null) {
            bas = bas.ileri;
        }
    }

    void sil(int no) {
        Dugum tmp = bas;
        Dugum once = null;
if(tmp!= )
    }

    public static void main(String[] args) {

    }

}
