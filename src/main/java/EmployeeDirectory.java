/**
 * Project name(项目名称)：员工工资信息薄
 * Package(包名): PACKAGE_NAME
 * Class(类名): EmployeeDirectory
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/10
 * Time(创建时间)： 19:54
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class EmployeeDirectory
{
    public static void main(String[] args)
    {
        //------------------------------------------------------
        long startTime = System.nanoTime();   //获取开始时间
        //------------------------------------------------------
        Employee[] dir = new Employee[4];
        Employee e1 = new Employee();
        e1.setName("张三");
        e1.setSalary(500.5);
        dir[0] = e1;
        dir[1] = new Employee();
        for (int i = 0; i < 1; i++)
        {
            dir[i + 2] = new Employee("user" + i + 2, 5698);
        }
        for (int i = 0; i < 3; i++)
        {
            System.out.println("员工的姓名：" + dir[i].getName());
            System.out.println("员工的工资：" + dir[i].getSalary() + "元");
        }
        //------------------------------------------------------
        long endTime = System.nanoTime(); //获取结束时间
        if ((endTime - startTime) < 1000000)
        {
            double final_runtime;
            final_runtime = (endTime - startTime);
            final_runtime = final_runtime / 1000;
            System.out.println("算法运行时间： " + final_runtime + "微秒");
        }
        else if ((endTime - startTime) >= 1000000 && (endTime - startTime) < 10000000000L)
        {
            double final_runtime;
            final_runtime = (endTime - startTime) / 1000;
            final_runtime = final_runtime / 1000;
            System.out.println("算法运行时间： " + final_runtime + "毫秒");
        }
        else
        {
            double final_runtime;
            final_runtime = (endTime - startTime) / 10000;
            final_runtime = final_runtime / 100000;
            System.out.println("算法运行时间： " + final_runtime + "秒");
        }
        Runtime r = Runtime.getRuntime();
        float memory;
        memory = r.totalMemory();
        memory = memory / 1024 / 1024;
        System.out.printf("JVM总内存：%.3fMB\n", memory);
        memory = r.freeMemory();
        memory = memory / 1024 / 1024;
        System.out.printf(" 空闲内存：%.3fMB\n", memory);
        memory = r.totalMemory() - r.freeMemory();
        memory = memory / 1024 / 1024;
        System.out.printf("已使用的内存：%.4fMB\n", memory);
        //------------------------------------------------------
    }
}
