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
//静态内部类
class Singleton {
    //私有构造器
    private Singleton(){}
    //使用静态私有内部类创建实例对象
    //放外部类被装载时内部类不会被装载
    //内部类被装载时是线程安全的
    private static class SingletonInstance {
        private static final Singleton INSTANCE = new Singleton();
    }
    //返回实例对象
    public static Singleton getInstance() {
        return SingletonInstance.INSTANCE;
    }
}
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

> 基本介绍

1. 抽象工厂模式:定义了一个interface用于创建相关或有依赖关系的对象簇，而无需指明具体的类
2. 抽象工厂模式可以将简单工厂模式和工厂方法模式进行整合。
3. 从设计层面看，抽象工厂模式就是对简单工厂模式的改进(或者称为进一步的抽象)。
4. 将工厂抽象成两层，AbsFactory(抽象工厂) 和具体实现的工厂子类。程序员可以根据创建对象类型使用对应的工厂子类。这样将单个的简单工厂类变成了工厂族，更利于代码的维护和扩展。




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

#### (4)，Spring MVC源码

SpringMvc中的HandlerAdapter,就使用了适配器模式

### 6，桥接模式

> 基本介绍

- 桥接模式(Bridge模式)是指:将实现与抽象放在两个不同的类层次中，使两个层次可以独立改变。
- 是一种结构型设计模式
- Bridge模式基于类的最小设计原则，通过使用封装、聚合及继承等行为让不同的类承担不同的职责。它的主要特点是把抽象(Abstraction)与行为实现(Implementation)分离开来，从而可以保持各部分的独立性以及应对他们的功能扩展

> 角色

1. Client类：桥接模式的调用者
2. 抽象类(Abstraction):维护了Implementor即它的实现类ConcreteImplementorA...，二者是聚合的关系，Abstraction充当了桥接类
3. RefinedAbstraction：是Abstraction抽象类的子类
4. Implementor:行为实现类的接口
5. ConcreteImplementorA/B：行为类的具体实现类
6. 从UML图：这里的抽象类和接口是聚合的关系，是调用和被调用关系

> 代码

~~~java
//接口
public interface Brand {
    void open();
    void close();
    void call();
}
~~~

~~~java
public abstract class Phone {
    //组合品牌
    private Brand brand;

    public Phone(Brand brand) {
        this.brand = brand;
    }

    protected void open() {
        this.brand.open();
    }

    protected void close() {
        this.brand.close();
    }

    protected void call() {
        this.brand.call();
    }
}
~~~

~~~java
//折叠式手机类，继承抽象类Phone
public class FoldedPhone extends Phone {

    //构造器
    public FoldedPhone(Brand brand) {
        super(brand);
    }

    public void open(){
        super.open();
        System.out.println("折叠样式的手机");
    }

    public void close(){
        super.close();
        System.out.println("折叠样式的手机");
    }

    public void call(){
        super.call();
        System.out.println("折叠样式的手机");
    }
}
~~~

~~~java
public class UpRightPhone extends Phone {
    //构造器
    public UpRightPhone(Brand brand) {
        super(brand);
    }

    public void open(){
        super.open();
        System.out.println("直立样式的手机");
    }

    public void close(){
        super.close();
        System.out.println("直立样式的手机");
    }

    public void call(){
        super.call();
        System.out.println("直立样式的手机");
    }
}
~~~

~~~java
public class Vivo implements Brand {
    @Override
    public void open() {
        System.out.println("Vivo手机开机");
    }

    @Override
    public void close() {
        System.out.println("Vivo手机关机");
    }

    @Override
    public void call() {
        System.out.println("Vivo手机打电话");
    }
}
~~~

~~~java
public class XiaoMi implements Brand {
    @Override
    public void open() {
        System.out.println("XiaoMi手机开机");
    }

    @Override
    public void close() {
        System.out.println("XiaoMi手机关机");
    }

    @Override
    public void call() {
        System.out.println("XiaoMi手机打电话");
    }
}
~~~



> JDBC中的应用

Jdbc 的Driver接口，如果从桥接模式来看，Driver就是一个接口，下面可以有MySQL的Driver，Oracle的Driver，这些就可以当做实现接口类

> 注意事项

1. 实现了抽象和实现部分的分离，从而极大的提供了系统的灵活性，让抽象部分和实现部分独立开来，这有助于系统进行分层设计，从而产生更好的结构化系统。
2. 对于系统的高层部分，只需要知道抽象部分和实现部分的接口就可以了，其它的部分由具体业务来完成。
3. 桥接模式替代多层继承方案，可以减少子类的个数，降低系统的管理和维护成本。
4. 桥接模式的引入增加了系统的理解和设计难度，由于聚合关联关系建立在抽象层，要求开发者针对抽象进行设计和编程
5. 桥接模式要求正确识别出系统中两个独立变化的维度，因此其使用范围有一定的局限性，即需要有这样的应用场景。

> 应用场景

- 对于那些不希望使用继承或因为多层次继承导致系统类的个数急剧增加的系统，桥接模式尤为适用。
- 常见的应用场景0:
  - JDBC驱动程序
  - 银行转账系统
  - 转账分类:网上转账，柜台转账，AMT转账
  - 转账用户类型:普通用户，银卡用户，金卡用户..
  - -消息管理
  - 消息类型:即时消息，延时消息
  - 消息分类:手机短信，邮件消息，QQ消息....

### 7，装饰者模式

> 星巴克咖啡订单项目

1. 咖啡种类/单品咖啡: Espresso(意大利浓咖啡)、 ShortBlack、 LongBlack(美式
   咖啡)、Decaf(无因咖啡)
2. 调料: Milk、 Soy(豆浆)、Chocolate
3. 要求在扩展新的咖啡种类时，具有良好的扩展性、改动方便、维护方便
4. 使用〇〇的来计算不同种类咖啡的费用:客户可以点单品咖啡，也可以单品咖
   啡+调料组合。

> 解决星巴克咖啡订单问题

1. Drink是一个抽象类，表示饮料
2. des就是对咖啡的描述，比如咖啡的名字
3. cost()方法就是计算费用，Drink 类中做成-一个抽象方法.
4. Decaf就是单品咖啡，继承Drink,并实现cost
5. Espress && Milk就是单品咖啡+调料，这个组合 很多
6. 问题:这样设计，会有很多类，当我们增加一个单品咖啡，或者一个新的调料，
   类的数量就会倍增。

> 解决  方案二

将前面的方案进行改进，将调料内置到Drink类，这样就不会造成类数量过多，从而提高项目的可维护性

上述的milk,soy,chocolate 可以设计为Boolean，表示是否要添加相应的调料

> 方案二存在的问题

1. 方案2可以控制类的数量，不至于造成很多的类
2. 在增加或者删除调料种类时，代码的维护量很大
3. 考虑到用户可以添加多份调料时，可以将hasMilk 返回一个对应int
4. 考虑使用装饰者模式

> 装饰者模式定义

1. 装饰者模式：动态的将新功能附加到对象上，在对象功能扩展方面，他比继承更有弹性，装饰者模式也体现了开闭原则(ocp)

> 代码

~~~java
public abstract class Dink {

    //描述
    private String des;
    private float price = 0.0f;

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    //计算费用的抽象方法
    //子类来实现
    public abstract float cost();
}
~~~

~~~java
//具体的Decorator 这里就是调味品
public class Chocolate  extends  Decorator{
    public Chocolate(Dink obj) {
        super(obj);
        setDes("巧克力");
        //调味品的价格
        setPrice(3.0f);
    }
}
~~~

~~~java
public class Coffee extends Dink {
    @Override
    public float cost() {
        return super.getPrice();
    }
}
~~~

~~~java
public class Decorator extends Dink {
    private Dink obj;

    public Decorator(Dink obj) {
        this.obj = obj;
    }

    @Override
    public float cost() {
        //getPrice 自己的价格
        return super.getPrice() + obj.cost();
    }

    @Override
    public String getDes() {
        //obj.getDes()被装饰者的信息
        return super.getDes() +""+super.getPrice()+" && "+ obj.getDes();
    }
}
~~~

~~~java
public class Espresso extends Coffee{
    public Espresso (){
        setDes("意大利咖啡");
        setPrice(6.0f);
    }
}
~~~

~~~java
public class LongBack extends Coffee {
    public LongBack (){
        setDes("LongBack");
        setPrice(5.0f);
    }
}
~~~

~~~java
public class Milk extends  Decorator{
    public Milk(Dink obj) {
        super(obj);
        setDes("牛奶");
        //调味品的价格
        setPrice(3.5f);
    }
}
~~~

~~~java
public class ShortBlack extends Coffee {
    public ShortBlack() {
        setDes("ShortBlack");
        setPrice(4.0f);
    }
}
~~~

~~~java
public class Soy extends  Decorator{
    public Soy(Dink obj) {
        super(obj);
        setDes("豆浆");
        //调味品的价格
        setPrice(2.5f);
    }
}
~~~

> JDK源码分析

Java的IO结构，FileInputStream就是一个装饰者

### 8，组合模式

> 看一个学校院系展示需求

编写程序展示一个学校院系结构:需求是这样，要在一个页面中展示出学校的院系组成，一个学校有多个学院，一个学院有多个系。如:

- 清华大学
  - 计算机学院
    - 计算机科学与技术
    - 软件工程
    - 网络工程
  - 信息工程学院
    - 通信工程
    - 信息工程

> 基本介绍

1. 组合模式(Composite Pattern) ，又叫部分整体模式，它创建了对象组的树形结构，将对象组合成树状结构以表示“整体-部分”的层次关系。
2. 组合模式依据树形结构来组合对象，用来表示部分以及整体层次。
3. 这种类型的设计模式属于结构型模式。
4. 组合模式使得用户对单个对象和组合对象的访问具有一致性，即:组合能让客户以一致的方式处理个别对象以及组合对象

> 代码

~~~java
public abstract class OrganizationComponent {
    private String name; //名字
    private String des; //说明

    protected void add(OrganizationComponent organizationComponent){
        //默认实现
        //抛出不支持操作的异常
        throw new UnsupportedOperationException();
    }

   protected void remove(OrganizationComponent organizationComponent){
        //默认实现
       throw new UnsupportedOperationException();
   }

