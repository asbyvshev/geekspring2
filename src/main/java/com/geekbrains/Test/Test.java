package com.geekbrains.Test;

public class Test {

}



//class Test1 {
//    public static void main(String[] args) {
//        System.out.println(1 % 2 == 1);
//    }
//}

//
//        а) true
//        b) false
//        c) 1
//        d) Ошибка компиляции
//








//   2 Какой будет результат выполнения следующего кода
//

//class Test1 {
//    public static void main(String[] args) {
//        String str = "abc";
//
//        switch (str) {
//        case "ab":
//        System.out.println("ab");
//        case "abc":
//        System.out.println("abc");
//        default:
//        System.out.println("break");
//        case "abcd":
//        System.out.println("abcd");
//        }
//    }
//}
//
//        а)  abc
//        b)  abc  break  abcd
//        c) abc  abcd
//        d) Ошибка компиляции
//
//












// 3 Какой будет результат выполнения следующего кода
//
//class Test1 {
//    public static void main(String[] args) {
//
//        {
//        int i = 20;
//        }
//        int i = 15;
//
//        System.out.println(i);
//        }
//
////        а)  15
////        b)  20
////        c) Ошибка компиляции
//}







// 4 Какой будет результат выполнения следующего кода

//class Test1 {
//    public static void main(String[] args) {
//        for (int i = 0; i < 5; i+=2) {
//        System.out.println(i++);
//        }
//    }
//}

//        а)  0 2 4
//        b)  2 5
//        c) 0 3
//        d)  3













//        5 Какой будет результат выполнения следующего кода
//
//public class Test {
//       public static void main(String[] args) {
//        float d = 12.3;
//        System.out.println(d);
//       }
//}
//        а)  12.3
//        b)  12
//        c) Ошибка при компиляции
//        d) Ошибка при выполнении













//        6 Какой будет результат выполнения следующего кода
//class Test1 {
//        public static void main(String[] args) {
//            int i = 2;
//
//            do {
//            System.out.println(++i);
//            } while (i == 3);
//        }
//}
//        а)  3 4
//        b)  3
//        c)  ничего
//        d)  Ошибка компиляции
//
//
//
//
//
//
//
//
//
//
//
//
//




//        7 Какой будет результат выполнения следующего кода
//class Test1 {
//public static void main(String[] args) {
//        int a = 1;
//        int b = 2;
//        c = a + b;
//        System.out.println(c);
//        }
//}

//        а)  3
//        b)  "3"
//        c)  Ошибка компиляции
//
//








//        8 Какой будет результат выполнения следующего кода
//public class Test {
//public static void main(String[] args) {
//        char d2 = “Java”;
//        System.out.println(d2);
//        }
//}
//
//        а)  Java
//        b)  d2
//        c)  Ошибка компиляции
//











//        9 Какой будет результат выполнения следующего кода
//class Test1 {
//public static void main(String[] args) {
//        int x = 20;
//        String y = "my var: ";
//        x *= x;
//        System.out.println(x + y);
//        }
//}




//        а)  400my var:
//        b)  my var 400
//        c)  Ошибка компиляции
//









//        10 Какой будет результат выполнения следующего кода
//class Test1{
//public static void main(String[] args) {
//        System.out.println(9/0);
//        }
//}
//        а)  Nan
//        b)  Ошибка при выполнении кода
//        c)  Ошибка компиляции









// 11
//class TestEquals {
//    public static void main(String[] args) {
//        Box box1 = new Box(10);
//        Box box2 = new Box(10);
//        System.out.println(box1.equals(box2));
//    }
//}
//
//class Box {
//    int weight;
//
//    public Box(int weight) {
//        this.weight = weight;
//    }
//}















// 12
//-------------------------------------
//class Test2 {
//    public static void main(String[] args) {
//        Integer a1 = 50;
//        Integer a2 = 50;
//        Integer b1 = 500;
//        Integer b2 = 500;
//        System.out.println(a1==a2);
//        System.out.println(b1==b2);
//    }
//}
//-------------------------------------


//////////



// 13


//
//class Test4 {
//    public static void main(String[] args) {
//        int x = 0;
//        int y = 10;
//        do {
//            y--;
//            ++x;
//        } while (x < 5);
//        System.out.print(x + "," + y);
//    }
//}


/////////////////////////















// 14
//
class Test5 {
    public static void main(String[] args) {
        Boolean b1 = new Boolean("true");
        System.out.println(b1);
        b1 = new Boolean("tRuE");
        System.out.println(b1);
        b1 = new Boolean("test");
        System.out.println(b1);
        b1 = new Boolean(true);
        System.out.println(b1);
        b1 = true;
        System.out.println(b1);
    }
}
