# 设计模式

## 一，七大原则

### 1，单一职责原则

> 基本介绍

对类来说的，即一个类应该只负责一项职责。 如类A负责两个不同职责:职责1,职责2.当职责1需求变更而改变A时，可能造成职责2执行错误，所以需要将类A的粒度分解为A1, A2

> 单一职责原则注意事项和细节

- 降低类的复杂度，一个类只负责一项职责。
- 提高类的可读性，可维护性
- 降低变更引起的风险
- 通常情况下，我们应当遵守单一职责原则，只有逻辑足够简单，才可以在代码级违反单一职责原则:只有类中方法数量足够少，可以在方法级别保持单一职责原则

### 2，接口隔离原则

> 基本介绍

客户端不应该依赖它不需要的接口，即一个类对另一个类的依赖应该建立在最小的接口上

> 应传统方法的问题和使用接口隔离原则改进

1. 类A通过接口interface1依赖类B，类C通过接口Interface1依赖类D.如果接口Interface1对于类A和类C来说不是最小接口，那么类B和类D必须去实现他们不
   需要的方法.
2. 将接口Interface1拆分为独立的几个接口，类A和类C分别与他们需要的接口建立依赖关系。也就是采用接口隔高原则
3. 接口interface1中出现的方法，根据实际情况拆分为三个接口

### 3，依赖倒转原则

> 基本介绍

依赖倒转原则(Dependence Inversion Principle)是指:

1. 高层模块不应该依赖低层模块，二者都应该依赖其抽象
2. 抽象不应该依赖细节，细节应该依赖抽象
3. 依赖倒转(倒置)的中心思想是面向接口编程
4. 依赖倒转原则是基于这样的设计理念:相对于细节的多变性，抽象的东西要稳定的多。以抽象为基础搭建的架构比以细节为基础的架构要稳定的多。在java中， 抽象指的是接口或抽象类，细节就是具体的实现类
5. 使用接口或抽象类的目的是制定好规范，而不涉及任何具体的操作，把展现细节的任务交给他们的实现类去完成

### 4，里氏替换原则

> 基本介绍

1. 在使用继承时，遵循里氏替换原则，在子类中尽量不要重写父类的方法
2. 里氏替换原则告诉我们，继承实际上让两个类耦合性增强了，在适当的情况下，可以通过聚合，组合，依赖来解决问题。

### 5，开闭原则(OCP)

> 基本介绍

1. 开闭原则(Open Closed Principle)是编程中最基础，最重要的设计原则
2. 一个软件实体如类，模块和函数应该对扩展开放，对修改关闭。用抽象构建框架，用实现扩展细节。
3. 当软件需要变化时，尽量通过扩展软件实体的行为来实现变化，而不是通过修改已有的代码来实现变化。
4. 编程中遵循其它原则，以及使用设计模式的目的就是遵循开闭原则。

### 6，迪米特法则

> 基本介绍

1. 一个对象应该对其他对象保持最少的了解
2. 类与类关系越密切，耦合度越大
3. 迪米特法则(Demeter Principle)又叫**最少知道原则**，即一个类对自己依赖的类知道的越少越好。也就是说，对于被依赖的类不管多么复杂，都尽量将逻辑封装在类的内部。对外除了提供的public方法，不对外泄露任何信息
4. 迪米特法则还有个更简单的定义:只与直接的朋友通信
5. 直接的朋友:每个对象都会与其他对象由耦合关系，只要两个对象之间有耦合关系，我们就说这两个对象之间是朋友关系。耦合的方式很多，依赖，关联，组合，聚合等。其中，我们称出现成员变量，方法参数，方法返回值中的类为直接的朋友，而出现在局部变量中的类不是直接的朋友。也就是说，陌生的类最好不要以局部变量的形式出现在类的内部。

### 7，合成复用原则

> 基本介绍

原则是尽量使用合成/聚合的方式，而不是使用继承

> 核心思想

1. 找出应用中可能需要变化之处，把它们独立出来，不要和那些不需要变化的代码混在一起
2. 针对接口编程，而不是针对实现编程
3. 为了交互对象之间的松耦合设计而努力

## 二，UML

### 1，介绍

1. UML---Unified modeling language UML(统一建模语言)，是一种用于软件系统分析和设计的语言工具，它用于帮助软件开发人员进行思考和记录思路的结果
2. UML本身是一 套符号的规定，就像数学符号和化学符号一样，这些符号用于描述软件模型中的各个元素和他们之间的关系，比如类、接口、实现、泛化、依赖、组合、聚合等
3. 使用UML来建模，常用的工具有Rational
   Rose ,也可以使用一些插件来建模

### 2，UML图

1. 用例图(use case)
2. 静态结构图类图、对象图、包图、组件图、部署图
3. 动态行为图:交互图(时序图与协作图)、状态图、活动图

> 说明:

1. 类图是描述类与类之间的关系的，是UML图中最核心的

> uml类图

1. 用于描述系统中的类(对象)本身的组成和类(对象)之间的各种静态关系
2. 类之间的关系：依赖，泛化(继承)，实现，关联，聚合和组合

> 关系

- 依赖关系

  - 只要是在类中用到了对方，那么他们之间就存在依赖关系，如果没有对方，不会通过编译
  - 类中用到了对方
  - 如果是类的成员属性
  - 如果是方法的返回类型
  - 是方法接受的参数类型
  - 方法中使用到

- 泛化关系(继承关系)

  - 泛化关系实际上就是继承关系，他是依赖关系的特例

- 实现关系

  - 实现关系实际上就是A类实现B类，他是依赖关系的特例

- 关联关系

  - 关联关系实际上就是类与类之间的联系，他是依赖关系的特例

  - 关联具有导航性：即双向关系或单向关系

  - 关系具有多重性：如"1"(表示有切只有一个)，"0..."(表示0个或者多个)，"0,1"(表示0个或者一个)，"n...m"(表示n到m个都可以)，"m...*"(表示至少m个)

  - 单向一对一

    - ~~~java 
      public class Person {
          private IDCard card;
      }
      public class IDCard {
          
      }
      ~~~

  - 双向一对一关系

    - ~~~java
      public class Person {
          private IDCard card;
      }
      public class IDCard {
          private Person person;
      }
      ~~~

- 聚合关系

  - 聚合关系表示的是整体和部分的关系，整体与部分可以分开。聚合关系是关联关系的特例，所以他具有关联的导航性与多重性。
  - 如:一台电脑(Computer)由键盘(keyboard).显示器(Monitor),"鼠标(Mouse)等组成;组成电脑的各个配件是可以从电脑上分离出来的。
  - 使用带空心菱形的实线来表示:

- 组合关系

  - 上一例子中如果我们认为monitor,Monitor和Computer是不可分分离的，则升级为组合关系
  - 也就是整体与部分的关系，但是整体与部分不可以分开

## 三，设计模式

> 计模式分为三种类型，共23种

1. 创建型模式:单例模式、抽急工厂模式、原型模式、建造者模式、工厂模式。
2. 结构型程式:适配器模式、桥接模式、装饰模式、组合模式、外观模式、享元模式、代理模式。
3. 行为型模式:模版方法模式、命令模式、访问者模式、迭代器模式、观察者模式、中介者模式、备忘录模式、解释器模式(Interpreter模式)、状态模式、策略模式、职责链模式(责任链模式)。.

### 1，单例模式(singleton)

> 介绍

所谓类的单例模式，就是采取一定的方法保证在整个软件系统中，对某个类只能存在一个对象的实例，并且该类只提供一个取得其对象实例的方法

> 举例

比如Hibernate的SessionFactory,它充当数据存储源的代理，并负责创建Session对象，SessionFactory并不是轻量级的，一般情况下，一个项目通常只需要一个SessionFactory就够，这时就会使用到单例模式。

> 代码

#### (1)，饿汉式(静态变量)

~~~java
//饿汉式(静态变量)
class Singleton {
    // 1，构造器私有化,外部不能new了
    private Singleton(){}
    // 2，在本类内部创建对象实例
    private final static Singleton instance = new Singleton();
    // 3，提供一个公有的静态方法，返回实例对象
    public static Singleton getInstance(){
        return instance;
    }
}
~~~

> 测试

~~~java
public class Singleton_01 {
    public static void main(String[] args) {
//        测试
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
        System.out.println(singleton == singleton1);
    }
}
~~~

> 结果

~~~java
true
~~~

> 优缺点：

- 优点:这种写法比较简单，就是在类装载助时候就完成实例化。避免了线程同步问题。
- 缺点:在类装载的时候就完成实例化，没有达到Lazy Loading的效果。如果从始至终从未使用过这个实例，则会造成内存的浪费
- 这种方式基于classloder机制避免了多线程的同步问题不过，instance在类装 载时就实例化，在单例模式中大多数都是调用getInstance方法，但是导致类装载的原因有很多种，因此不能确定有其他的方式(或者其他的静态方法)导致类装载，这时候初始化instance就没有达到lazy loading的效果
- 结论:这种单例模式可用，可能造成内存浪费

#### (2)，饿汉式(静态代码块)

~~~java
//饿汉式(静态代码块)
class Singleton {
    // 1，构造器私有化,外部不能new了
    private Singleton(){}
    // 2，在本类内部创建对象实例
    private  static Singleton instance;
    //在静态代码块中创建单例对象
    static {
        instance = new Singleton();
    }
    // 3，提供一个公有的静态方法，返回实例对象
    public static Singleton getInstance(){
        return instance;
    }
}
~~~

> 优缺点