    public OrganizationComponent(String name, String des) {
        this.name = name;
        this.des = des;
    }

    //子类都需要实现
    protected abstract void print();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }
}
~~~

~~~java
public class College extends OrganizationComponent {

    //这个list中存放的是Department
    List<OrganizationComponent> organizationComponents = new ArrayList<>();

    //构造器
    public College(String name, String des) {
        super(name, des);
    }

    @Override
    protected void add(OrganizationComponent organizationComponent) {
        organizationComponents.add(organizationComponent);
    }

    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        organizationComponents.remove(organizationComponent);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDes() {
        return super.getDes();
    }

    //输出University包含的学院
    @Override
    protected void print() {
        System.out.println("=== "+ getName() +" ===");
        //遍历organizationComponents
        organizationComponents.forEach(OrganizationComponent::print);
    }
}
~~~

~~~java
public class Department extends OrganizationComponent {

    //构造器
    public Department(String name, String des) {
        super(name, des);
    }

    //add， remove 就不用写了，因为是叶子节点，不需要去管理其他单位
    @Override
    protected void print() {
        System.out.println("==="+ getName() +"===");
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDes() {
        return super.getDes();
    }
}
~~~

~~~java
public class University extends OrganizationComponent {

    List<OrganizationComponent> organizationComponents = new ArrayList<>();

    //构造器
    public University(String name, String des) {
        super(name, des);
    }

    @Override
    protected void add(OrganizationComponent organizationComponent) {
        organizationComponents.add(organizationComponent);
    }

    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        organizationComponents.remove(organizationComponent);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDes() {
        return super.getDes();
    }

    //输出University包含的学院
    @Override
    protected void print() {
        System.out.println("=== "+ getName() +" ===");
        //遍历organizationComponents
        organizationComponents.forEach(OrganizationComponent::print);
    }
}
~~~

~~~java
public class Client {
    public static void main(String[] args) {
        //从大到小创建对象
        //学校
        OrganizationComponent university = new University("清华大学","中国大学");
        //创建学院
        OrganizationComponent computerCollege = new College("计算机学院", "最牛的学院");
        OrganizationComponent infoEngineerCollege = new College("信息工程学院", "一般的学院");
        //创建各个学院下的专业
        computerCollege.add(new Department("软件工程","软件工程"));
        computerCollege.add(new Department("网络工程","网络工程"));
        computerCollege.add(new Department("计算机科学与技术","计算机科学与技术"));

        infoEngineerCollege.add(new Department("通信工程","通信工程"));
        infoEngineerCollege.add(new Department("信息工程","信息工程"));

        //将两个学院加入到学校
        university.add(computerCollege);
        university.add(infoEngineerCollege);

        university.print();

    }
}
~~~



> 解决的问题

1. 组合模式解决这样的问题，当我们的要处理的对象可以生成一颗树形结构，而我们要对树上的节点和叶子进行操作时，它能够提供一致的方式， 而不用考虑它是节点还是叶子

> JDK源码

1. Java的集合类Hashmap就用到了组合模式

### 9，外观模式

> 传统方法的问题

1. 在ClientTest的main方法中，创建各个子系统的对象，并直接去调用子系统(对象)相关方法，会适成调用过程混乱，没有清晰的过程
2. 不利于在ClientTest中，去维护对子系统的操作
3. 解决思路:定义一个高层接口，给子系统中的一组接口提供一个一致的界面(比如在高层接口提供四个方法ready, play, pause, end),用来访问子系统中的一群接口
4. 也就是说就是通过定义一个-致的接口(界面类)，用以屏蔽内部子系统的细节，使得调用端只需跟这个接口发生调用，而无需关心这个子系统的内部细节=> 外观模式

> 基本介绍

1. 外观模式(Facade)，也叫过程模式，外观模式为子系统中的一组接口提供一个一致的界面，此模式定义了一个高层接口，这个接口使得这一子系统更加容易使用
2. 外观模式通过定义一个一致的接口，用以屏蔽内部子系统的细节，使得调用端只需跟这个接口发生调用，而无需关心这个子系统的内部细节

> 角色

1. 外观类：为调用端提供统一的调用接口，外观类知道哪些子系统负责处理请求，从而将调用端的请求代理给适当子系统对象
2. 调用者：外观接口的调用者
3. 子系统集合：指模块或者子系统，处理外观对象指派的任务，他是功能的实际提供者

> 代码

~~~java
public class DVDPlayer {
    //使用单例模式，使用饿汉式
    private static DVDPlayer instance = new DVDPlayer();

    public static DVDPlayer getInstance() {
        return instance;
    }

    public void on(){
        System.out.println("dvd on");
    }

    public void off(){
        System.out.println("dvd off");
    }

    public void play(){
        System.out.println("dvd is playing");
    }

    public void pause(){
        System.out.println("dvd pause...");
    }
}
~~~

~~~java
public class HomeTheaterFacade {
    //定义各个子系统对象
    private TheaterLight theaterLight;
    private Popcorn popcorn;
    private Stereo stereo;
    private Projector projector;
    private Screen screen;
    private DVDPlayer dvdPlayer;

    //构造器

    public HomeTheaterFacade() {
        this.theaterLight = TheaterLight.getInstance();
        this.popcorn = Popcorn.getInstance();
        this.stereo = Stereo.getInstance();
        this.projector = Projector.getInstance();
        this.screen = Screen.getInstance();
        this.dvdPlayer = DVDPlayer.getInstance();
    }

    //操作分4步
    public void ready(){
        popcorn.on();
        popcorn.pop();
        screen. down();
        projector.on();
        stereo.on();
        dvdPlayer.on();
        theaterLight.dim();
    }

    public void play(){
        dvdPlayer.play();
    }

    public void pause(){
        dvdPlayer.pause();
    }

    public void end(){
        popcorn.off();
        theaterLight.bright();
        screen. up();
        projector.off();
        stereo.off();
        dvdPlayer.off();
    }
}
~~~

~~~java
public class Popcorn {
    //使用单例模式，使用饿汉式
    private static Popcorn instance = new Popcorn();

    public static Popcorn getInstance() {
        return instance;
    }

    public void on(){
        System.out.println("Pop on");
    }

    public void off(){
        System.out.println("Pop off");
    }

    public void pop(){
        System.out.println("Pop is poping");
    }
}
~~~

~~~java
public class Projector {
    //使用单例模式，使用饿汉式
    private static Projector instance = new Projector();

    public static Projector getInstance() {
        return instance;
    }

    public void on(){
        System.out.println("Projector on");
    }

    public void off(){
        System.out.println("Projector off");
    }

    public void play(){
        System.out.println("Projector is playing");
    }

    public void focus(){
        System.out.println("Projector focus...");
    }
}
~~~

~~~java
public class Screen {
    //使用单例模式，使用饿汉式
    private static Screen instance = new Screen();

    public static Screen getInstance() {
        return instance;
    }

    public void up(){
        System.out.println("Screen up");
    }

    public void down(){
        System.out.println("Screen down");
    }
}
~~~

~~~java
public class Stereo {
    //使用单例模式，使用饿汉式
    private static Stereo instance = new Stereo();

    public static Stereo getInstance() {
        return instance;
    }

    public void on(){
        System.out.println("Stereo on");
    }

    public void off(){
        System.out.println("Stereo off");
    }

    public void up(){
        System.out.println("Stereo up");
    }

    public void down(){
        System.out.println("Stereo down");
    }
}
~~~

~~~java
public class TheaterLight {
    //使用单例模式，使用饿汉式
    private static TheaterLight instance = new TheaterLight();

    public static TheaterLight getInstance() {
        return instance;
    }

    public void on(){
        System.out.println("Stereo on");
    }

    public void off(){
        System.out.println("Stereo off");
    }

    public void dim(){
        System.out.println("Stereo dim");
    }

    public void bright(){
        System.out.println("Stereo bright");
    }
}
~~~

~~~java
public class Client {
    public static void main(String[] args) {
        //统一调用
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();
        homeTheaterFacade.ready();
        homeTheaterFacade.play();
    }
}
~~~


> 传统方式解决影院管理说明

1. 外观模式可以理解为转换一群接口， 客户只要调用一个接口，而不用调用多个接口才能达到目的。比如:在pc上安装软件的时候经常有一-键安装选项(省去选择安装目录、安装的组件等等)，还有就是手机的重启功能(把关机和启动合为一个操作)。
2. 外观模式就是解决多个复杂接口帶来的使用困难，起到简化用户操作的作用

> 在mybatis应用的源码

MyBatis中的Configuration去创建MetaObject对象使用到外观模式

### 10，享元模式

> 一个项目需求

小型的外包项目，给客户A做一个产品展示网站，客户A的朋友感觉效果不错，也希望做这样的产品展示网站，但是要求都有些不同: 

1. 有客户要求以新闻的形式发布
2. 有客户人要求以博客的形式发布
3. 有客户希望以微信公众号的形式发布。

> 基本介绍

- 享元模式(FIyweight Pattern)也叫蝇量模式:运用共享技术有效地支持大量细粒度的对象
- 常用于系统底层开发，解决系统的性能问题。像数据库连接池，里面都是创建好的连接对象，在这些连接对象中有我们需要的则直接拿来用，避免重新创建，如果没有我们需要的，则创建一个
- 享元模式能够解决重复对象的内存浪费的问题，当系统中有大量相似对象，需要缓冲池时。不需总是创建新对象，可以从缓冲池里拿。这样可以降低系统内存，同时提高效率
- 享元模式经典的应用场景就是池技术了，String常量池、数据库连接池、缓冲池等等都是享元模式的应用，享元模式是池技术的重要实现方式

> 角色

1. FlyWeight 是抽象的享元角色，他是产品的抽象类，同时定义出对象的外部状态和内部状态的接口或实现
2. ConcreteFlyWeight 是具体的享元角色，是具体的产品类，实现抽象角色定义相关业务
3. UNSharedConcreteFlyWeight 是不可共享的角色，一般不会出现在享元工厂
4. FlyWeightFactory 享元构建一个池容器，同时提供从池中获取对象方法

> 代码

~~~java
//具体的网站
public class ConcreteWebSite extends WebSite {

    private String type = "";

