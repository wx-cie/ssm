import bean.Meeting;
import controller.UserController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        String xmlsPath1 = "bean/bean1.xml";
        String xmlsPath2 = "bean/bean2.xml";
        String xmlsPath3 = "bean/bean3.xml";
        String xmlsPath4="bean/bean4.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlsPath1, xmlsPath2, xmlsPath3,xmlsPath4);
       // Meeting meeting = applicationContext.getBean(Meeting.class);
        UserController userController=(UserController) applicationContext.getBean("userController");
        userController.delete(1);
        userController.update("喵");

    }
}
