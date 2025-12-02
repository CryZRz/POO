public class AlarmaDeBarcos {
    public static void main(String[] args) {
        Barco[] bs = new Barco[3];
        DeVapor mss = new DeVapor();
        Velero vss = new Velero();
        Guerra guerra = new Guerra();
        bs[0] = mss;
        bs[1] = vss;
        bs[2] = guerra;
        for (int i = 0; i < bs.length; i++) {
            bs[i].alarma();
        }
    }
}
