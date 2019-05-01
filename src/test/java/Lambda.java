import org.junit.Test;

import java.util.function.Function;

public class Lambda {
    @Test
    public void base(){
        // lambda 的基本使用
        new Thread(() -> {
            System.out.println("Hello lambda");
        }).start();
    }

    @Test void func(){
        String[] arguments = {"a", "b", "c"};
        doSomething((args) -> {
            return args.length;
        }, arguments);
    }

    // 前面的是函数参数，后面是返回值
    // .apply 来调用
    private Integer doSomething(Function<String[], Integer> function,String[] args){
        return function.apply(args);
    }
}
