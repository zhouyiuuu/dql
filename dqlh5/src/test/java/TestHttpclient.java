import org.junit.Test;

public class TestHttpclient {

    @Test
    public void httpclientTest(){

        String data="abbc";
        String detailEncode = DES.encryptDES(data,"22345679");
        System.out.println(detailEncode);
        String s=HttpRequestUtils.sendPost("http://localhost:8888/http","param="+detailEncode);
        System.out.println(s);
    }

    @Test
    public void testDes(){
        String data="abc";

        String detailEncode = DES.encryptDES(data,"22345679");

        System.out.println(detailEncode);
        String s = DES.decryptDES(detailEncode,"22345679");
        System.out.println(s);
    }
}