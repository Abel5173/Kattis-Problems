import cypari
from math import gcd, sqrt
from itertools import compress


def factors(n):
    return set(sum([[i, n//i] for i in range(1, int(n**0.5)+1) if not n % i], []))


def factors(n):
    divisors = cypari.pari('divisors({})'.format(n))
    return divisors


n = int(input())
l = factors(n)
s = 0
x = 1
for i in l:
    for j in l:
        s += gcd(i, j)
print(s)
