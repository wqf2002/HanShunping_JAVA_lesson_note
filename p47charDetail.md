#字符类型（char）
##字符类型使用细节
####1、字符常量是用单引号（’‘）括起来的单个字符。例如：
```
char c1 = 'a';
char c2 = '中' 
char c3 = '9'
```
####2、Java中还允许使用转义字符‘\’来将其后的字符转变为特殊字符型常量。例如：  
```
char c4 = '\n; //'\n'表示换行符
```
####3、在java中char的本质是一个整数，在输出时，是Unicode码对应的字符。
```
char c1 = 97;
System.out.println(c1); //输出a
char c2 = 'a'
```
###[点击该按钮可进行编码转换](http://tool.chinaz.com/Tools/Unicode.aspx)
####4、可以直接给char赋一个整数，然后输出时，会按照对应的unicode字符输出[97]
```
//要输出对应的数字，可以（int）字符
char c1 = 'a';
System.out.println((int)c1);//输出97
char c2 = '韩';
System.out.println((int)c2);//输出38889
char c3 = '38889';
System.out.println((int)c2);//输出韩
```
####5、char类型是可以进行运算的，相当于一个整数，因为他都对应有Unicode码。
```
System.out.println('a' + 10); //先将a转换为97，输出结果为107
```
>测试  
>```
>char c1 = 'b' + 1; //98+1==>99
>System.out.println((int)c1); //99
>System.out.println(c1); //99->对应字符->编码表ASCII
>```