    public ConcreteWebSite(String type) {
        this.type = type;
    }

    @Override
    public void use() {
        System.out.println("网站的发布形式为：" + type);
    }
}
~~~

~~~java
public abstract class WebSite {
    public abstract void use();
}
~~~

~~~java
//网站工厂类
public class WebSiteFactory {
    //集合 充当池的作用
    private HashMap<String, ConcreteWebSite> pool = new HashMap<>();

    //根据网站的类型，返回一个网站，如果没有就创建一个网站
    public WebSite getWebSite(String type){
        if (!pool.containsKey(type)){
            //没有就创建一个并放入池中
            pool.put(type, new ConcreteWebSite(type));
        }
        return (WebSite)pool.get(type);
    }

    //获取池中网站分类的总数(池中有多少个网站类型)
    public int getWebSiteCount(){
        return pool.size();

    }
}
~~~

~~~java
public class Client {
    public static void main(String[] args) {
        //创建一个工厂类
        WebSiteFactory factory = new WebSiteFactory();
        //客户要一个以新闻形式发布的网站
        WebSite webSite1 = factory.getWebSite("新闻");
        webSite1.use();
    }
}

~~~


> 源码

JDK中的Integer 使用的是享元模式

> 注意细节

1. 在享元模式这样理解， 剪"就表示共享， 元表示对象
2. 系统中有大量对象，这些对象消耗大量内存，并且对象的状态大部分可以外部化时,我们就可以考虑选用享元模式
3. 用唯一标识码判断，如果在内存中有，则返回这个唯一标识码所标识的对象，用HashMap/HashTable存储
4. 享元模式大大减少了对象的创建，降低了程序内在的占用，提高效率
5. 享元模式提高了系统的复杂度。需要分离出内部状态和外部状态，而外部状态具有固化特性，不应该随着内部状态的改变而改变，这是我们使用享元模式需要注意的地方.
6. 使用享元模式时，注意划分内部状态和外部状态，并且需要有一个工厂类加以控制。
7. 享元模式经典的应用场景是需要缓冲池的场景，比如String常量池、 数据库连接池

### 11，代理模式

> 说明

1. 代理模式:为一个对象提供一个替身，以控制对这个对象的访问。即通过代理对象访问目标对象.这样做的好处是:可以在目标对象实现的基础上,增强额外的功能操作,即扩展目标对象的功能。
2. 被代理的对象可以是远程对象、创建开销大的对象或需要安全控制的对象
3. 代理模式有不同的形式，主要有三种静态代理、动态代理(JDK代理、接口代理)和Cglib代理(可以在内存中动态的创建对象，而不需要实现接口，他是属于动态代理的范畴)。

#### (1)，静态代理

> 基本介绍

- 静态代理在使用时，需要定义接口或者父类,被代理对象(即目标对象)与代理对象一起实现相同的接口或者是继承相同父类

> 应用实例

1. 定义一个接口:ITeacherDao
2. 目标对象TeacherDAO实现接口ITeacherDAO
3. 使用静态代理方式,就需要在代理对象TeacherDAOProxy中也实现ITeacherDAO
4. 调用的时候通过调用代理对象的方法来调用目标对象.
5. 特别提醒:代理对象与目标对象要实现相同的接口,然后通过调用相同的方法来调用目标对象的方法。

> 代码

~~~java
public interface ITeacherDao {
    void teach();
}
~~~

~~~java
public class TeacherDao implements ITeacherDao {
    @Override
    public void teach() {
        System.out.println("老师正在授课");
    }
}
~~~

~~~java
//代理对象，静态代理
public class TeacherDaoProxy implements ITeacherDao{

    //目标对象
    private ITeacherDao iTeacherDao;

    //构造器
    public TeacherDaoProxy(ITeacherDao iTeacherDao) {
        this.iTeacherDao = iTeacherDao;
    }

    @Override
    public void teach() {
        System.out.println("代理开始");

        iTeacherDao.teach();

        System.out.println("提交。代理结束");
    }
}
~~~

~~~java
public class Client {
    public static void main(String[] args) {
        //创建目标对象
        TeacherDao teacherDao = new TeacherDao();
        //创建代理对象 同时将被代理对象传递给代理对象
        TeacherDaoProxy teacherDaoProxy = new TeacherDaoProxy(teacherDao);
        //通过代理对象，调用被代理对象的方法
        //即执行的是代理对象的方法。代理对象再去执行目标对象的方法
        teacherDaoProxy.teach();

    }
}
~~~



#### (2)，动态代理

> 基本介绍

1. 代理对象,不需要实现接口，但是目标对象要实现接口，否则不能用动态代理
2. 代理对象的生成，是利用JDK的API, 动态的在内存中构建代理对象
3. 动态代理也叫做: JDK代理、 接口代理

> 代码

~~~java
public interface ITeacherDao {
    void teach();
}
~~~

~~~java
public class ProxyFactory {
    //维护目标对象，Object
    private Object target;

    //构建构造器时对target进行初始化
    public ProxyFactory(Object target) {
        this.target = target;
    }
    //给目标对象生成代理对象
    /**
     * ClassLoader loader : 指定当前目标对象使用的类加载器，获取加载器的方法固定
     * Class<?> interfaces : 目标对象实现的接口类型，使用泛型方法确认类型
     * InvocationHandler h : 事件处理，执行目标对象的方法时，会触发事件处理器的方法，会把当前执行目标对象方法传入
     */
    public Object getProxyInstance() {
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                (proxy, method, args) -> {
                    System.out.println("JDK代理开始");
                    return method.invoke(target, args);
                });
    }
}
~~~

~~~java
public class TeacherDao implements ITeacherDao {
    @Override
    public void teach() {
        System.out.println("老师正在授课");
    }
}
~~~

~~~java
public class Client {
    public static void main(String[] args) {
       //创建目标对象
        ITeacherDao target = new TeacherDao();
        //给目标对象创建代理对象 可以转成ITeacherDao
        ITeacherDao proxyInstance = (ITeacherDao) new ProxyFactory(target).getProxyInstance();
        System.out.println("proxyInstance:" + proxyInstance);
    }
}
~~~



#### (3)，Cglib代理

1. 静态代理和JDK代理模式都要求且标对象是实现一个接口,但是有时候目标对象只是一个单独的对家,并没有实现任何的接口,这个时候可使用目标对象子类来实现代理-这就是Cglib代理
2. Cglib代理也叫作子类代理,它是在内存中构建一个子类对 象从而实现对目标对象功能扩展,有些书也将Cglib代理归属到动态代理。
3. Cglib是一个强大的高性能的代码生成包,它可以在运行期扩展java类与实现java接口，它广泛的被许多AOP的框架使用,例如Spring AOP,实现方法拦截
4. 在AOP编程中如何选择代理模式:
   - 目标对象需要实现接口，用JDK代理
   - 目标对象不需要实现接口，用Cglib代理
5. Cglib包的底层是通过使用字节码处理框架ASM来转换字节码并生成新的类

### 12，模板模式

> 案例介绍

1. 制作豆浆的流程选材--添加配料--浸泡-放到豆浆机打碎
2. 通过添加不同的配料，可以制作出不向门味的豆浆
3. 选材、浸泡和放到豆浆机打碎这几个步骤对于制作每种口味的豆浆都是一样的
4. 请使用模板方法模式完成(说明:因为模板方法模式，比较简单，很容易就想到这个方案，因此就直接使用，不再使用传统的方案来引出模板方法模式) .

> 基本介绍

1. 模板方法模式(Template Method Pattern)，又叫模板模式(Template Pattern)， 在一个抽象类公开定文了执行它的方法的模板。它的子类可以按需要重写方法实现，但调用将以抽象类中定义的方式进行。
2. 简单说，模板方法模式定义-一个操作中的算法的骨架，而将一些步骤延迟到子类中，使得子类可以不改变一个算法的结构，就可以重定义该算法的某些特定步骤。

> 模板方法模式中的钩子方法

1. 在模板方法模式的父类中，我们可以定义一个方法，它默认不做任何事,子类可以视情况要不要覆盖它，该方法称为“钩子”。
2. 还是用上面做豆浆的例子来讲解，比如，我们还希望制作纯豆浆，不添加任何的配料，请使用钩子方法对前面的模板方法进行改造

> 代码

~~~java
public class PeanutSoyMilk extends SoyaMilk {
    @Override
    void addCondimerts() {
        System.out.println("第二步，加入上好的花生");
    }
}
~~~

~~~java
public class PureSoyaMilk extends SoyaMilk{
    @Override
    void addCondimerts() {
        //空实现
    }

    @Override
    boolean customerWantCondiments() {
        return false;
    }
}
~~~

~~~java
public class RedBeanSoyMilk extends  SoyaMilk{
    @Override
    void addCondimerts() {
        System.out.println("第二步，加入上好的红豆");
    }
}
~~~

~~~java
public abstract class SoyaMilk {
    //模板方法，make，模板方法可以做成final 不让子类去覆盖
    final void make(){
        select();
        customerWantCondiments();
        addCondimerts();
        soak();
        beat();
    }
    //选材料
    void select(){
        System.out.println("第一步选择好新鲜的黄豆");
    }
    //添加不同的配料 抽象方法
    abstract void addCondimerts();
    //浸泡
    void soak(){
        System.out.println("第三布，黄豆和配料开始浸泡需要三小时");
    }
    void beat(){
        System.out.println("第四步，黄豆和配料放到豆浆机里去了");
    }
    //钩子方法，决定是否需要添加配料
    boolean customerWantCondiments(){
        return true;
    }
}
~~~

~~~java
public class Client {
    public static void main(String[] args) {
        //制作红豆豆浆
        System.out.println("===制作红豆豆浆===");
        SoyaMilk redBeanSoyMilk = new RedBeanSoyMilk();
        redBeanSoyMilk.make();
        //制作花生豆浆
        System.out.println("===制作花生豆浆===");
        SoyaMilk  peanutSoyMilk = new PeanutSoyMilk();
        peanutSoyMilk.make();
        //制作纯豆浆
        System.out.println("===制作纯豆浆===");
        SoyaMilk  pureSoyaMilk = new PureSoyaMilk();
        pureSoyaMilk.make();
    }
}
~~~

> 源码

