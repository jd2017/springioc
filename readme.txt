Spring的控制反转（IOC）：把对象的创建、初始化、销毁等工作交给spring容器来做。由spring容器控制对象的生命周期。
三种创建对象方式：默认的构造函数、静态工厂、实力工厂；
spring容器中，
	启动时，默认情况下，一个bean就会创建一次对象，配置：lazy-init=true时，调用时才会创建；
	默认情况下，bean为单例的对象；当配置scope="prototype"为多例；
	如果一个bean配置了scope="prototype"时，lazy-init值将失效；
	如果在service、dao层声明一个全局变量，单利的对象，会很危险的；
spring 容器执行的顺序：
1，配置文件中
2，执行步骤：
	2.1  启动spring容器
	2.2 spring容器的bean创建对象，除了（scope为prototype，lazy-init=true）;
	2.3 调用init方法，该方法spring内部调用；
	2.4 spring容器中把对象提出来，调用对象方法；
	2.5 spring关闭时，调用destroy方法；（当bean为多利的时候，spring不负责销毁）；