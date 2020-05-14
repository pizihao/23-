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