Spring IOC容器初始化时运用到了模板方法模式

### 13，命令模式

> 基本介绍

1. 命令模式(Command Pattem) :在软件设计中，我们经常需要向某些对象发送请求，但是并不知道请求的接收者是谁，也不知道被请求的操作是哪个，我们只需在程序运行时指定具体的请求接收者即可，此时，可以使用命令模式来进行设计
2. 命名模式使得请求发送者与请求接收者消除彼此之间的耦合，让对象之间的调用关系更加灵活，实现解耦。
3. 在命名模式中，会将一个请求封装为一个对象，以便使用不同参数来表示不同的请求(即命名)，同时命令模式也支持可撤销的操作
4. 通俗易懂的理解:将军发布命令，士兵去执行。其中有几个角色:
   将军(命令发布者)、士兵(命令的具体执行者)、 命令(连接将军和士兵)。
   Invoker是调用者(将军)，Receiver是被调用者(士兵) ,MyCommand是命令，实现了Command接口，持有接收对象

> 角色

1. Invoker 是调用者角色
2. Command 是命令角色，需要执行的所有命令都在这里，可以是接口或者抽象类
3. Receiver 接收者角色，知道如何实施和执行一个请求相关的操作
4. ConcreteCommand 将一个接收者对象与一个动作绑定，调用接收者相应的操作，实现execute

> 代码

~~~java
//创建命令接口
public interface Command {
    //执行操作(动作)
    public void execute();
    //撤销操作(动作)
    public void undo();
}
~~~

~~~java
public class LightOffCommand implements Command {
    //聚合LightReceiver
    LightReceiver light;

    //构造器
    public LightOffCommand(LightReceiver light) {
        this.light = light;
    }

    @Override
    public void execute() {
        //调用接收者的方法
        light.off();
    }

    @Override
    public void undo() {
        //调用接收者的方法
        light.on();
    }
}
~~~

~~~java
public class LightOnCommand implements Command {

    //聚合LightReceiver
    LightReceiver light;

    //构造器
    public LightOnCommand(LightReceiver light) {
        this.light = light;
    }

    @Override
    public void execute() {
        //调用接收者的方法
        light.on();
    }

    @Override
    public void undo() {
        //调用接收者的方法
        light.off();
    }
}
~~~

~~~java
public class LightReceiver {
    public void on(){
        System.out.println("电灯打开了");
    }
    public void off(){
        System.out.println("电灯关闭了");
    }
}
~~~

~~~java
//没有任何命令，即空执行，用于初始化每个按钮 当调用命令为空时，什么都不做
public class NoCommand implements Command{
    @Override
    public void execute() {

    }

    @Override
    public void undo() {

    }
}
~~~

~~~java
public class RemoteConteoller {

    //开按钮命令数组
    private Command[] onCommands;
    private Command[] offCommands;
    //执行数据的命令
    Command undoCommand;

    //构造器 完成对按钮初始化
    public RemoteConteoller(){
        onCommands = new Command[5];
        offCommands = new Command[5];

        for (int i = 0; i < 5; i++) {
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }
    //给我们的按钮设置你需要的命令
    public void setCommand(int s, Command onCommand, Command offCommand){
        onCommands[s] = onCommand;
        offCommands[s] = offCommand;
    }
    //按下开的按钮
    public void onButtonWasPushed(int no){
        //找到按下的开的按钮，并调用对应的方法
        onCommands[no].execute();
        //记录这次操作,用于撤销
        undoCommand = onCommands[no];
    }
    //按下开的按钮
    public void offButtonWasPushed(int no){
        //找到按下的关的按钮，并调用对应的方法
        offCommands[no].execute();
        //记录这次操作,用于撤销
        undoCommand = offCommands[no];
    }
    //按下撤销按钮
    public void undoButtonWasPushed(){
        undoCommand.undo();
    }

}
~~~

~~~java
public class Client {
    public static void main(String[] args) {
        //使用命令设计模式，完成通过遥控器，对点灯的操作
        LightReceiver lightReceiver = new LightReceiver();

        LightOnCommand lightOnCommand = new LightOnCommand(lightReceiver);
        LightOffCommand lightOffCommand = new LightOffCommand(lightReceiver);

        RemoteConteoller remoteConteoller = new RemoteConteoller();

        remoteConteoller.setCommand(0,lightOnCommand,lightOffCommand);

        System.out.println("-------按下灯的开的按钮-------");
        remoteConteoller.onButtonWasPushed(0);
        System.out.println("-------按下灯的关的按钮-------");
        remoteConteoller.offButtonWasPushed(0);
        System.out.println("-------按下灯的撤销的按钮-------");
        remoteConteoller.undoButtonWasPushed();

    }
}
~~~



> 源码

Spring框架的JdbcTemplate就使用到了命令模式

> 细节

1. 将发起请求的对象与执行请求的对象解耦。发起请求的对象是调用者，调用者只要调用命令对象的execute()方法就可以让接收者工作，而不必知道具体的接收者对象是谁、是如何实现的，命令对象会负责让接收者执行请求的动作，也就是说:”请求发起者”和“请求执行者”之间的解耦是通过命令对象实现的，命令对象起到了纽带桥梁的作用。
2. 容易设计一个命令队列。只要把命令对象放到列队，就可以多线程的执行命令
3. 容易实现对请求的撒销和重做
4. 命令模式不足:可能导致某些系统有过多的具体命令类，增加了系统的复杂度，这点在在使用的时候要注意
5. 空命令也是一种设计模式，它为我们省去了判空的操作。在上面的实例中，如果没有用空命令，我们每按下一个按键都要判空，这给我们编码带来一定的麻烦。
6. 命令模式经典的应用场景:界面的一个按钮都是一条命令、模拟CMD (DOS命令)订单的撤销/恢复、触发-反馈机制

### 14，访问者模式

> 测评系统

- 将观众分为男人和女人，对歌手进行测评，当看完某个歌手表演后，得到他们对该歌手不同的评价(有不同的种类，比如成功，失败等)

> 传统方式的问题

1. 如果系统比较小，还是OK的，但是考虑系统增加越来越多的新功能时，对代码改动较大，违反了ocp原则
2. 扩展性不好，比如增加了新的人员类型，或者管理方法，都不好做

> 基本介绍

1. 访问者模式(VisitorPattern)，封装一些作用于某种数据结构的各元素的操作，它可以在不改变数据结构的前提下是义作用于这些元素的新的操作。
2. 主要将数据结构与数据操作分离，解决数据结构和操作耦合性问题
3. 访问者模式的基本工作原理是:在被访问的类里面加一个对外提供接待访问者的接口
4. 访问者模式主要应用场景是:需要对一个对象结构中的对象进行很多不同操作(这些操作彼此没有关联)，同时需要避免让这些操作"污染"这些对象的类，可以选用访问者模式解决

> 角色

1. Visitor 是抽象访问者。为该对象结构中的ConcreteElement的每一个类声明一个visit操作
2. ConcreteVisitor 是一个具体的访问值 实现每个有Visitor声明的操作，是每个操作实现的部分
3. ObjectStructure 能枚举它的元素，可以提供一个高层的接口，用来允许访问者访问元素
4. Element 定义一个accept方法，接受一个访问者对象
5. ConcreteElement 为具体的原色，实现了accept方法

> 代码

~~~java
public abstract class Action {
    //得到男性的测评
    public abstract void getManResult(Man man);
    //得到女性的测评
    public abstract void getWomanResult(Woman woman);
}
~~~

~~~java
public class Fail extends Action{
    @Override
    public void getManResult(Man man) {
        System.out.println("男人给的评价是失败");
    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println("女人给的评价是失败");
    }
}
~~~

~~~java
public class Man extends Person{
    @Override
    public void accpet(Action action) {
        action.getManResult(this);
    }
}
~~~

~~~java
public class ObjectStructure {
    //维护了一个集合
    private List<Person> persons = new ArrayList<>();

    //增加到list
    public void attach(Person person){
        persons.add(person);
    }
    //移除
    public void detach(Person person){
        persons.add(person);
    }
    //显示测评情况
    public void display(Action action){
        persons.forEach(person -> {
            person.accpet(action);
        });
    }
}
~~~

~~~java
public abstract class Person {
    //提供一个方法让访问者可以访问
    public abstract void accpet(Action action);
}
~~~

~~~java
public class Success extends Action {
    @Override
    public void getManResult(Man man) {
        System.out.println("男人给的评价是成功");
    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println("女人给的评价是成功");
    }
}
~~~

~~~java
/*
* 说明
* 1. 这里我们使用到了双分派，即首先在客户端程序中，将具体状态作为参數传递Woman中(第一 次分派)
* 2. 然后Woman 类调用作为参数的"具体方法"中方法getWomanResult, 同时将自己(this)作为参数传入，完成第二次的分派
*/
public class Woman extends Person{
    @Override
    public void accpet(Action action) {
        action.getWomanResult(this);
    }
}
~~~

~~~java
public class Client {
    public static void main(String[] args) {
        ObjectStructure structure = new ObjectStructure();
        structure.attach(new Man());
        structure.attach(new Woman());

        //成功
        Success success = new Success();
        structure.display(success);

        Fail fail = new Fail();
        structure.display(fail);
    }
}
~~~



### 15，迭代器模式

> 一个需求

编写一个展示学校院系结构：需求是这样的，要在一个页面中展示出学校的院系组成，一个学校有多个学院，一个学院有多个系如：

- 计算机学院
  - Java工程师
  - 大数据工程师
  - 前端工程师
  - 信息安全
- 信息工程学院
  - 网络信息安全
  - 电子技术

> 传统方式问题分析

1. 将学院看做是学校的子类，系是学院的子类。这样实际上是站在组织大小来进行分层次的
2. 实际上我们的要求是：在一个页面中展示出学校的院系组成，一个学校有多个学院，一个学院有多个系，因此这种方案，不能很好实现遍历的操作
3. 解决方案：=>迭代器模式

> 基本介绍

1. 迭代器模式(Iterator Pattern)是常用的设计模式，属于行为型模式
2. 如果我们的集合元素是用不同的方式实现的，有数组，还有java的集合类，或者还有其他方式，当客户端要遍历这些集合元素的时候就要使用多种遍历方式，而且还会暴露元素的内部结构，可以考虑使用迭代器模式解决。
3. 迭代器模式，提供一种遍历集合元素的统一接口，用一致的方法遍历集合元素，不需要知道集合对象的底层表示，即:不暴露其内部的结构。

> 角色

1. Iterator：迭代器接口，是系统提供，含有hasNext，next，remove
2. ConcreteIterator：具体的迭代器类，管理迭代
3. Aggregate：一个统一的聚合接口，将客户端和具体聚合解耦
4. ConcreteAggreage：具体的聚合持有对象集合，并提供一个方法，返回一个迭代器，该迭代器可以正确遍历集合
5. Client，客户端，通过Iterator和Aggregate依赖子类

> 代码

~~~java
public interface College {
    public String getName();

