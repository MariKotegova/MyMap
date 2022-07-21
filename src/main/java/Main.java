import java.io.*;

public class Main {

    public static void main(String[] args) {
        MyMapPairs<String, UserInfo> xxx = new MyMapPairs<>();
        xxx.put("Olya", new UserInfo(25));
        xxx.put("Sascha", new UserInfo(13));
        xxx.put("Olya", new UserInfo(11));

        System.out.println(xxx);

    //    System.out.println(xxx.getValue("Oly"));
    //    File dir = new File("src/main/java", ".gitignore");
    //    if(dir.delete()){
    //        System.out.println("ok");
    //    }
    }
}
