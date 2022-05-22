import java.time.ZonedDateTime;

/**
 * @author chenfl
 * @create 2021-01-15-10:42
 */
public class T2 {
    public static void main(String[] args) {
        ZonedDateTime zbj = ZonedDateTime.now();//默认时区
        System.out.println(zbj);//2021-01-15T10:45:00.365+08:00[Asia/Shanghai]
    }
}
