使用Junit 4单元测试(加减乘除测试)

测试代码:Calculatortest.java

被测代码:Calculator.java

打包:AllCalculaotrTests.java


一、基本规则
    测试类名以test结尾，测试方法名以test结尾。
二、注解
@Test：使用该注解的方法为测试方法，自动运行时能够识别并被执行
      包含两个参数：expected=XXXException.class 期望出现的异常
                               timeout=xxx 设定程序运行的超时时间
     @Ignore：被忽略的测试方法
     @Before：在每个测试方法之前运行
     @After： 在每个测试方法之后运行
     @BeforeClass：在所有测试开始之前运行
     @AfterClass：在所有测试开始之后运行
注意：@Before与@BeforeClass的区别
     @Before会加在每个方法前执行，即有几个@Test就会执行几遍。
     @BeforeClass 只在所有测试之前执行，只会执行一次。并且@BeforeClass修饰的方法必须是公有的静态方法（public static ）。
     @After和@AfterClass也类似
     每个测试类中这四个注解不能重复使用，一个方法只能从这四个注解中挑选其中一个。

限时测试
           @Test(timeout=1000)超时时间单位为毫秒
           用于测试是否有死循环工是实时性要求比较高的用例，这个非常方便而且非常有用。
运行器Runner
            类注解@RunWith，指定不同的类可以改变测试类的行为

三、执行
直接在类文件右键-Run As-Junit Test

