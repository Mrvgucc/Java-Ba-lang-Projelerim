package agaclar;

class dugum {

    int icerik;
    dugum sol, sag;

    public dugum(int icerik) {
        this.icerik = icerik;
        sol = null;
        sag = null;

    }
}

class agac {

    dugum kok;

    public agac() {
        kok = null;
    }

    public void elemanEkle(dugum yeni) {
        dugum once = null;
        dugum tmp = kok;
        while (tmp != null) {
            once = tmp;
            if (yeni.icerik < tmp.icerik) {
                tmp = tmp.sol;
            } else {
                tmp = tmp.sag;
            }

        }
        if (once == null) {
            kok = yeni;
        }
    }

    public boolean arama(int eleman) {
        dugum d;
        d = kok;
        while (d != null) {
            if (d.icerik == eleman) {
                return true;
            } else if (d.icerik > eleman) {
                d = d.sol;
            } else {
                d = d.sag;
            }
        }
        return false;

    }
}
    public class Agaclar {

        public static void main(String[] args) {

        }

    }

