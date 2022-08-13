import math


T = int(input())
for i in range(T):
    n = int(input())
    print(math.factorial(n) % 10)
