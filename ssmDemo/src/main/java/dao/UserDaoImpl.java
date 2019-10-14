package dao;

import bean.Meeting;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class UserDaoImpl implements UserDao {
    @Override
    public void update(String title) {
        String xmlsPath1 = "bean/bean1.xml";
        String xmlsPath2 = "bean/bean2.xml";
        String xmlsPath3 = "bean/bean3.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlsPath1, xmlsPath2, xmlsPath3);
        Meeting meeting = applicationContext.getBean(Meeting.class);
        meeting.setTitle(title);
        System.out.println(meeting);

    }

    @Override
    public void delete(int n) {
        String xmlsPath1 = "bean/bean1.xml";
        String xmlsPath2 = "bean/bean2.xml";
        String xmlsPath3 = "bean/bean3.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlsPath1, xmlsPath2, xmlsPath3);
        Meeting meeting = applicationContext.getBean(Meeting.class);
       meeting.getBossList().remove(n);
       System.out.println(meeting);
    }
}
