package com.company;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/*


Вывести на экран квадрат из 10х10 букв S используя цикл while.
Буквы в каждой строке не разделять.
Пример вывода на экран:
SSSSSSSSSS
SSSSSSSSSS
SSSSSSSSSS
SSSSSSSSSS
SSSSSSSSSS
SSSSSSSSSS
SSSSSSSSSS
SSSSSSSSSS
SSSSSSSSSS
SSSSSSSSSS
Требования:
1. Программа не должна считывать текст c клавиатуры.
2. Программа должна выводить текст на экран.
3. Программа должна выводить квадрат из 10х10 букв S
4. В программе должен использоваться цикл while.


*/

public class Main {
    public static void main(String[] args) throws Exception {
        String s = "S";
        int a = 10;
        int b = 10;
        while(a > 0) {
            while(b > 0) {
                System.out.print(s);
                b--;
            }
            b = 10;
            System.out.println();
            a--;
        }
    }
}

