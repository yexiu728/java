package day16;

public class Test0 {
    /*

Test1：
    线程池：其实就是一个容纳多个线程的容器，其中的线程可以反复使用，
        省去了频繁创建线程对象的操作，无需反复创建线程而消耗过多资源。
    合理利用线程池能够带来三个好处：
        1. 降低资源消耗。减少了创建和销毁线程的次数，每个工作线程都可以被重复利用，可执行多个任务。
        2. 提高响应速度。当任务到达时，任务可以不需要的等到线程创建就能立即执行。
        3. 提高线程的可管理性。可以根据系统的承受能力，调整线程池中工作线线程的数目，
            防止因为消耗过多的内存，而把服务器累趴下(每个线程需要大约1MB内存，
            线程开的越多，消耗的内存也就越大，最后死机)。
    线程池接口是
        java.util.concurrent.ExecutorService
    官方建议使用Executors工程类来创建线程池对象
        public static ExecutorService newFixedThreadPool(int nThreads)
            返回线程池对象。(创建的是有界线程池,也就是池中的线程个数可以指定最大数量)
        public Future<?> submit(Runnable task)
            获取线程池中的某一个线程对象，并执行
            Future接口：用来记录线程任务执行完毕后产生的结果。线程池创建与使用。

Test2：
    File
        java.io.File 类是文件和目录路径名的抽象表示，主要用于文件和目录的创建、查找和删除等操作。
        构造方法
            public File(String pathname)
                通过将给定的路径名字符串转换为抽象路径名来创建新的 File实例
            public File(String parent, String child)
                从父路径名字符串和子路径名字符串创建新的 File实例
            public File(File parent, String child)
                从父抽象路径名和子路径名字符串创建新的 File实例

        获取功能的方法
            public String getAbsolutePath()
                返回此File的绝对路径名字符串。
            public String getPath()
                将此File转换为路径名字符串。
            public String getName()
                返回由此File表示的文件或目录的名称。
            public long length()
                返回由此File表示的文件的长度。

        判断功能的方法
            public boolean exists()
                此File表示的文件或目录是否实际存在
            public boolean isDirectory()
                此File表示的是否为目录
            public boolean isFile()
                此File表示的是否为文件

        创建删除功能的方法
            public boolean createNewFile()
                当且仅当具有该名称的文件尚不存在时，创建一个新的空文件
            public boolean delete()
                删除由此File表示的文件或目录
                如果此File表示目录，则目录必须为空才能删除。
            public boolean mkdir()
                创建由此File表示的目录
            public boolean mkdirs()
                创建由此File表示的目录，包括任何必需但不存在的父目录

        目录的遍历
            调用listFiles方法的File对象，表示的必须是实际存在的目录，否则返回null，无法进行遍历。
            public String[] list()
                返回一个String数组，表示该File目录中的所有子文件或目录。
            public File[] listFiles()
                返回一个File数组，表示该File目录中的所有的子文件或目录。

Test3：
    递归
        递归一定要有结束条件
        返回值类型和传入的参数类型一致（不是必须）

Test4：
    创建文件夹与文件代码
    删除文件夹与文件代码
    计算文件夹与文件大小
    计算同类型文件个数

*/
}
