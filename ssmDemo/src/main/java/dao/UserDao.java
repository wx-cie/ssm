package dao;


public interface UserDao {
    //修改meeting 的title;
    void update(String title);
    //删除meeting中的boss;
     void delete(int n);
}
