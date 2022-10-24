from math import gcd


g, l = map(int, input().split())
n = g * l
for i in range(1, n+1):
    if (n % i == 0):
        a = i
        b = n // i
        x = gcd(a, b)
        if (x == g and l % a == 0 and l % b == 0):
            print(a, b)
