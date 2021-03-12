
##  Future是Callable的返回结果。
它有三个功能
1. 判断任务是否完成
2. 能够中断任务
3. 能够获取任务返回结果




Runnable对象可以传入到Thread类的构造方法中，通过Thread来运行Runnable任务，
而Callable接口则不能直接传入到Thread中来运行，
Callable接口通常结合线程池来使用。


1. 线程池ThreadPoolExecutor中除了提供execute()方法来提交任务以外
2. 还提供了submit()的三个重载方法来提交任务

##  submit和execute
1. execute提交的方式只能提交一个Runnable的对象，
且该方法的返回值是void，也即是提交后如果线程运行后，
和主线程就脱离了关系了，当然可以设置一些变量来获取到线程的运行结果。
    1. 无法获取到异常
    2. 无法获得返回值
2. submit的提交方式
    1. Runable，调用get，如果成功会返回null、如果异常会返回异常信息
    2. Runable task,T result，当成功会返回result对象，如果异常会返回异常信息





