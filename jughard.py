from math import gcd


n = int(input())
for i in range(n):
    a, b, c = map(int, input().split())
    if c % gcd(a, b) == 0:
        print('Yes')
    else:
        print('No')