    //增加系的方法
    public void addDepartment(String name, String desc);

    //返回一个迭代器，遍历
    public Iterator createIterator();
}
~~~

~~~java
public class ComputerCollege implements College {

    Department[] departments;
    int numOfDepartment = 0;

    public ComputerCollege() {
        departments = new Department[5];
        addDepartment("Java工程师", "Java工程师");
        addDepartment("大数据工程师", "大数据工程师");
    }

    @Override
    public String getName() {
        return "计算机学院";
    }

    @Override
    public void addDepartment(String name, String desc) {
        Department department = new Department(name, desc);
        departments[numOfDepartment] = department;
        numOfDepartment += 1;
    }

    @Override
    public Iterator createIterator() {
        return new ComputerCollegeIterator(departments);
    }
}
~~~

~~~java
public class ComputerCollegeIterator implements Iterator {

    //这里我们需要知道Department是以怎样的方式存放的
    Department [] departments;
    int position = 0; //遍历的位置

    public ComputerCollegeIterator(Department[] departments) {
        this.departments = departments;
    }

    //判断是否还有下一个元素
    @Override
    public boolean hasNext() {

        if (position >=departments.length || departments[position] == null){
            return false;
        }else {
            return true;
        }
    }

    @Override
    public Object next() {
        Department department = departments[position];
        position += 1;
        return department;
    }

    @Override
    public void remove() {
        //空实现
    }
}
~~~

~~~java
//系
public class Department {
    private String name;
    private String desc;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Department(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }
}
~~~

~~~java
public class InfoColleageiterator implements Iterator {

    List<Department> departmentList; //信息工程学院是以List方式存放系
    int index = 1;//索引

    public InfoColleageiterator(List<Department> departmentList) {
        this.departmentList = departmentList;
    }

    //判断list中还有没有下一个元素
    @Override
    public boolean hasNext() {
        if (index >= departmentList.size() - 1){
            return false;
        }else {
            index += 1;
            return true;
        }
    }

    @Override
    public Object next() {
        return departmentList.get(index);
    }

    @Override
    public void remove() {

    }
}
~~~

~~~java
public class InfoCollege implements College {

    List<Department> departmentList;

    public InfoCollege() {
        departmentList = new ArrayList<>();
        addDepartment("网络信息安全", "网络信息安全");
        addDepartment("电子技术", "电子技术");
    }

    @Override
    public String getName() {
        return "信息工程学院";
    }

    @Override
    public void addDepartment(String name, String desc) {

        Department department = new Department(name, desc);
        departmentList.add(department);

    }

    @Override
    public Iterator createIterator() {
        return new InfoColleageiterator(departmentList);
    }
}
~~~

~~~java
public class OutPutImpl {
    //学院集合
    List<College> collegeList;

    public OutPutImpl(List<College> collegeList){
        this.collegeList = collegeList;
    }

    //遍历所有学院然后地调用printDepartment输出各个学院的系
    public void printCollege(){
        //从college取出所有学院
        Iterator<College> iterator = collegeList.iterator();
        while (iterator.hasNext()){
            //取出一个学院
            College next = iterator.next();
            System.out.println("学院名称"+next.getName());
            //得到对应的迭代器
            printDepartment(next.createIterator());
        }
    }

    //输出 学院输出系
    public void printDepartment(Iterator iterator){
        while (iterator.hasNext()){
           Department department = (Department) iterator.next();
            System.out.println(department.getName());
        }
    }
}
~~~

~~~java
public class Client {
    public static void main(String[] args) {
        //创建学院
        ArrayList<College> colleges = new ArrayList<>();
        ComputerCollege computerCollege = new ComputerCollege();
        InfoCollege infoCollege = new InfoCollege();

        colleges.add(computerCollege);
        colleges.add(infoCollege);

        OutPutImpl outPut = new OutPutImpl(colleges);
        outPut.printCollege();
    }
}
~~~

> JDK源码

JDK的ArrayList 集合中就使用了迭代器模式

> 注意事项和细节

- 优点
  1. 提供一个统一-的方法遍历对象，客户不用再考虑聚合的类型，使用一种方法就可以遍历对象了。
  2. 隐藏了聚合的内部结构，客户端要遍历聚合的时候只能取到迭代器，而不会知道聚合的具体组成。
  3. 提供了一种设计思想，就是一个类应该只有一个引起变化的原因(叫做单一责任
     原则)。在聚合类中，我们把迭代器分开，就是要把管理对象集合和遍历对象集合的责任分开，这样一来集合改变的话，只影响到聚合对象。而如果遍历方式改变的话，只影响到了迭代器。
  4. 当要展示一组相似对象，或者遍历一组相同对象时使用，适合使用迭代器模式
- 缺点
  - 每个聚合对象都要一个迭代器，会生成多个迭代器不好管理类

### 16，观察者模式

> 项目需求

- 气象站可以将每天测量到的温度，湿度，气压等等以公告的形式发布出去(比如发布到自己的网站或第三方)。
- 需要设计开放型API，便于其他第三方也能接入气象站获取数据。
- 提供温度、气压和湿度的接口
- 测量数据更新时，要能实时的通知给第三方

> 传统方式问题分析

1. 其他第三方接入气象站获取数据的问题
2. 无法在运行时动态的添加第三方

> 原理

观察者模式:对象之间多对一依赖的一种设计方案，被依赖的对象为Subject,依赖的对象为Observer, Subject通 知Observer变化,比如这里的网站是Subject,是1的一方。用户是Observer,是多的一方。

> 代码

~~~java
public class CurrentConditions implements Observer {
    //温度，气压，湿度
    private float temperature;
    private float pressure ;
    private float humidity;

    //更新天气情况，是由WeatherData来调用，我使用推送模式
    @Override
    public void update(Float temperature, Float pressure, Float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

    //显示
    public void display(){
        System.out.println("温度："+temperature);
        System.out.println("气压："+pressure);
        System.out.println("湿度："+humidity);
    }

}
~~~

~~~java
public interface Observer {
    public void update(Float temperature,Float pressure, Float humidity);
}
~~~

~~~java
//让WeaterData来实现
public interface Subject {
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObserver();
}
~~~

~~~java
public class WeatherData implements Subject {
    private float temperature;
    private float pressure ;
    private float humidity;
    //观察者集合
    private ArrayList<Observer> observers;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public void dataChange(){
        notifyObserver();
    }

    public void setData(Float temperature, Float pressure, Float humidity){
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        dataChange();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        //遍历所有的观察者并通知
        observers.forEach(observer -> {
            observer.update(this.temperature,this.pressure,this.humidity);
        });
    }
}
~~~

~~~java
public class Client {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditions currentConditions = new CurrentConditions();
        weatherData.registerObserver(currentConditions);
        //通知各个注册的观察者
        weatherData.setData(10f,20f,20f);
    }
}
~~~

> 源码

JDK中的Observable使用到了观察者模式

### 17，中介者模式

> 智能家庭项目

1. 智能家庭包括各种设备，闹钟，咖啡机，电视机，窗帘等
2. 主人要看电视时，各个设备可以协同工作，自动完成看电视的准备工作，比如流程为:闹铃响起->咖啡机开始做咖啡->窗帘自动落下->电视机开始播放

> 传统的方式的问题分析

1. 当各电器对象有名种状态改变时，相互之间的调用关系会比较复杂
2. 各个电器对象彼此联系，你中有我，我中有你，不利于松耦合.
3. 各个电器对象之间所传递的消息(参数)，容易混乱
4. 当系统增加一个新的电器对象时，或者执行流程改变时，代码的可维护性、扩展性都不理想=>考虑中介者模式

>基本介绍

1. 中介者模式(Mediator Pattern)，用一个中介对象来封装一系列的对 象交互。中介者使各个对象不需要显式地相互引用，从而使其耦合松散，而且可以独立地改变它们之间的交互
2. 中介者模式属于行为型模式，使代码易于维护
3. 比如MVC模式，C (Controller控制器)是M (Model模型)和V (View视图)的中介者，在前后端交互时起到了中间人的作用

>角色

1. Mediator 就是抽象中介者，定义了同事对象到中介者对象的接口
2. Colleague 是抽象同事类
3. ConcreteMediator 具体的中介者对象，实现抽象方法，他需要知道多有的具体的同事类，即一个集合来管理HashMap并接受某个同事对象消息，完成相应的任务
4. ConcreteColleague 具体的同事类，会有很多，每个同事只知道自己的行为，而不了解其他同事类的行为，但是他们都依赖中介者对象

> 代码

~~~java
public abstract class Colleague {
    private Mediator mediator;
    public String name;

    public Colleague(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public Mediator getMediator() {
        return mediator;
    }

    public  abstract void SendMessage(int stateChange);
}

~~~

~~~java
public abstract class Mediator {
    //将中介者对象，加入到集合中
    public abstract void Register(String colleagueName, Colleague colleague);

    //接受消息，具体的对象发出的
    public abstract void getMessage(int stateChange, String colleagueName);

    public abstract void SendMessage();
}
~~~

~~~java
//闹钟
public class Alarm extends Colleague {
    public Alarm(Mediator mediator, String name){
        super(mediator, name);
        mediator.Register(name,this);
    }

    public void SendAlarm(int stateChange){
        SendMessage(stateChange);
    }

    @Override
    public void SendMessage(int stateChange) {
        this.getMediator().getMessage(stateChange, this.name);
    }
}
~~~

~~~java
public class CoffeeMachine extends Colleague {
    public CoffeeMachine(Mediator mediator, String name) {
        super(mediator, name);
        mediator.Register(name, this);
    }

