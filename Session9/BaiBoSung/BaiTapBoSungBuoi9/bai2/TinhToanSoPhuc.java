package bai2;

public class TinhToanSoPhuc implements ISoPhuc {

    private static TinhToanSoPhuc instance = null;

    private TinhToanSoPhuc() {
        super();
    }

    public synchronized static TinhToanSoPhuc getInstance() {
        if (instance == null) {
            instance = new TinhToanSoPhuc();
        }
        return instance;
    }

    @Override
    public SoPhuc cong(SoPhuc... args) {
        if (args.length == 0) return null;
        SoPhuc tmp = new SoPhuc(args[0].getPhanThuc(), args[0].getPhanAo());
        for (int i = 1; i < args.length; i++) {
            tmp = tmp.cong(args[i]);
        }
        return tmp;
    }

    @Override
    public SoPhuc tru(SoPhuc... args) {
        if (args.length == 0) return null;
        SoPhuc tmp = new SoPhuc(args[0].getPhanThuc(), args[0].getPhanAo());
        for (int i = 1; i < args.length; i++) {
            tmp = tmp.tru(args[i]);
        }
        return tmp;
    }

    @Override
    public SoPhuc nhan(SoPhuc... args) {
        if (args.length == 0) return null;
        SoPhuc tmp = new SoPhuc(args[0].getPhanThuc(), args[0].getPhanAo());
        for (int i = 1; i < args.length; i++) {
            tmp = tmp.nhan(args[i]);
        }
        return tmp;
    }

    @Override
    public SoPhuc chia(SoPhuc... args) {
        if (args.length == 0) return null;
        SoPhuc tmp = new SoPhuc(args[0].getPhanThuc(), args[0].getPhanAo());
        for (int i = 1; i < args.length; i++) {
            tmp = tmp.chia(args[i]);
        }
        return tmp;
    }
}
