import java.lang.reflect.Type;
import java.util.List;
import java.sql.SQLException;
import java.util.List;
/**
 * @Author Ivan Cerros Brioso
 * */
public interface DAO<T> {
    public List<T> getByNombre(String nombre) throws SQLException;
    public boolean updateById(long id);
}