    @Override
    public void SendMessage(int stateChange) {
        this.getMediator().getMessage(stateChange,this.name);
    }

    public void StartCoffee() {
        System.out.println("Coffee Start");
    }

    public void FinishCoffee() {
        System.out.println("Coffee Finish");
    }
}
~~~

~~~java
public class ConcreteMediator extends Mediator {

    private HashMap<String, Colleague> colleagueMap;
    private HashMap<String, String> stringMap;

    public ConcreteMediator() {
        colleagueMap = new HashMap<>();
        stringMap = new HashMap<>();
    }

    @Override
    public void Register(String colleagueName, Colleague colleague) {
        colleagueMap.put(colleagueName, colleague);
        if (colleague instanceof  Alarm){
            stringMap.put("Alarm", colleagueName);
        }else if (colleague instanceof CoffeeMachine){
            stringMap.put("CoffeeMachine", colleagueName);
        }else if (colleague instanceof  TV){
            stringMap.put("TV", colleagueName);
        }else if (colleague instanceof Curtains){
            stringMap.put("Curtains", colleagueName);
        }
    }

    //具体中介着的核心方法
    //根据得到的消息，完成对应的方法
    //中介者在这个方法中，协调各个具体的类
    @Override
    public void getMessage(int stateChange, String colleagueName) {
        if (colleagueMap.get(colleagueName) instanceof Alarm){
            if (stateChange == 0){
                ((CoffeeMachine)(colleagueMap.get(stringMap.get("CoffeeMachine")))).StartCoffee();
                ((TV)(colleagueMap.get(stringMap.get("TV")))).startTv();
            }else if (stateChange == 1){
                ((TV)(colleagueMap.get(stringMap.get("TV")))).stopTv();
            }
        }else if (colleagueMap.get(colleagueName) instanceof CoffeeMachine){
            ((Curtains)(colleagueMap.get(stringMap.get("Curtains")))).upCurtains();
        }else if (colleagueMap.get(colleagueName) instanceof TV){
            //处理待定
        }else if (colleagueMap.get(colleagueName) instanceof Curtains){
            //处理待定
        }
    }

    @Override
    public void SendMessage() {

    }
}
~~~

~~~java
public class Curtains  extends Colleague{
    public Curtains(Mediator mediator, String name) {
        super(mediator, name);
        mediator.Register(name,this);
    }

    @Override
    public void SendMessage(int stateChange) {
        this.getMediator().getMessage(stateChange,this.name);
    }

    public void upCurtains(){
        System.out.println("I am holding Up Curtains");
    }
}
~~~

~~~java
public class TV extends Colleague {

    public TV(Mediator mediator, String name) {
        super(mediator, name);
        mediator.Register(name, this);
    }

    @Override
    public void SendMessage(int stateChange) {
        this.getMediator().getMessage(stateChange, this.name);
    }
    public void startTv(){
        System.out.println("TV start");
    }

    public void stopTv(){
        System.out.println("TV stop");
    }
}
~~~

~~~java
public class Client {
    public static void main(String[] args) {
        //创建一个中介者对象
        Mediator mediator = new ConcreteMediator();
        //创建一个Alarm 将自己加入到ConcreteMediator中
        Alarm alarm = new Alarm(mediator,"Alarm");
        CoffeeMachine coffeeMachine = new CoffeeMachine(mediator , "CoffeeMachine");
        Curtains curtains = new Curtains (mediator, "Curtains");
        TV tV = new TV(mediator, "TV");
        alarm.SendAlarm(0);
        coffeeMachine.FinishCoffee();
        alarm. SendAlarm(1);

    }
}
~~~

### 18，备忘录模式

> 游戏角色状态回复问题

游戏角色有攻击力和防御力，在大战Boss前保存自身的状态(攻击力和防御力)，当大战Boss后攻击力和防御力下降，从备忘录对象恢复到大战前的状态

> 基本介绍

1. 备忘录模式(Memento Pattern) 在不破坏封装性的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态。这样以后就可将该对象恢复到原先保存的状态
2. 可以这样理解备忘录模式:现实生活中的备忘录是用来记录某些要去做的事情，或者是记录已经达成的共同意见的事情，以防忘记了。而在软件层面，备忘录模式有着相同的含义，备忘录对象主要用来记录一个对象的某种状态，或者某些数据，当要做回退时，可以从备忘录对象里获取原来的数据进行恢复操作
3. 备忘录模式属于行为型模式

> 代码

~~~java
public class Caretaker {
    private List<Memento> mementoList = new ArrayList<>();

    public void add(Memento memento){
        mementoList.add(memento);
    }

    public Memento get(int index){
        return mementoList.get(index);
    }
}
~~~

~~~java
public class Originator {
    private String state; //状态信息

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    //编写一个方法，可以保存一个状态对象 Memento
    public Memento saveStateMemento(){
        return new Memento(state);
    }
    //通过备忘录对象 恢复状态
    public void getStartFromMemento(Memento memento){
        state = memento.getState();
    }
}
~~~

~~~java
public class Memento {
    private String state; //状态信息

    public String getState() {
        return state;
    }

    public Memento(String state) {
        super();
        this.state = state;
    }
}
~~~

~~~java
public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();

        Caretaker caretaker = new Caretaker();

        originator.setState("状态一 LV 1");
        caretaker.add(originator.saveStateMemento());

        originator.setState("状态二 LV 2");
        caretaker.add(originator.saveStateMemento());

        originator.setState("状态三 LV 1");
        caretaker.add(originator.saveStateMemento());

        System.out.println("当前状态"+originator.getState());
        //希望回到状态二
        originator.getStartFromMemento(caretaker.get(1));
        System.out.println("恢复到状态二："+originator.getState());

    }
}
~~~

> 角色

1. originator：对象(需要保存状态的对象)
2. Memento: 备忘录对象，负责保存好记录，即originator内部状态
3. caretaker: 守护者对象，负责保存多个备忘录对象，使用集合存储，提高效率

> 游戏角色恢复实例代码

~~~java
public class Memento {
    //攻击力
    private int vit;
    //防御力
    private int def;

    public Memento(int vit, int def) {
        this.vit = vit;
        this.def = def;
    }

    public int getVit() {
        return vit;
    }

    public void setVit(int vit) {
        this.vit = vit;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }
}
~~~

~~~java
//守护者对象，保存游戏角色状态
public class Caretaker {
    //如果只保存一次状态
    private Memento memento;
    //对GameRole 保存对此状态
    private ArrayList<Memento> mementos;
    //对多个游戏角色保存多个状态
    private HashMap<String, ArrayList<Memento>> listHashMap;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }

    public ArrayList<Memento> getMementos() {
        return mementos;
    }

    public void setMementos(ArrayList<Memento> mementos) {
        this.mementos = mementos;
    }

    public HashMap<String, ArrayList<Memento>> getListHashMap() {
        return listHashMap;
    }

    public void setListHashMap(HashMap<String, ArrayList<Memento>> listHashMap) {
        this.listHashMap = listHashMap;
    }
}
~~~

~~~java
public class GameRole {
    private int vit;
    private int def;

    //创建Memento 即根据当前的状态得到Memento
    public Memento createMemento(){
        return new Memento(vit,def);
    }

    //从备忘录对象恢复状态
    public void recoverGameRoleFromMemento(Memento memento){
        this.vit = memento.getVit();
        this.def = memento.getDef();
    }
    //显示当前角色的状态
    public void display(){
        System.out.println("游戏角色当前的攻击力:"+this.vit + "防御力："+this.def);

    }

    public int getVit() {
        return vit;
    }

    public void setVit(int vit) {
        this.vit = vit;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }
}
~~~

~~~java
public class Client {
    public static void main(String[] args) {
        //创建游戏角色
        GameRole gameRole = new GameRole();
        gameRole.setVit(100);
        gameRole.setDef(100);

        System.out.println("干架前");
        gameRole.display();

        //保存当前状态到caretaker
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(gameRole.createMemento());

        System.out.println("干架后");
        gameRole.setVit(30);
        gameRole.setDef(30);
        gameRole.display();

        System.out.println("恢复到干架前");
        gameRole.recoverGameRoleFromMemento(caretaker.getMemento());
        gameRole.display();
    }
}
~~~

> 注意事项和细节

1. 给用户提供了一种可以恢复状态的机制，可以使用户能够比较方便地回到某个历史的状态
2. 实现了信息的封装，使得用户不需要关心状态的保存细节
3. 如果类的成员变量过多，势必会占用比较大的资源，而且每一次保存都会消耗一定的内存，这个需要注意
4. 适用的应用场景: 1、后悔药。2、 打游戏时的存档。3、 Windows里的ctri +Z,。4、IE中的后退。4、 数据库的事务管理
5. 为了节约内存，备忘录模式可以和原型模式配合使用

### 19，解释器模式

> 四则运算问题

通过解释器模式来实现四则远算，如计算a+b+c的值，具体要求

1. 先输入表达式的形式，比如a+b+c-d+e, 要求表达式的字母不能重复
2. 再分别输入a ,b, c,d,e的值
3. 最后求出结果

> 基本介绍

1. 在编译原理中，一个算术表达式通过词法分析器形成词法单元，而后这些词法单元再通过语法分析器构建语法分析树，最终形成- 颗抽象的语法分析树。这里的词法分析器和语法分析器都可以看做是解释器
2. 解释器模式(Interpreter Pattern) :是指给定一个语言(表达式)，定义它的文法的一种表示，并定义一个解释器，使用该解释器来解释语言中的句子(表达式)
3. 应用场景
   - 应用可以将一个需要解释执行的语言中的句子表示为一个抽象语法树
   - 一些重复出现的问题可以用一种简单的语言来表达
   - 一个简单语法需要解释的场景
4. 这样的例子还有编译器、运算表达式计算、正则表达式、机器人等

> 角色

1. Context:是环境角色，含有解释器之外的全局信息
2. AbstractExpression:抽象表达式，声明一个抽象的解释操作，这个方法为抽象语法树中的所有节点所共享
3. TerminalExpression:为终结符表达式，实现与文法中的终结符相关的解释操作
4. NonTermialExpression:为非终结符表达式，实现与文法中的非终结符相关的解释操作

