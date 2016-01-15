package me.jonathanhuang.fizzbozznacci;

import me.jonathanhuang.fibonacci.fibonacci;

/**
 * Output first 100 fibonacci numbers starting from 1 [1,1,2,3,5,8,13,...]
 * If divisible by 2 and 3 [divisible by 6] then output FiboNacci instead of number
 * If divisible by 2 then output Fibo instead of number
 * If divisible by 3 then output Nacci instead of number
 * 
 * @author Jon
 *
 */

public class fizzbozznacci {
	static fibonacci fib = new fibonacci();
	
	public static void main(String[]args) {
		for (int i=1; i<=100; i++) {
			if(fib.check(i)%6==0) {
				System.out.println("FiboNacci");
			} else if(fib.check(i)%3==0) {
				System.out.println("Nacci");
			} else if(fib.check(i)%2==0) {
				System.out.println("Fibo");
			} else {
				System.out.println(fib.check(i));
			}
		}
	}
}

/*
Expected Output

1
1
Fibo
Nacci
5
Fibo
13
Nacci
Fibo
55
89
FiboNacci
233
377
Fibo
Nacci
1597
Fibo
4181
Nacci
Fibo
17711
28657
FiboNacci
75025
121393
Fibo
Nacci
514229
Fibo
1346269
Nacci
Fibo
5702887
9227465
FiboNacci
24157817
39088169
Fibo
Nacci
165580141
Fibo
433494437
Nacci
Fibo
1836311903 <-- Int breaks after this
2971215073
FiboNacci
7778742049
12586269025
Fibo
Nacci
53316291173
Fibo
139583862445
Nacci
Fibo
591286729879
956722026041
FiboNacci
2504730781961
4052739537881
Fibo
Nacci
17167680177565
Fibo
44945570212853
Nacci
Fibo
190392490709135
308061521170129
FiboNacci
806515533049393
1304969544928657
Fibo
Nacci
5527939700884757
Fibo
14472334024676221
Nacci
Fibo
61305790721611591
99194853094755497
FiboNacci
259695496911122585
420196140727489673
Fibo
Nacci
1779979416004714189
Fibo
4660046610375530309
Nacci
Fibo
19740274219868223167
31940434634990099905
FiboNacci
83621143489848422977
135301852344706746049
Fibo
Nacci

*/