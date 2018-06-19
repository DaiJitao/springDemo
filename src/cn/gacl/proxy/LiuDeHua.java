package cn.gacl.proxy;

/**
 * Created by daijitao on 2018/6/19.
 */
public class LiuDeHua implements Person {
    @Override
    public String sing(String name) {
        System.out.println("刘德华在唱" + name + "歌曲");
        return "歌曲唱完了，谢谢大家！";
    }

    @Override
    public String dance(String name) {
        System.out.println("刘德华在跳" + name + "舞蹈");
        return "跳舞完毕，谢谢大家！";
    }
}