> 实现四则运算代码

~~~java
//加法解析器
public class AddExpression extends SymbolExpression {

    public AddExpression(Expression left, Expression right) {
        super(left, right);
    }

    //处理相加
    public int interpreter (HashMap<String,Integer> var) {
        return super.left.interpreter(var) + super.right.interpreter(var);
    }
}
~~~

~~~java
public class Calculator {
    //定义表达式
    private Expression expression;
    //构造函数传参，并解析
    public Calculator(String expStr){
        //安排运算先后顺序
        Stack<Expression> stack = new Stack<>();
        //表达式拆分成字符数组
        char[] charArray = expStr.toCharArray();
        Expression left = null;
        Expression right = null;
        for (int i = 0; i < charArray.length; i++) {
            switch (charArray[i]){
                case '+':
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(charArray[++i]));
                    stack.push(new AddExpression(left,right));
                    break;
                case '-':
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(charArray[++i]));
                    stack.push(new SubExpression(left,right));
                    break;
                default:
                    stack.push(new VarExpression(String.valueOf(charArray[i])));
                    break;
            }
        }
        //当遍历完整个charArray数组后，stack就得到最后Expression
        this.expression = stack.pop();
    }
    public int run(HashMap<String, Integer> var) {
        //最后将表达式和var绑定
        return this.expression.interpreter(var);
    }
}
~~~

~~~java
//抽象类表达式，通过HashMap键值对，可以获取到变量的值
public abstract class Expression {
    //解释公式和数值，key 就是公式(表达式)，参数[a,b,c] value 就是具体的值
    //HashMap {a=10,b=20}
    public abstract int interpreter(HashMap<String, Integer> var);
}
~~~

~~~java
public class SubExpression extends SymbolExpression {
    public SubExpression(Expression left, Expression right) {
        super(left, right);
    }

    public int interpreter (HashMap<String,Integer> var) {
        return super.left.interpreter(var) - super.right.interpreter(var);
    }
}
~~~

~~~java
//每个运算符号解析器，每个运算符号，都只和自己左右两个数字有关系
//但左右两个数字有可能也是一个解析的结果，无论何种类型，都是Expression类的实现类
public class SymbolExpression extends Expression{
    protected Expression right;
    protected Expression left;

    public SymbolExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    //因为SymbolExpression是让其子类来实现，因此inferpreter是默认实现
    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return 0;
    }
}
~~~

~~~java
//变量的解析器
public class VarExpression extends Expression {
    private String key;

    public VarExpression(String key) {
        this.key = key;
    }

    //interpreter根据变量的名称返回对应值
    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return var.get(this.key);
    }
}
~~~

~~~java
public class Client {
    public static void main(String[] args) throws IOException {
        String expStr = getExpStr();
        HashMap<String, Integer> var = getValue(expStr);
        Calculator calculator = new Calculator(expStr);
        System.out.println("运算结果:"+ expStr + "=" + calculator.run(var));
    }

    //获取值映射
    private static HashMap<String, Integer> getValue(String expStr) throws IOException {
        HashMap<String, Integer> map = new HashMap<>();
        for (char ch : expStr.toCharArray()){
            if (ch != '+' && ch != '-'){
                if (!map.containsKey(String.valueOf(ch))){
                    System.out.print("请输入" + String.valueOf(ch) + "的值：");
                    String in = (new BufferedReader(new InputStreamReader(System.in))).readLine();
                    map.put(String.valueOf(ch), Integer.valueOf(in));
                }
            }
        }
        return map;
    }
    //获取表达式
    public static String getExpStr() throws IOException {
        System.out.print("请输入表达式: ");
        return (new BufferedReader(new InputStreamReader(System.in))).readLine();
    }
}
~~~

> 源码

Spring框架中的SpelExpressionParser就使用到了解释器模式

> 注意细节

1. 当有一个语言需要解释执行，可将该语言中的句子表示为一个抽象语法树就可以考虑使用解释器模式，让程序具有良好的扩展性
2. 应用场景:编译器、运算表达式计算、正则表达式、机器人等
3. 使用解释器可能带来的问题:解释器模式会引起类膨胀、解释器模式采用递归调用方法，将会导致调试非常复杂、效率可能降低.

### 20，状态模式

> APP抽奖活动案例

1. 假如每参加一次这个活动要扣除用户50积分，中奖概率是10%
2. 奖品数量固定，抽完就不能抽奖
3. 活动有四个状态:可以抽奖、不能抽奖、发放奖品和奖品领完

> 基本介绍

1. 状态模式(State Pattern) :它主要用来解决对象在多种状态转换时，需要对外输出不同的行为的问题。状态和行为是一对应的，状态之间可以相互转换
2. 当一个对象的内在状态改变时，允许改变其行为，这个对象看起来像是改变了其类

> 角色

1. Context类为环境角色，用于维护State实例，这个实例定义当前状态
2.  State是抽象状态角色，定义一个接口封装与Context的一个接口特点
3. ConcreteState具体的状态，每个子类实现一个与Context的一个状态相关行为

> 代码

~~~java
//可以抽奖的状态
public class CanRaffleState extends State {
    RaffleActivity raffleActivity;

    public CanRaffleState(RaffleActivity raffleActivity){
        this.raffleActivity = raffleActivity;
    }

    public void deductMoney(){
        System.out.println("已经扣过积分");
    }

    public boolean raffle(){
        System.out.println("正在抽奖，请稍等");
        Random random = new Random();
        int num = random.nextInt(10);
        //10%的中奖机会
        if (num == 0){
            //改变活动状态为发放奖品
            raffleActivity.setState(raffleActivity.getDispenseState());
            return true;
        }else {
            System.out.println("很遗憾没有抽中奖");
            //修改状态为不能抽奖
            raffleActivity.setState(raffleActivity.getNoRaffleState());
            return false;
        }
    }

    @Override
    public void dispensePrize() {
        System.out.println("没中奖，不能发放奖品");
    }
}
~~~

~~~java
//奖品发放完毕状态
//当我们的activity改变成DispenseOutState抽奖活动结束
public class DispenseOutState extends State {
    //初始化时传入活动引用
    RaffleActivity activity;

    public DispenseOutState(RaffleActivity activity) {
        this.activity = activity;
    }

    @Override
    public void deductMoney() {
        System.out.println("奖品发送完了，请下次再参加");
    }

    @Override
    public boolean raffle() {
        System.out.println("奖品发送完了，请下次再参加");
        return false;
    }

    @Override
    public void dispensePrize() {
        System.out.println("奖品发送完了，请下次再参加");
    }
}
~~~

~~~java
public class DispenseState extends State {
    //初始化时传入活动引用，发放奖品后改变其状态
    RaffleActivity activity;

    public DispenseState(RaffleActivity activity) {
        this.activity = activity;
    }

    @Override
    public void deductMoney() {
        System.out.println("不能扣除积分");
    }

    @Override
    public boolean raffle() {
        System.out.println("不能抽奖");
        return false;
    }

    @Override
    public void dispensePrize() {
        if (activity.getCount() > 0) {
            System.out.println("恭喜中奖了");
//          改变状态为不能抽奖
            activity.setState(activity.getNoRaffleState());
        } else {
            System.out.println("很遗憾，奖品发送完了");
//          改变状态为奖品发放完毕
            activity.setState(activity.getDispenseOutState());
        }
    }
}
~~~

~~~java
//不能抽奖的状态
public class NoRaffleState extends State {

    //初始化时传入活动引用，扣除积分后改变其状态
    RaffleActivity raffleActivity;

    public NoRaffleState(RaffleActivity raffleActivity) {
        this.raffleActivity = raffleActivity;
    }

//    当前状态是可以扣积分的扣除后将状态变为可以抽奖状态
    @Override
    public void deductMoney() {
        System.out.println("扣除50积分成功，你可以抽奖了");
        raffleActivity.setState(raffleActivity.getCanRaffleState());
    }

    @Override
    public boolean raffle() {
        System.out.println("扣除积分后才能抽奖");
        return false;
    }

    @Override
    public void dispensePrize() {
        System.out.println("不能发放奖金");
    }
}
~~~

~~~java
public class RaffleActivity {

    State state = null;
    int count = 0;
    State noRaffleState = new NoRaffleState(this);
    State canRaffleState = new CanRaffleState(this);
    State dispenseState = new DispenseState(this);
    State dispenseOutState = new DispenseOutState(this);

