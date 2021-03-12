# CompletableFuture 的 20 个例子



因为CompletableFuture是CompletionInterface接口的实现，所以我们首先要了解该接口的契约。它代表某个同步或异步计算的一个阶段。你可以把它理解为是一个为了产生有价值最终结果的计算的流水线上的一个单元。这意味着多个ComletionStage指令可以链接起来从而一个阶段的完成可以触发下一个阶段的执行。
除了实现了CompletionStage接口，Compleiton还继承了Future，
这个接口用于实现一个未开始的异步事件。因为能够显式的完成Future，所以取名为CompletableFuture。

Futrue是在jdk5中加入用来获取异步执行结果
但是局限是 1. 只能使用get()阻塞 或者 轮询 isDone() ,代码也不优雅。
CompletableFuture与CompletionStage,是对于Future的补充

### CompletableFuture


