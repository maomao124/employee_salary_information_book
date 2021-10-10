/**
 * Project name(项目名称)：员工工资信息薄
 * Package(包名): PACKAGE_NAME
 * Class(类名): Employee
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/10
 * Time(创建时间)： 19:50
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Employee
{
    private String name;
    private double salary;

    Employee()
    {
        name = "unknown";
        salary = 0.0;
    }

    Employee(String name, double salary)
    {
        this.name = name;
        this.salary = salary;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public double getSalary()
    {
        return salary;
    }

    public void setSalary(double salary)
    {
        this.salary = salary;
    }
}