    public RaffleActivity(int count) {
        this.state = getNoRaffleState();
        this.count = count;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getCount() {
        int curCount = count;
        count--;
        return curCount;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public State getNoRaffleState() {
        return noRaffleState;
    }

    public void setNoRaffleState(State noRaffleState) {
        this.noRaffleState = noRaffleState;
    }

    public State getCanRaffleState() {
        return canRaffleState;
    }

    public void setCanRaffleState(State canRaffleState) {
        this.canRaffleState = canRaffleState;
    }

    public State getDispenseState() {
        return dispenseState;
    }

    public void setDispenseState(State dispenseState) {
        this.dispenseState = dispenseState;
    }

    public State getDispenseOutState() {
        return dispenseOutState;
    }

    public void setDispenseOutState(State dispenseOutState) {
        this.dispenseOutState = dispenseOutState;
    }

    public void debuctMoney() {
        state.deductMoney();
    }

    public void raffle() {
        if (state.raffle()){
            state.dispensePrize();
        }
    }
}
~~~

~~~java
//这里是一个抽象类，也可以是一个接口
//
public abstract class State {
//    扣除积分
    public abstract void deductMoney();
//    是否抽中奖品
    public abstract boolean raffle();
//    发放奖品
    public abstract void dispensePrize();
}
~~~

~~~java
public class Client {
    public static void main(String[] args) {
        //创建活动对象 奖池有5个奖品
        RaffleActivity activity = new RaffleActivity(1);

        //连续抽奖3次
        for (int i = 0; i < 10; i++){
            System.out.println("====第" + (i+1) + "次抽奖====");
            //参加抽奖 第一步点击扣除积分
            activity.debuctMoney();
            //第二次抽奖
            activity.raffle();
        }
    }
}
~~~

> 注意细节

1. 代码有很强的可读性。状态模式将每个状态的行为封装到对应的一个类中
2. 方便维护。将容易产生问题的if-else语句删除了，如果把每个状态的行为都放到一个类中，每次调用方法时都要判断当前是什么状态，不但会产出很多if-else语句，而且容易出错
3. 符合“开闭原则”。容易增删状态
4. 会产生很多类。每个状态都要- 一个对应的类，当状态过多时会产生很多类，加大维
   护难度
5. 当一个事件或者对象有很多种状态，状态之 间会相互转换，对不同的状态要求有不同的行为的时候，可以考虑使用状态模式

### 21，策略模式

> 一个鸭子项目

1. 有各种鸭子(比如野鸭，北京鸭，水鸭等，鸭子有各种行为，比如叫，飞行等)
2. 显示鸭子的信息

> 传统继承方式的问题

1. 其它鸭子，都继承了Duck类，所以fly让所有子类都会飞了，这是不正确的
2. 上面说的1的问题，其实是继承带来的问题:对类的局部改动，尤其超类的局部改动，会影响其他部分。会有溢出效应
3. 为了改进1问题，我们可以通过覆盖fly方法来解决=>覆盖解决
4. 问题又来了，如果我们有一个玩具鸭子ToyDuck,这样就需要ToyDuck去覆盖Duck的所有实现的方法=>解决思路策略模式(strategy patterm)

> 基本介绍

1. 策略模式(Strategy Pattern)中，定义算法族，分别封装起来，让他们之间可以互相替换，此模式让算法的变化独立于使用算法的客户
2. 这算法体现了几个设计原则，第一、把变化的代码从不变的代码中分离出来;第二、针对接口编程而不是具体类(定义了策略接口) ;第三、多用组合/聚合，少用继承(客户通过组合方式使用策略) 

> 代码

~~~java
public class BadFlyBehavior implements FLyBehavior {
    @Override
    public void fly() {
        System.out.println("鸭子飞的一般");
    }
}
~~~

~~~java
public abstract class Duck {

    //属性，策略接口
    FLyBehavior fLyBehavior;

    public Duck() {
    }

    public abstract void display();

    public void fly(){
        if (fLyBehavior != null){
            fLyBehavior.fly();
        }
    }
}
~~~

~~~java
public interface FLyBehavior {
    public void fly();
}
~~~

~~~java
public class GoodFlyBehavior  implements FLyBehavior{
    @Override
    public void fly() {
        System.out.println("鸭子飞的很好");
    }
}
~~~

~~~java
public class NoFlyBehavior implements FLyBehavior{
    @Override
    public void fly() {
        System.out.println("鸭子不会飞");
    }
}
~~~

~~~java
public class PekingDuck extends Duck{

    public PekingDuck() {
        fLyBehavior = new BadFlyBehavior();
    }

    @Override
    public void display() {
        System.out.println("北京鸭");
    }
}
~~~

~~~java
public class ToyDuck extends Duck {

    //构造器，传入FlyBehavior的对象
    public ToyDuck() {
        fLyBehavior = new NoFlyBehavior();
    }

    @Override
    public void display() {
        System.out.println("这是玩具鸭");
    }
}
~~~

~~~java
public class WildDuck extends Duck {

    //构造器，传入FlyBehavior的对象
    public WildDuck(){
        fLyBehavior = new GoodFlyBehavior();
    }

    @Override
    public void display() {
        System.out.println("这是野鸭");
    }
}
~~~

~~~java
public class Client {
    public static void main(String[] args) {
        WildDuck wildDuck = new WildDuck();
        wildDuck.display();
        wildDuck.fly();

        ToyDuck toyDuck = new ToyDuck();
        toyDuck.display();
        toyDuck.fly();

        PekingDuck pekingDuck = new PekingDuck();
        pekingDuck.display();
        pekingDuck.fly();
    }
}
~~~

> 源码

JDK在Arrays的 Comparator就使用了策略模式

> 注意细节

1. 策略模式的关键是:分析项目中变化部分与不变部分
2. 策略模式的核心思想是:多用组合/聚合少用继承;用行为类组合，而不是行为的继承。更有弹性
3. 体现了“对修改关闭，对扩展开放”原则，客户端增加行为不用修改原有代码，只要添加一种策略(或者行为)即可，避免了使用多重转移语句(if. else if..else)
4. 提供了可以替换继承关系的办法:策略模式将算法封装 在独立的Strategy类中使得你可以独立于其Context改变它，使它易于切换、易于理解、易于扩展
5. 需要注意的是:每添加一个策略就要增加一个类，当策略过多是会导致类数目庞大

### 22，职责链模式

> 学校OA系统的采购审批项目

1. 采购员采购教学器材
2. 如果金额小于等于5000,由教学主任审批(0<=x<=5000)
3. 如果金额小于等于10000,由院长审批(5000<x<=10000)
4. 如果金额小于等于30000,由副校长审批(10000<x<=30000)
5. 如果金额超过30000以上，有校长审批(x>30000)

> 传统方案分析

1. 传统方式是:接收到一个采购请求后，根据采购金额来调用对应的Approver (审批人)完成审批。
2. 传统方式的问题分析:客户端这里会使用到分支判断(比如switch) 来对不同的采购请求处理，这样就存在如下问题 (1)如果各个级别的人员审批金额发生变化，在客户端的也需要变化(2)客户端必须明确的知道有多少个审批级别和访问
3. 这样对一个采购请求进行处理和Approver (审批人)就存在强耦合关系，不利于代码的扩展和维护
4. 解决方案=>职责链模式. 

> 基本介绍

1. 职责链模式(Chain of Resposibility Pattern) ,又叫责任链模式，为请求创建了一个接收者对象的链。这种模式对请求的发送者和接收者进行解耦。
2. 职责链模式通常每个接收者都包含对另一个接收者的引用。如果一个对象不能处理该请求，那么它会把相同的请求传给下一个接收者，依此类推。
3. 这种类型的设计模式属于行为型模式

> 原理

- 职责链模式(Chain Of Responsibility)使多个对象都有机会处理请求，从而避免请求的发送者和接收者之间的耦合关.系。将这个对象连成一条链，并沿着这条链传递该请求，直到有一个对象处理它为止。

> 角色

- Handler:抽象的处理者，定义了一个处理请求的接口，同时含义另外Handler
- ConcreteHandlerA, B是具体的处理者，处理他自己负责的请求，可以访问他的后继者，即下一个处理者，如果可以处理当前请求，则处理，否则就将该请求交给后继者处理，从而形成一个职责链
- Request：含有很多属性，表示一个请求

> 代码

~~~java
public abstract class Approver {
    //下一个处理者
    Approver approver;
    //名字
    String name;

    public Approver(String name){
        this.name = name;
    }
    //下一个处理者
    public void setApprover(Approver approver){
        this.approver = approver;
    }
    //处理审批请求的方法 得到一个请求，因此将该方法做成抽象
    public abstract void processRequest(PurchaseRequest purchaseRequest);

}
~~~

~~~java
public class CollegeApprover extends Approver {

    public CollegeApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if (purchaseRequest.getPrice() >= 5000 && purchaseRequest.getPrice() <= 10000){
            System.out.println("请求编号id="+ purchaseRequest.getId() + "被"+this.name+"处理了");
        }else{
            approver.processRequest(purchaseRequest);
        }
    }
}
~~~

~~~java
public class DepartmentApprover extends Approver {

    public DepartmentApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if (purchaseRequest.getPrice() <= 5000){
            System.out.println("请求编号id="+ purchaseRequest.getId() + "被"+this.name+"处理了");
        }else{
            approver.processRequest(purchaseRequest);
        }
    }
}
~~~

~~~java
public class MasterApprover extends Approver {

    public MasterApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if (purchaseRequest.getPrice() >= 10000 && purchaseRequest.getPrice() <= 30000){
            System.out.println("请求编号id="+ purchaseRequest.getId() + "被"+this.name+"处理了");
        }else{
            approver.processRequest(purchaseRequest);
        }
    }
}
~~~

~~~java
public class PurchaseRequest {
    private int type = 0; //请求类型
    private float price = 0.0f;
    private int id = 0;
//构造器
    public PurchaseRequest(int type, float price, int id) {
        this.type = type;
        this.price = price;
        this.id = id;
    }

    public int getType() {
        return type;
    }

    public float getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }
}
~~~

~~~java
public class SchoolMasterApprover extends Approver {

    public SchoolMasterApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if (purchaseRequest.getPrice() >= 30000){
            System.out.println("请求编号id="+ purchaseRequest.getId() + "被"+this.name+"处理了");
        }else{
            approver.processRequest(purchaseRequest);
        }
    }
}
~~~

~~~java
public class Client {
    public static void main(String[] args) {
        //创建一个请求
        PurchaseRequest purchaseRequest = new PurchaseRequest(1, 31000, 1);
        //创建相关审批人
        DepartmentApprover departmentApprover = new DepartmentApprover("主任");
        CollegeApprover collegeApprover = new CollegeApprover("院长");
        MasterApprover masterApprover = new MasterApprover("副校长");
        SchoolMasterApprover schoolMasterApprover = new SchoolMasterApprover("校长");

        //将各个审批的下一个人设置好 处理人构成环状
        departmentApprover.setApprover(collegeApprover);
        collegeApprover.setApprover(masterApprover);
        masterApprover.setApprover(schoolMasterApprover);
        schoolMasterApprover.setApprover(departmentApprover);

        departmentApprover.processRequest(purchaseRequest);
    }
}
~~~

> 源码

Spring MVC HanderExecutionChain类就使用到了职责链模式

> 注意细节

1. 将请求和处理分开，实现解耦，提高系统的灵活性
2. 简化了对象，使对象不需要知道链的结构
3. 性能会受到影响，特别是在链比较长的时候，因此需控制链中最大节点数量，一般通过在Handler中设置-一个最大节点数量，在setNext()方 法中判断是否已经超过阀值,超过则不允许该链建立，避免出现超长链无意识地破坏系统性能
4. 调试不方便。采用了类似递归的方式，调试时逻辑可能比较复杂
5. 最佳应用场景:有多个对象可以处理同一个请求时，比如:多级请求、请假/加薪等审批流程、Java Web中Tomcat对Encoding的处理、拦截器

