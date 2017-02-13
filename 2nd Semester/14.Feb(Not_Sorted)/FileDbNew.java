import java.util.ArrayList;

public class FileDbNew implements Db {

    ArrayList data = new ArrayList();

    @Override
    public void save(Object obj) throws DbException {
        data.add(obj);
    }

    @Override
    public Object[] findAll() throws DbException {
        return data.toArray();
    }
}
