import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import xyz.kingsword.ssm.dao.ItemsMapper;
import xyz.kingsword.ssm.dao.MmallOrderItemMapper;
import xyz.kingsword.ssm.dao.UserMapper;
import xyz.kingsword.ssm.pojo.Items;
import xyz.kingsword.ssm.pojo.MmallOrderItem;
import xyz.kingsword.ssm.pojo.User;

import java.util.Arrays;
import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:applicationContext.xml"})
public class ContextTest {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private ItemsMapper itemsMapper;
    @Autowired
    private MmallOrderItemMapper mmallOrderItemMapper;

    @Test
    public void test() {
        User user = userMapper.selectByPrimaryKey(1);
        System.out.println(user);

        List<User> userList = userMapper.selectByIdList(Arrays.asList(1, 10, 16));
        userList.forEach(System.out::println);

        userList = userMapper.selectByIdName("小");
        userList.forEach(System.out::println);

        Page<User> page = PageHelper.startPage(1, 2).doSelectPage(() -> userMapper.selectAll());
        System.out.println(page);

        user.setUsername("王笑");
        int flag = userMapper.updateByPrimaryKeySelective(user);
        System.out.println("更新：" + flag);

        user = new User();
        user.setId(20);
        user.setUsername("wangxiao123");
        flag = userMapper.insertSelective(user);
        System.out.println("插入：" + flag);

        List<Items> itemsList = itemsMapper.getItemByUser(1);
        itemsList.forEach(System.out::println);

        List<MmallOrderItem> mmallOrderItemList = mmallOrderItemMapper.selectByUser(1);
        mmallOrderItemList.forEach(System.out::println);
    }
}
