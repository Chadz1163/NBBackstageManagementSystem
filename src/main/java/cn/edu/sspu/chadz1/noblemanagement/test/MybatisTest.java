package cn.edu.sspu.chadz1.noblemanagement.test;

import cn.edu.sspu.chadz1.noblemanagement.dao.MybatisTestMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class MybatisTest {

    @Autowired
    MybatisTestMapper mybatisTestMapper;

    @Test
    public void mybatisMapperTest() {
        mybatisTestMapper.insertStudent();
    }

    class test {
        int num;
    }

    @Test
    public void java4Test() {
        int a = 11;
        int b = 100;
        System.out.println("a = " + a + ";b = " + b);
        a = b;
        System.out.println("a = " + a + ";b = " + b);
        a = 150;
        System.out.println("a = " + a + ";b = " + b);
        /**
         * 结果：
         * a = 11;b = 100
         * a = 100;b = 100
         * a = 150;b = 100
         */
        test t1 = new test();
        test t2 = new test();
        t1.num = 10;
        t2.num = 20;
        System.out.println("t1.num = " + t1.num + "; t2.num = " + t2.num);
        //t1 = t2;
        //System.out.println("t1.num = " + t1.num + "; t2.num = " + t2.num);
        t1.num = 155;
        System.out.println("t1.num = " + t1.num + "; t2.num = " + t2.num);
        System.out.println(t1);
        System.out.println(t2);
        /**
         * 结果：
         * t1.num = 10; t2.num = 20
         * t1.num = 20; t2.num = 20
         * t1.num = 155; t2.num = 155
         * t1 = cn.edu.sspu.chadz1.noblemanagement.test.MybatisTest$test@53cddaf8
         * t2 = cn.edu.sspu.chadz1.noblemanagement.test.MybatisTest$test@53cddaf8
         * 当操作对象时，就是改变引用的对象，赋值操作的是一个对象的引用，所以修改t1时也改变了t2
         *
         * 原来t1指向的值为10的对象，在t1赋值的时候就被覆盖了，也就是丢失了，被java的垃圾回收机制给自动清理
         * 这种现象为“别名现象”，是java操作对象的一种基本方式。要避免这个问题，在这个例子中，可以写：
         * t1.num = t2.num;    这样就可以彼此独立
         */
        t1.num = t2.num;
        t1.num = 500;
        System.out.println("t1.num = " + t1.num + "; t2.num = " + t2.num);
        /**
         * 结果：
         * t1.num = 500; t2.num = 20
         */
    }

    @Test
    public void java4Test2() {
        int i = 1;
        int y = 1;
        System.out.println(i++);
        System.out.println(++y);
        int j = 1;
        while (j<=10) {
            System.out.println(++j);
        }
    }
}
