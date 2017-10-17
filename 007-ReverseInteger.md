# 007 - Reverse Integer
---

Reverse digits of an integer.

Example1: x = 123, return 321 Example2: x = -123, return -321

click to show spoilers.

Note: The input is assumed to be a 32-bit signed integer. Your function should return 0 when the reversed integer overflows.


## Python

*	int溢出
*	字符串反转
*	幂运算

```
def reverse(self, x):

    """
    :type x: int
    :rtype: int
    """

    self.x = x

    if x < 0:
        y = -1*int(str(-x)[::-1])
    elif x >= 0:
        y = int(str(x)[::-1])

    if y > pow(2,31)-1 or y < -pow(2,31):
        y = 0

    return y
```

## Java

*	除法配合模 位运算

```
public int reverse(int x) {
    long res = 0; 
    while (x != 0) {
        res = res * 10 + x % 10;
        x = x / 10;
    }
    if(res >Integer.MAX_VALUE|| res < Integer.MIN_VALUE) return 0;
    return (int)res;

}
```