- 这种方式和上面的方式其实类似，只不过将类实例化的过程放在了静态代码块中，也是在类装载的时候，就执行静态代码块中的代码，初始化类的实例。
- 优缺点和上面是一样的。
- 结论:这种单例模式可用，但是可能造成内存浪费

#### (3)，懒汉式(线程不安全)

~~~java
//懒汉式(线程不安全)
class Singleton {
    //静态私有声明
    private static Singleton singleton;
    //私有构造器
    private Singleton(){}
    //当调用的时候才会创建实例对象
    public static Singleton getInstance() {
        if (singleton == null) {
            singleton =  new Singleton();
        }
        return singleton;
    }
}
~~~

> 优缺点

- 起到了Lazy Loading的效果，但是只能在单线程下使用。
- 如果在多线程下，一个线程进入了if (singleton -- null判断语句块，还未来得及往下执行，另一个线程也通过了这个判断语句，这时便会产生多个实例。所以在多线程环境下不可使用这种方式
- 结论:在实际开发中，不要使用这种方式.

#### (4)，懒汉式(线程安全，同步方法)

~~~java
//懒汉式(线程安全,同步方法)
class Singleton {
    //静态私有声明
    private static Singleton singleton;
    //私有构造器
    private Singleton(){}
    //当调用的时候才会创建实例对象，
    //使用synchronized关键字上锁，线程同步
    public static synchronized Singleton getInstance() {
        if (singleton == null) {
            singleton =  new Singleton();
        }
        return singleton;
    }
}
~~~

> 优缺点

- 解决了线程不安全问题
- 效率太低了，每个线程在想获得类的实例时候，执行getInstance()方法 都要进行同步。而其实这个方法只执行一次实例化代码就够了，后面的想获得该类实例，直接return就行了。方法进行同步效率太低
- 结论:在实际开发中，不推荐使用这种方式

#### (4)，懒汉式(线程安全，同步代码块)

~~~java
//懒汉式(线程安全,同步代码块)
class Singleton {
    //静态私有声明
    private static Singleton singleton;
    //私有构造器
    private Singleton(){}
    //当调用的时候才会创建实例对象，
    //使用synchronized关键字上锁，线程同步
    public static Singleton getInstance() {
        if (singleton == null) {
            synchronized(Singleton.class){
                singleton =  new Singleton();
            }
        }
        return singleton;
    }
}
~~~

> 优缺点

- 这种方式，本意是想对第四种实现方式的改进，因为前面同步方法效率太低，改为同步产生实例化的的代码块
- 但是这种同步并不能起到线程同步的作用。跟第3种实现方式遇到的情形一致，假如一个线程进入了if (singleton == null)判断语句块，还未来得及往下执行，另一个线程也通过了这个判断语句，这时便会产生多个实例
- 结论:在实际开发中，不能使用这种方式

#### (6)，双重检查

~~~java
//双重检查
class Singleton {
    //静态私有声明，使用volatile关键字
    private static volatile Singleton singleton;
    //私有构造器
    private Singleton(){}
    //当调用的时候才会创建实例对象，
    //使用synchronized关键字上锁，线程同步，双重检查
    public static Singleton getInstance() {
        if (singleton == null) {
            synchronized(Singleton.class){
                if (singleton == null) {
                    singleton =  new Singleton();
                }
            }
        }
        return singleton;
    }
}
~~~

> 优缺点

- Double-Check概念是多线程开发中 常使用到的，如代码中所示，我们进行了两次(singleton == null)检查，这样就可以保证线程安全了。
- 这样，实例化代码只用执行一次，后面再次访问时，判断if (singleton = null),直接return实例化对象，也避免的反复进行方法同步.
- 线程安全;延迟加载:效率较高
- 结论:在实际开发中，推荐使用这种单例设计模式

#### (7)，静态内部类

~~~java

~~~

> 优缺点

- 这种方式采用了类装载的机制来保证初始化实例时只有一个线程。
- 静态内部英万式在Singleton类被装载时并不会立即实例化，而是在需要实例化时，调用getInstance万法， 才会装载SingletonInstance类，从而完成Singleton的实例化。
- 类的静态属性只会在第一次加载类的时候初始化，所以在这里，JVM帮助我们保证了线程的安全性，在类进行初始化时，别的线程是无法进入的。
- 优点:避免了线程不安全，利用静态内部类特点实现延迟加载，效率高
-  结论:推荐使用。

#### (8)，枚举

~~~java
//枚举
enum Singleton {
    INSTANCE;
    public void sayOK(){
        System.out.println("ok");
    }
}
~~~

> 优点

- 这借助JDK1.5中添加的故举来实现单例模式。不仅能避免多线程同步问题，而且还能防止反序列化重新创建新的对象。
- 这种方式是Effective Java作者Josh Bloch提倡的方式
- 结论:推荐使用

(9)，jdk源码中的单例模式

Runtime类

~~~java
    private static Runtime currentRuntime = new Runtime();
    public static Runtime getRuntime() {
        return currentRuntime;
    }
    private Runtime() {}
~~~

使用的是饿汉式

### 2，工厂模式

#### (1)，一个具体的需求

看一个披萨项目，要便于种类的扩展，要便于维护

1. 披萨的种类有很多(比如 GreekPizz，CheesePizza)
2. 披萨的制作有 prepare，bake，cut，box。
3. 完成披萨店订购功能

> 普通方式

1. Pizza

   ~~~java
   //将Pizza类做成抽象的
   public abstract class Pizza {
       protected String name;
   
       //准备原材料，不同的皮塞不一样，因此，我们做成抽象类
       public abstract void prepare();
   
       public void bake() {
           System.out.println(name + "baking");
       }
   
       public void cut() {
           System.out.println(name + "cutting");
       }
   
       //打包
       public void box() {
           System.out.println(name + "boxing");
       }
   
       public void setName(String name) {
           this.name = name;
       }
   }
   ~~~

2. GreekPizz.java

   ~~~java
   public class GreekPizz extends Pizza {
       @Override
       public void prepare() {
           System.out.println("准备做希腊披萨的原材料");
       }
   }
   ~~~

3. CheesePizza.java

   ~~~java
   public class CheesePizza extends Pizza {
       @Override
       public void prepare() {
           System.out.println("准备做奶酪披萨的原材料");
       }
   }
   ~~~

4. OrderPizza.java

   ~~~java
   public class OrderPizza {
       //构造器
       public OrderPizza() {
           Pizza pizza = null;
           //订购披萨的类型
           String orderType;
           do {
               orderType = gettype();
               if (orderType.equals("greek")){
                   pizza = new GreekPizz();
                   pizza.setName(" 希腊披萨 ");
               }else if (orderType.equals("cheese")){
                   pizza = new CheesePizza();
                   pizza.setName(" 奶酪披萨 ");
               }else{
                   break;
               }
               //输出制作过程
               pizza.prepare();
               pizza.bake();
               pizza.cut();
               pizza.box();
           } while (true);
       }
   
       //写一个方法，可以获取客户希望订购的披萨种类
       private String gettype() {
           try {
               BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
               System.out.println("input pizza type");
               String str = strin.readLine();
               return str;
           } catch (IOException e) {
               e.printStackTrace();
               return "";
           }
       }
   }
   ~~~

5. 优缺点

   - 优点是比较好理解，简单易操作
   - 缺点是违反了ocp原则，即对扩展开放，对修改关闭。
   - 比如我们这是新增一个Pizza的种类，就需要修改原来的类
   - 如果Order过多那么就需要修改很多的Order

6. 改进的思路分析
   分析:修改代码可以接受，但是如果我们在其它的地方也有创建Pizza的代码，就意味着，也需要修改，而创建Pizza的代码，往往有多处。思路:把创建Pizza对象封装到一个类中，这样我们有新的Pizza种类时，只需要修改该类就可，其它有创建到Pizza对象的代码就不需要修改了一>简单工厂模式

#### (2)，简单工厂模式

> 介绍

- 简单工厂模式是属于创建型模式，是工厂模式的一种。简单工厂模式是由一个工厂对象决定创建出哪种产品类的实例。 简单工厂模式是工厂模式家族
  中最简单实用的模式
- 简单工厂模式:定义了一个创建对象的类，由这个类来封装实例化对象的行为(代码)
- 在软件开发中，当我们会用到大量的创建某种、某类或者某批对象时，就会使用到工厂模式. 

> 改进

1. OrderPizza.java

   ~~~java
   public class OrderPizza {
       //定义一个简单工厂对象
       SimpleFactory simpleFactory;
       Pizza pizza = null;
   
       //构造器
       public OrderPizza(SimpleFactory simpleFactory){
           setFactory(simpleFactory);
       }
   
       public void setFactory(SimpleFactory simpleFactory) {
           //用户输入
           String orderType = "";
           this.simpleFactory = simpleFactory;
   
           do {
               orderType = gettype();
               pizza = this.simpleFactory.createPizza(orderType);
               //输出Pizza的信息
               if (pizza != null) {
                   pizza.prepare();
                   pizza.bake();
                   pizza.cut();
                   pizza.box();
               } else {
                   System.out.println("没有这种Pizza");
                   break;
               }
           } while (true);
       }
   
       //写一个方法，可以获取客户希望订购的披萨种类
       private String gettype() {
           try {
               BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
               System.out.println("input pizza type");
               String str = strin.readLine();
               return str;
           } catch (IOException e) {
               e.printStackTrace();
               return "";
           }
       }
   }
   ~~~

2. SimpleFactory.java

   ~~~java
   //简单工厂类
   public class SimpleFactory {
   
       //根据orderType返回对应的Pizza对象
       public Pizza createPizza(String orderType) {
           Pizza pizza = null;
           System.out.println("使用简单工厂模式");
           if (orderType.equals("greek")){
               pizza = new GreekPizz();
               pizza.setName(" 希腊披萨 ");
           }else if (orderType.equals("cheese")){
               pizza = new CheesePizza();
               pizza.setName(" 奶酪披萨 ");
           }
           return pizza;
       }
   }
   ~~~

3. 如果需要新增只需要修改SimpleFactory中的代码就可以响应需求，不需要逐个修改每个Order

#### (3)，工厂方法模式 

在工厂方法模式中不再提供一个统一的工厂类来创建所有的产品对象,而是针对不同的产品提供不同的工厂,系统提供一个与产品等级结构对应的工厂等级结构。

> 工厂方法模式的定义如下:

定义一个用于创建对象的接口,但是让子类决定将哪一个类实例化。工厂方法模式让一个类的实例化延迟到其子类。

工厂方法模式简称为工厂模式( Factory Pattern),又可称作虚拟构造器模式('Virtual Constructor Pattern)或多态工厂模式( Polymorphic Factory Pattern)。

工厂方法模式是种类创建型模式。

在工厂方法模式中,工厂父类负责定义创建产品对象的公共接口,而工厂子类负责生成具体的产品对象,这样做的目的是将产品类的实例操作延迟到工厂子类中完成,即通过工厂子类来确定究竟应该实例化哪一个具体产品类



> 工厂方法模式包含以下4个角色。

1.  Product(抽象产品):它是定义产品的接口,是工厂方法模式所创建对象的超类型，也就是产品对象的公共父类
2. ConcreteProduct(具体产品):它实现了抽象产品接口,某种类型的具体产品由专门的具体工厂创建,具体工厂和具体产品之间一一对应
3. Factory(抽象工厂):在抽象工厂类中声明了工厂方法( Factory Method),用于返回一个产品。抽象工厂是工厂方法模式的核心,所有创建对象的工厂类都必须实现该接口。
4. ConcreteFactory(具体工厂):它是抽象工厂类的子类,实现了在抽象工厂中声明的工厂方法,并可由客户端调用,返回一个具体产品类的实例

#### (4)，抽象工厂模式

### 3，原型模式

#### (1)，普通方式(缺一个new一个)

Sheep.java

~~~java
public class Sheep {
    private String name;
    private int age;
    private String color;
    public Sheep(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }
    public Sheep() {
    }
    @Override
    public String toString() {
        return "Sheep{" +
            "name='" + name + '\'' +
            ", age=" + age +
            ", color='" + color + '\'' +
            '}';
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
}
~~~

Client.java

~~~java
public class Client {
    public static void main(String[] args) {
        Sheep sheep = new Sheep("tom", 1, "白色");
        Sheep sheep1 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
        Sheep sheep2 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
        Sheep sheep3 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
        Sheep sheep4 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
 System.out.println(sheep.toString());
 System.out.println(sheep1.toString());
 System.out.println(sheep2.toString());
 System.out.println(sheep3.toString());
 System.out.println(sheep4.toString());
    }
}

~~~

结果：

~~~java
Sheep{name='tom', age=1, color='白色'}
Sheep{name='tom', age=1, color='白色'}
Sheep{name='tom', age=1, color='白色'}
Sheep{name='tom', age=1, color='白色'}
Sheep{name='tom', age=1, color='白色'}
~~~

全都一模一样

> 优缺点：

1. 优点是比较好理解，简单易操作。
2. 在创建新的对象时，总是需要重新获取原始对象的属性，如果创建的对象比较复杂时，效率较低
3. 总是需要重新初始化对象，而不是动态地获得对象运行时的状态，不够灵活

> 新的思路

java中Object类是所有类的根类，Object类提供了一个clone()方法，该方法可以将一个Java对象复制一份，但是需要实现clone的java类必须实现一个接口Cloneable，该接口表示该类能够复制且具有复制的能力=>原型模式。

#### (2)，原型模式

> 基本介绍

1. 原型模式(Prototype模式)是指:用原型实例指定创建对象的种类，并且通过拷贝这些原型，创建新的对象
2. 原型模式是一种创建型设计模式，允许一个对象再创建另外一个可定制的对象，无需知道如何创建的细节
3. 工作原理是:通过将一个原型对象传给那个要发动创建的对象，这个要发动创建的对象通过请求原型对象拷贝它们自己来实施创建，即对象.clone()

Sheep.java

~~~java
public class Sheep implements Cloneable{

    private String name;
    private int age;
    private String color;

    public Sheep(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public Sheep() {
    }

    @Override
    public String toString() {
        return "Sheep{" +
            "name='" + name + '\'' +
            ", age=" + age +
            ", color='" + color + '\'' +
            '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //克隆该实例，使用默认的clone方法来完成
    @Override
    protected Object clone(){
        Sheep sheep = null;
        try {
            sheep = (Sheep) super.clone();
        }catch (CloneNotSupportedException ex){
            System.out.println(ex.getMessage());
        }
        return sheep;
    }
}
~~~

Client.java

~~~java
public class Client {
    public static void main(String[] args) {
        Sheep sheep = new Sheep("tom", 1, "白色");
        Sheep sheep1 = (Sheep) sheep.clone();
        Sheep sheep2 = (Sheep) sheep.clone();
        Sheep sheep3 = (Sheep) sheep.clone();
        Sheep sheep4 = (Sheep) sheep.clone();
        Sheep sheep5 = (Sheep) sheep.clone();

        System.out.println(sheep);
        System.out.println(sheep1);
        System.out.println(sheep2);
        System.out.println(sheep3);
        System.out.println(sheep4);
        System.out.println(sheep5);
    }
}

~~~

结果：

~~~java
Sheep{name='tom', age=1, color='白色'}
Sheep{name='tom', age=1, color='白色'}
Sheep{name='tom', age=1, color='白色'}
Sheep{name='tom', age=1, color='白色'}
Sheep{name='tom', age=1, color='白色'}
Sheep{name='tom', age=1, color='白色'}
~~~

#### (3)，spring中原型模式的应用

beans.xml

~~~xml
<bean id="id01" class="com.liu.bean.Monster" scope="protptype"/>
~~~

这里是使用原型模式来创建的对象

`doGetBean();`

#### (4)，浅拷贝

- 对于数据类型是基本数据类型的成员变量，浅拷贝会直接进行值传递，也就是将该属性值复制松份给新的对象。
- 对于数据类型是引用数据类型的成员变量，比如说成员变量是某个数组、某个类的对象等，那么浅拷贝会进行引用传递，也就是只是将该成员变量的引用值(内存地址)复制一份给新的对象。
- 因为实际上两个对象的该成员变量都指向同一个实例。在这种情况下，在一个对象中修改该成员变量会影响到另一个对象的该成员变量值
- 前面我们克隆羊就是浅拷贝
- 浅拷贝是使用默认的clone()方法来实现
  sheep = (Sheep) super.clone();

#### (5)，深拷贝

- 复制对象的所有基本数据类型的成员变量值
- 为所有引用数据类型的成员变量申请存储空间，并复制每个引用数据类型成员变量所引用的对象，直到该对象可达的所有对象。也就是说，对象进行深拷贝要对整个对象进行拷贝
- 深拷贝实现方式1:重写clone方法来实现深拷贝
- 深拷贝实现方式2:通过对象序列化实现深拷贝

DeepCloneableTarget.java

~~~java
public class DeepCloneableTarget implements Serializable, Cloneable {
    private static final long serialVersionUID = 1L;
    private String cloneName;
    private String cloneClass;

    //构造器
    public DeepCloneableTarget(String cloneName, String cloneClass) {
        this.cloneName = cloneName;
        this.cloneClass = cloneClass;
    }

    //因为该类属性都是String，因此我们这里使用默认的clone完成即可

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
~~~

DeepProtoType.java

~~~java
public class DeepProtoType implements Serializable, Cloneable {
    //String类型
    public String name;
    //引用类型
    public DeepCloneableTarget deepCloneableTarget;
    //深拷贝 - 方式一 clone方法
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object deep = null;
        //这里是对基本数据类型和字符串的克隆
        deep = super.clone();
        //引用类型变多后会很麻烦
        //需要对引用类型的属性进行单独处理
        DeepProtoType deepProtoType = (DeepProtoType) deep;
        deepProtoType.deepCloneableTarget = (DeepCloneableTarget) deepCloneableTarget.clone();
        return deepProtoType;
    }
    //深拷贝 - 方式2 通过对象的序列化实现 （推荐）
    public Object deepClone(){
        //创建流对象
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;

        try {
            //序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            //当前这个流对象以对象流的方式输出
            oos.writeObject(this);

            //反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);

            return (DeepProtoType) ois.readObject();
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }finally {
            //关闭流
            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
~~~

### 4，建造者模式

#### (1)，传统方式:

AbstractHouse.java

~~~java
public abstract class AbstractHouse {
    //打地基
    public abstract void buildBaisc();
    //砌墙
    public abstract void buildWalls();
    //封顶
    public abstract void roofed();

    //把上边三个放在一起
    public void build() {
        buildBaisc();
        buildWalls();
        roofed();
    }
}
~~~

CommonHouse.java

~~~java
//模拟盖一个普通的房子
public class CommonHouse extends AbstractHouse {
    @Override
    public void buildBaisc() {
        System.out.println("普通房子打地基");
    }

    @Override
    public void buildWalls() {
        System.out.println("普通房子砌墙");
    }

    @Override
    public void roofed() {
        System.out.println("普通房子封顶");
    }
}
~~~

HighBuilding.java

~~~java
public class HighBuilding extends AbstractHouse {
    @Override
    public void buildBaisc() {
        System.out.println("高楼打地基");
    }

    @Override
    public void buildWalls() {
        System.out.println("高楼砌墙");
    }

    @Override
    public void roofed() {
        System.out.println("高楼封顶");
    }
}
~~~

> 优缺点：

- 优点是比较好理解，简单易操作。
- 设计的程序结构，过于简单，没有设计缓存层对象，程序的扩展和维护不好.也就是说，这种设计方案，把产品(即:房子)和创建产品的过程(即:建房子流程)封装在一起，耦合性增强了。
- 解决方案:将产品和产品建造过程解耦=>建造者模式.

#### (2)，建造者模式

> 基本介绍

1. 建造者模式(Builder Pattern)又叫生成器模式，是一-种对象构建模式。它可以将复杂对象的建造过程抽象出来(抽象类别)，使这个抽象过程的不同实现方法可以构造出不同表现(属性)的对象。
2. 建造者模式是一步一步创建-一个复杂的对象，它允许用户只通过指定复杂对象的类型和内容就可以构建它们，用户不需要知道内部的具体构建细节。

> 角色介绍

- Product (产品角色) :一个具体的产品对象。
- Builder (抽象建造者) :创建一个Product对 象的各个部件指定的接口/抽象类。
- ConcreteBuilder (具体建造者) :实现接口， 构建和装配各个部件。
- Director (指挥者) :构建一个使用Builder接口的对象。它主要是用于创建一个复杂的对象。它主要有两个作用，一是:隔离了客户与对象的生产过程，二是:负责控制产品对象的生产过程。

House.java

~~~java
//产品 --> Product
public class House {
    private String baise;
    private String wall;
    private String roofed;

    public String getBaise() {
        return baise;
    }

    public void setBaise(String baise) {
        this.baise = baise;
    }

    public String getWall() {
        return wall;
    }

    public void setWall(String wall) {
        this.wall = wall;
    }

    public String getRoofed() {
        return roofed;
    }

    public void setRoofed(String roofed) {
        this.roofed = roofed;
    }
}
~~~

HouseBuild.java

~~~java
//抽象的建造者
public abstract class HouseBuild {
    protected House house = new House();

    //将建造的流程写好，抽象的方法
    public abstract void buildBasic();
    public abstract void buildWalls();
    public abstract void roofed();

    //建造房子
    public House buildHouse(){
        return house;
    }

}
~~~

CommonHouse.java

~~~java
public class CommonHouse extends HouseBuild {
    @Override
    public void buildBasic() {
        System.out.println("普通房子打地基5米");
    }

    @Override
    public void buildWalls() {
        System.out.println("普通房子砌墙10cm");
    }

    @Override
    public void roofed() {
        System.out.println("普通房子屋顶");
    }
}
~~~

HighBuilding.java

~~~java
public class HighBuilding extends HouseBuild{
    @Override
    public void buildBasic() {
        System.out.println("高楼打地基50米");
    }

    @Override
    public void buildWalls() {
        System.out.println("高楼砌墙20cm");
    }

    @Override
    public void roofed() {
        System.out.println("高楼屋顶");
    }
}
~~~

HouseDirector.java

~~~java
public class HouseDirector {
    HouseBuild houseBuilder = null;

    //构造器传入 houseBuilder

    public HouseDirector(HouseBuild houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    //通过setter 传入 houseBuilder

    public void setHouseBuilder(HouseBuild houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    //如何处理建造房子的流程，交给指挥者
    public House constructHouse() {
        houseBuilder.buildBasic();
        houseBuilder.buildWalls();
        houseBuilder.roofed();
        return houseBuilder.buildHouse();
    }
}
~~~

在jdk中StringBuilder 就使用到了建造者模式

> 使用细节

- 客户端(使用程序)不必知道产品内部组成的细节，将产品本身与产品的创建过程解耦，使得相同的创建过程可以创建不同的产品对象
- 每一个具体建造者都相对独立，而与其他的具体建造者无关，因此可以很方便地替换具体建造者或增加新的具体建造者， 用户使用不同的具体建造者即可得到不同的产品对象
- 可以更加精细地控制产品的创建过程。将复杂产品的创建步骤分解在不同的方法中，使得创建过程更加清晰，也更方便使用程序来控制创建过程
- 增加新的具体建造者无须修改原有类库的代码，指挥者类针对抽象建造者类编程，系统扩展方便，符合“开闭原则”
- 建造者模式所创建的产品一-般具有较多的共同点，其组成部分相似，如果产品之间的差异性很大，则不适合使用建造者模式，因此其使用范围受到一定的限制。
- 如果产品的内部变化复杂，可能会导致需要定义很多具体建造者类来实现这种变化，导致系统变得很庞大，因此在这种情况下，要考虑是否选择建造者模式.
- **抽象工厂模式VS建造者模式**<br>抽象工厂模式实现对产品家族的创建，一个产品家族是这样的一系列产品:具有不同分类维度的产品组合，采用抽象工厂模式不需要关心构建过程，只关心什么产品由什么工厂生产即可。而建造者模式则是要求按照指定的蓝图建造产品，它的主要目的是通过组装零配件而产生-一个新产品

### 5，适配器模式

>基本介绍

- 适配器模式(Adapter Pattern)将某个类的接口转换成客户端期望的另一个接口表示，主的目的是兼容性，让原本因接口不匹配不能一起工作的两个类可以协同工作。其别名为包装器(Wrapper)
- 适配器模式属于结构型模式
- 主要分为三类: 类适配器模式、对象适配器模式、接口适配器模式

> 工作原理

- 适配器模式:将一个类的接口转换成另一种接口.让原本接口不兼容的类可以兼容
- 从用户的角度看不到被适配者，是解耦的
- 用户调用适配器转化出来的目标接口方法，适配器再调用被适配者的相关接口方法
- 用户收到反馈结果，感觉只是和目标接口交互

#### (1)，类适配器模式

> 介绍

Adapter类，通过继承src类，实现dst类接口，完成src->dst的适配。

> 注意事项

- Java是单继承机制，所以类适配器需要继承src类这一 点算是-一个缺点，因为这要求dst必须是接口，有一定局限性;
- src类的方法在Adapter中都会暴露出来，也增加了使用的成本。
- 由于其继承了src类， 所以它可以根据需求重写src类的方法， 使得Adapter的灵活性增强了。

Voltage220V.java

~~~java
public class Voltage220V {
    //输出220伏的电压
    public int output220V(){
        int src = 220;
        System.out.println("电压=" + src + "伏");
        return src;
    }
}
~~~

Voltage5V.java

~~~java
public interface Voltage5V {
    public int output5V();
}
~~~

VoltageAdapter.java

```java
public class VoltageAdapter extends Voltage220V implements Voltage5V {
    @Override
    public int output5V() {
        //获取220V的电压
        int src = output220V();
        return src / 44;
    }
}
```

Phone.java

~~~java
public class Phone {
    //充电
    public void charging(Voltage5V voltage5V){
        if (voltage5V.output5V() == 5){
            System.out.println("电压5v，可以充电");
        }else if(voltage5V.output5V() > 5){
            System.out.println("电压大于5V，不能充电");
        }
    }
}
~~~

#### (2)，对象适配器模式

> 介绍

- 基本思路和类的适配器模式相同，只是将Adapter类作修改，不是继承src类，而是持有SrC类的实例，以解决兼容性的问题。即:持有src类，实现dst类接口，完成Src->dst的适配
- 根据“合成复用原则”，在系统中尽量使用关联关系来替代继承关系。
- 对象适配器模式是适配器模式常用的一种

> 细节

1. 对象适配器和类适配器其实算是同一种思想，只不过实现方式不同。
2. 根据合成复用原则，使用组合替代继承，所以它解决 了类适配器必须继承src的局限性问题，也不再要求dst必须是接口。
3. 使用成本更低，更灵活。

Voltage220V.java

```java
public class Voltage220V {
    //输出220伏的电压
    public int output220V(){
        int src = 220;
        System.out.println("电压=" + src + "伏");
        return src;
    }
}
```

Voltage5V.java

~~~java
public interface Voltage5V {
    public int output5V();
}
~~~

VoltageAdapter.java

~~~java
public class VoltageAdapter implements Voltage5V {

    private Voltage220V output220V;

    //通过构造器传入一个Voltage220V的实例
    public VoltageAdapter(Voltage220V output220V) {
        this.output220V = output220V;
    }

    @Override
    public int output5V() {
        int dst = 0;
        if (null != output220V){
            //获取220v的电压
            int src = output220V.output220V();
            System.out.println("使用对象适配器进行适配");
            dst = src / 44;
            System.out.println("适配完成，输出的电压是" + dst);
        }
        return dst;
    }
}
~~~

Phone.java

~~~java
public class Phone {
    //充电
    public void charging(Voltage5V voltage5V){
        if (voltage5V.output5V() == 5){
            System.out.println("电压5v，可以充电");
        }else if(voltage5V.output5V() > 5){
            System.out.println("电压大于5V，不能充电");
        }
    }
}
~~~

#### (3)，接口适配器模式

> 介绍

1. 一些书籍称为:适配器模式(Default Adapter Pattern)或缺省适配器模式。
2. 当不需要全部实现接口提供的方法时，可先设计- -个抽象类实现接口，并为该接口中每个方法提供一个默认实现(空方法)，那么该抽象类的子类可有选择地覆盖父类的某些方法来实现需求
3. 适用于一个接口不想使用其所有的方法的情况。

#### (4)，SpringMVC源码

SpringMvc中的HandlerAdapter,就使用了适配器模式