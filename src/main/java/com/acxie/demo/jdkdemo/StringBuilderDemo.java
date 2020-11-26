package com.acxie.demo.jdkdemo;

/**
 * @description:
 * @author: xieaichen
 * @time: 2020/9/4 17:06
 */

public class StringBuilderDemo {

    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        //    private transient char[] toStringCache;
        StringBuffer stringBuffer = new StringBuffer();
        String str = new String();


//        都继承java.lang.AbstractStringBuilder类，都实现java.io.Serializable和java.lang.CharSequence接口。
        // AbstractStringBuilder 是他们公共的父亲类
        // stringBuffer 内部还有一个 AbstractStringBuilder
//        为什么要实现Serializable接口

//        transient关键字用来指出哪些成员变量不应该被序列化。值得注意的是：
//        序列化针对的是对象，而不是类；
//        static修饰的变量，本身是隐式的transient，同时静态变量是属于类层次，不能被序列化；
//        transient只能用于修饰成员变量，不能修饰本地变量，不能修饰方法和类。

//        toStringCache这个成员变量，从命名上看，猜测是为了用于toString()方法而做的字符串缓冲。可见，如果是为了做缓冲，确实没必要在StringBuffer对象中持久化。


//                关于serialVersionUID
//        对于JVM来说，要进行持久化的类必须要有一个标记，只有持有这个标记JVM才允许类创建的对象可以通过其IO系统转换为字节数据，从而实现持久化，而这个标记就是Serializable接口。而在反序列化的过程中则需要使用serialVersionUID来确定由那个类来加载这个对象，所以我们在实现Serializable接口的时候，一般还会要去尽量显示地定义serialVersionUID，如：
//
//        private static final long serialVersionUID = 1L;
//        在反序列化的过程中，如果接收方为对象加载了一个类，如果该对象的serialVersionUID与对应持久化时的类不同，那么反序列化的过程中将会导致InvalidClassException异常。例如，在之前反序列化的例子中，我们故意将User类的serialVersionUID改为2L，如：


    }


}
